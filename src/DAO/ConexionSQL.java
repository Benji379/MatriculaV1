package DAO;

import java.sql.*;

public class ConexionSQL {

    public Connection conexion() {
        Connection conectar = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/matricula", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return conectar;
    }

}
