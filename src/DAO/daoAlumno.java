package DAO;

import MODELO.Alumno;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class daoAlumno implements DaoProceso {

    public void registrar(Alumno a) {
        Connection conexion;
        PreparedStatement consulta;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("INSERT INTO alumnos(codigo,dni,nombre,apellido,apoderado) VALUES (?,?,?,?,?)");
            consulta.setString(1, a.getCodigo());
            consulta.setString(2, a.getDni());
            consulta.setString(3, a.getNombre());
            consulta.setString(4, a.getApellido());
            consulta.setString(5, a.getApoderado());
            consulta.executeUpdate();
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public DefaultTableModel consultar(JTable tabla) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        DefaultTableModel modelo = null;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM alumnos");
            resultado = consulta.executeQuery();
            Object datos[] = new Object[5];
            modelo = (DefaultTableModel) tabla.getModel();
            modelo.setRowCount(0);
            while (resultado.next()) {
                datos[0] = resultado.getString("codigo");
                datos[1] = resultado.getString("dni");
                datos[2] = resultado.getString("nombre");
                datos[3] = resultado.getString("apellido");
                datos[4] = resultado.getString("apoderado");
                modelo.addRow(datos);
            }
            tabla.setModel(modelo);
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return modelo;
    }

    public void borrar(String codigo) {
        Connection conexion;
        PreparedStatement consulta;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("DELETE FROM alumnos WHERE codigo=?");
            consulta.setString(1, codigo);
            consulta.executeUpdate();
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public void modificar(String codigo, String apoderado) {
        Connection conexion;
        PreparedStatement consulta;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("UPDATE alumnos set apoderado=? WHERE codigo=?");
            consulta.setString(1, apoderado);
            consulta.setString(2, codigo);
            consulta.executeUpdate();
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            System.out.println("ERRRO: " + e.getMessage());
        }
    }

    @Override
    public Object getConsultarDato(String codigo, String nombreColumnaBD) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void rellenarCombo(JComboBox combo, String nombreTablaBD, String columna) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        try {

            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM " + nombreTablaBD);
            resultado = consulta.executeQuery();
            combo.removeAllItems();
            while (resultado.next()) {
                combo.addItem(resultado.getObject(columna));
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
