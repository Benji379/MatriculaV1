package DAO;

import MODELO.Filtros;
import MODELO.Seccion;
import javax.swing.JComboBox;
import java.sql.*;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.HashSet;
import java.util.Set;

public class daoSeccion implements DaoProceso, Filtros {

    public void rellenarCombo(JComboBox combo, String nombreTablaBD, String columna) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        try {

            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM " + nombreTablaBD);
            resultado = consulta.executeQuery();
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

    public void rellenarComboFiltros(JComboBox combo, String nombreTablaBD, String columna) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM " + nombreTablaBD);
            resultado = consulta.executeQuery();

            // Usamos un conjunto para almacenar valores únicos
            Set<Object> valoresUnicos = new HashSet<>();

            while (resultado.next()) {
                valoresUnicos.add(resultado.getObject(columna));
            }

            // Limpiamos el combo antes de agregar los nuevos elementos
            combo.removeAllItems();

            combo.addItem("");
            // Agregamos los valores únicos al combo
            for (Object valor : valoresUnicos) {
                combo.addItem(valor);
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

    @Override
    public DefaultTableModel consultar(JTable tabla) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        DefaultTableModel modelo = null;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM secciones");
            resultado = consulta.executeQuery();
            Object datos[] = new Object[6];
            modelo = (DefaultTableModel) tabla.getModel();
            modelo.setRowCount(0);
            while (resultado.next()) {
                datos[0] = resultado.getString("idSeccion");
                datos[1] = resultado.getString("grado");
                datos[2] = resultado.getString("division");
                datos[3] = resultado.getString("tutor");
                datos[4] = resultado.getString("aula");
                datos[5] = resultado.getDate("fecha");
                modelo.addRow(datos);
            }
            tabla.setModel(modelo);
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return modelo;
    }

    public void registrar(Seccion seccion) {
        Connection conexion;
        PreparedStatement consulta;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("INSERT INTO secciones(idSeccion,grado,division,tutor,aula,fecha) VALUES (?,?,?,?,?,?)");
            consulta.setString(1, seccion.getIdSeccion());
            consulta.setString(2, seccion.getGrado());
            consulta.setString(3, seccion.getDivision());
            consulta.setString(4, seccion.getTutor());
            consulta.setString(5, seccion.getAula());
            consulta.setDate(6, seccion.getFecha());
            consulta.executeUpdate();
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Seleccione un aula diferente", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void actualizar(String tutor, String idSeccion) {
        Connection conexion;
        PreparedStatement consulta;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("UPDATE secciones set tutor=? WHERE idSeccion=?");
            consulta.setString(1, tutor);
            consulta.setString(2, idSeccion);
            consulta.executeUpdate();
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void borrar(String idSeccion) {
        Connection conexion;
        PreparedStatement consulta;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("DELETE FROM secciones WHERE idSeccion=?");
            consulta.setString(1, idSeccion);
            consulta.executeUpdate();
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    @Override
    public void filtroAvanzado(JTable tabla, HashMap<String, String> hashMap) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        DefaultTableModel modelo;
        try {
            conexion = new ConexionSQL().conexion();
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT * FROM secciones WHERE ");
            for (String key : hashMap.keySet()) {
                sql.append(" ").append(key).append(" LIKE ? AND");
            }
            sql.delete(sql.length() - 3, sql.length());

            consulta = conexion.prepareStatement(sql.toString());

            int cont = 0;
            for (String key : hashMap.keySet()) {
                cont++;
                consulta.setObject(cont, hashMap.get(key) + "%");
            }
            resultado = consulta.executeQuery();
            Object datos[] = new Object[8];
            modelo = (DefaultTableModel) tabla.getModel();
            modelo.setRowCount(0);
            while (resultado.next()) {
                datos[0] = resultado.getString("idSeccion");
                datos[1] = resultado.getString("grado");
                datos[2] = resultado.getString("division");
                datos[3] = resultado.getString("tutor");
                datos[4] = resultado.getString("aula");
                datos[5] = resultado.getDate("fecha");
                modelo.addRow(datos);
            }
            tabla.setModel(modelo);
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }

}
