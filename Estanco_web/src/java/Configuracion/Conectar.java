/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase para gestionar la conexión a la base de datos MySQL.
 */
public class Conectar {
    private String driver = "com.mysql.jdbc.Driver";
    private String CadenaConeccion = "jdbc:mysql://localhost/estancoweb";
    private String usuario = "root";
    private String contrasena = "";
    private Connection con;

    public Conectar() {
        try {
            // Cargar el driver JDBC
            Class.forName(driver);
            // Establecer la conexión con la base de datos
            con = DriverManager.getConnection(CadenaConeccion, usuario, contrasena);
            if (con != null) {
                System.out.println("Se conectó a la base de datos");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Driver no encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error al conectarse a la base de datos: " + e.getMessage());
        }
    }

    public Connection crearconexion() {
        return con;
    }

    public void desconectar() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                System.out.println("Se ha desconectado de la base de datos");
            }
        } catch (SQLException e) {
            System.out.println("Error al desconectar de la base de datos: " + e.getMessage());
        }
    }
}
