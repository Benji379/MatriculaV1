package DAO;

import java.sql.*;
import javax.swing.JOptionPane;

public class daoLogin {

    public boolean usuarioValido(String usuario, String contraseña) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;

        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM usuarios WHERE dni=?");
            consulta.setString(1, usuario);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                String contraseñaBD = resultado.getString("password");
                if (contraseña.equals(contraseñaBD)) {
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no existe", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

}
