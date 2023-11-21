package DAO;

import MODELO.Apoderado;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class daoApoderado implements DaoProceso {

    public void registrar(Apoderado a) {
        Connection conexion;
        PreparedStatement consulta;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("INSERT INTO padresfamilia(dni,nombre,apellido,telefono) VALUES(?,?,?,?)");
            consulta.setString(1, a.getDni());
            consulta.setString(2, a.getNombre());
            consulta.setString(3, a.getApellido());
            consulta.setString(4, a.getTelefono());
            consulta.executeUpdate();
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void borrar(String dniApoderado) {
        Connection conexion;
        PreparedStatement consulta;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("DELETE FROM padresfamilia WHERE dni=?");
            consulta.setString(1, dniApoderado);
            consulta.executeUpdate();
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
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
            consulta = conexion.prepareStatement("SELECT * FROM padresfamilia");
            resultado = consulta.executeQuery();
            Object datos [] = new Object[4];
            modelo = (DefaultTableModel) tabla.getModel();
            modelo.setRowCount(0);
            while (resultado.next()) {
                datos[0] = resultado.getString("dni");
                datos[1] = resultado.getString("nombre");
                datos[2] = resultado.getString("apellido");
                datos[3] = resultado.getString("telefono");
                modelo.addRow(datos);
            }
            tabla.setModel(modelo);
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return modelo;
    }

    @Override
    public Object getConsultarDato(String codigo, String nombreColumnaBD) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
