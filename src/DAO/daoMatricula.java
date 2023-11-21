package DAO;

import MODELO.Matricula;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class daoMatricula implements DaoProceso {

    public void registrar(Matricula m) {
        Connection conexion;
        PreparedStatement consulta;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("INSERT INTO matricula(idMatricula,dniAlumno,idSeccion,pagado,fecha) VALUES (?,?,?,?,?)");
            consulta.setString(1, m.getIdMatricula());
            consulta.setString(2, m.getAlumno());
            consulta.setString(3, m.getSeccion());
            consulta.setString(4, m.getPagado());
            consulta.setDate(5, m.getFecha());
            consulta.executeUpdate();
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage() + "Error" + JOptionPane.ERROR_MESSAGE);
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
            consulta = conexion.prepareStatement("SELECT * FROM matricula");
            resultado = consulta.executeQuery();
            Object datos[] = new Object[5];
            modelo = (DefaultTableModel) tabla.getModel();
            modelo.setRowCount(0);
            while (resultado.next()) {
                datos[0] = resultado.getString("idMatricula");
                datos[1] = resultado.getString("dniAlumno");
                datos[2] = resultado.getString("idSeccion");
                datos[3] = resultado.getString("pagado");
                datos[4] = resultado.getDate("fecha");
                modelo.addRow(datos);
            }
            tabla.setModel(modelo);
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("ERROR: +" + e.getMessage());
        }
        return modelo;
    }

    public Object getConsultarDato(String tablaBD, String id, String columnaID, String nombreColumnaRetornar) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;

        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM " + tablaBD + " WHERE " + columnaID + "=?");
            consulta.setString(1, id);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                return resultado.getObject(nombreColumnaRetornar);
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return null;
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

    @Override
    public Object getConsultarDato(String codigo, String nombreColumnaBD) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String valorActualID() {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet res;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM matricula ORDER BY idMatricula DESC LIMIT 1;");
            res = consulta.executeQuery();
            if (res.next()) {
                return res.getString("idMatricula");
            }
        } catch (SQLException | NumberFormatException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return "00000000";
    }

    public boolean alumnoExiste(String codigoAlumno) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM matricula WHERE dniAlumno=?");
            consulta.setString(1, codigoAlumno);
            resultado = consulta.executeQuery();
            if (!resultado.next()) {
                return true;
            }
        } catch (SQLException e) {

        }
        return false;
    }

    public void modificar(String idMatricula, String idSeccion, String pagado, Date fecha) {
        Connection conexion;
        PreparedStatement consulta;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("UPDATE matricula set idSeccion=?, pagado=?, fecha=? WHERE idMatricula=?");
            consulta.setString(1, idSeccion);
            consulta.setString(2, pagado);
            consulta.setDate(3, fecha);
            consulta.setString(4, idMatricula);
            consulta.executeUpdate();
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage() + "Error" + JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminar(String idMatricula) {
        Connection conexion;
        PreparedStatement consulta;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("DELETE FROM matricula WHERE idMatricula=?");
            consulta.setString(1, idMatricula);
            consulta.executeUpdate();
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            System.out.println("ERRRO: " + e.getMessage());
        }
    }

}
