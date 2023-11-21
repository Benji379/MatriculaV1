package DAO;

import MODELO.Filtros;
import java.sql.*;
import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class daoDocenteBusq extends daoDocente implements Filtros {

    @Override
    public DefaultTableModel consultar(JTable tabla) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        DefaultTableModel modelo = null;

        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM docentes");
            resultado = consulta.executeQuery();
            Object datos[] = new Object[8];
            modelo = (DefaultTableModel) tabla.getModel();
            modelo.setRowCount(0);
            int i = 0;
            while (resultado.next()) {
                i++;
                datos[0] = i;
                datos[1] = resultado.getString("codigo");
                datos[2] = resultado.getString("dni");
                datos[3] = resultado.getString("nombre");
                datos[4] = resultado.getString("apellido");
                datos[5] = resultado.getString("correo");
                datos[6] = resultado.getString("estado");
                datos[7] = resultado.getDate("fecha");
                modelo.addRow(datos);
            }
            tabla.setModel(modelo);
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("ERRROR: " + e.getMessage());
        }
        return modelo;
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
            sql.append("SELECT * FROM docentes WHERE ");
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
            int i = 0;
            while (resultado.next()) {
                i++;
                datos[0] = i;
                datos[1] = resultado.getString("codigo");
                datos[2] = resultado.getString("dni");
                datos[3] = resultado.getString("nombre");
                datos[4] = resultado.getString("apellido");
                datos[5] = resultado.getString("correo");
                datos[6] = resultado.getString("estado");
                datos[7] = resultado.getDate("fecha");
                modelo.addRow(datos);
            }
            tabla.setModel(modelo);
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }

}
