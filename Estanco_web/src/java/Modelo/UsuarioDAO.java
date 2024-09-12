/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Configuracion.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

public class UsuarioDAO {
    Connection con;
    PreparedStatement pstm;
    Conectar Conexcion;
    ResultSet rs;
    Usuario us = new Usuario();
    Usuario usua;

      public Usuario validar(String usu, String pass) {
        Usuario usua = null; // Inicializa como null
        try {
            Conexcion = new Conectar();
            con = Conexcion.crearconexion();
            if (con != null) {
                pstm = con.prepareStatement("SELECT * FROM usuario WHERE usuario = ?");
                pstm.setString(1, usu);
                rs = pstm.executeQuery();
                if (rs.next()) {
                    // Recuperar datos del usuario
                    usua = new Usuario();
                    usua.setId(rs.getString("Id"));
                    usua.setNombre(rs.getString("nombre"));
                    usua.setApellido(rs.getString("apellido"));
                    usua.setTelefono(rs.getString("telefono"));
                    usua.setCorreo(rs.getString("correo"));
                    usua.setUsuario(rs.getString("usuario"));
                    usua.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
                    usua.setContrasena(rs.getString("contrasena")); // Contraseña encriptada
                    usua.setTipo(rs.getString("tipo"));

                    // Verificar la contraseña
                    boolean verificarpassword = BCrypt.checkpw(pass, rs.getString("contrasena"));
                    if (!verificarpassword) {
                        usua = null; // Contraseña incorrecta, retornar null
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error al conectarse con la base de datos: " + e);
        } finally {
            // Cerrar conexiones, resultsets, etc.
            try {
                if (rs != null) rs.close();
                if (pstm != null) pstm.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e);
            }
        }
        return usua;
    }


    public List<Usuario> listar() {
        ArrayList<Usuario> list = new ArrayList<>();
        try {
            Conexcion = new Conectar();
            con = Conexcion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexión con la base de datos");
            }
            pstm = con.prepareStatement("SELECT * FROM usuario");
            rs = pstm.executeQuery();
            while (rs.next()) {
                Usuario usu = new Usuario();
                usu.setId(rs.getString("Id"));
                usu.setNombre(rs.getString("nombre"));
                usu.setApellido(rs.getString("apellido"));
                usu.setTelefono(rs.getString("telefono"));
                usu.setCorreo(rs.getString("correo"));
                usu.setUsuario(rs.getString("usuario"));
                usu.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
                usu.setTipo(rs.getString("tipo"));
                list.add(usu);
            }
        } catch (Exception e) {
            System.out.println("Error al listar los usuarios: " + e);
        }
        return list;
    }

    public List<Usuario> listar(String nombre) {
        ArrayList<Usuario> list = new ArrayList<>();
        nombre = "%" + nombre + "%";
        try {
            Conexcion = new Conectar();
            con = Conexcion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexión con la base de datos");
            }
            pstm = con.prepareStatement("SELECT * FROM usuario WHERE nombre LIKE ?");
            pstm.setString(1, nombre);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Usuario usu = new Usuario();
                usu.setId(rs.getString("Id"));
                usu.setNombre(rs.getString("nombre"));
                usu.setApellido(rs.getString("apellido"));
                usu.setTelefono(rs.getString("telefono"));
                usu.setCorreo(rs.getString("correo"));
                usu.setUsuario(rs.getString("usuario"));
                usu.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
                usu.setTipo(rs.getString("tipo"));
                list.add(usu);
            }
        } catch (Exception e) {
            System.out.println("Error al listar los usuarios por nombre: " + e);
        }
        return list;
    }

    public boolean crear(Usuario us) {
        try {
            Conexcion = new Conectar();
            con = Conexcion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexión con la base de datos");
            }
            pstm = con.prepareStatement("INSERT INTO usuario (Id, nombre, apellido, telefono, correo, fecha_nacimiento, usuario, contrasena, tipo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");

            pstm.setString(1, us.getId());
            pstm.setString(2, us.getNombre());
            pstm.setString(3, us.getApellido());
            pstm.setString(4, us.getTelefono());
            pstm.setString(5, us.getCorreo());
            pstm.setString(6, us.getFecha_nacimiento());

            // Encriptar la contraseña antes de guardarla
            String hashedPassword = BCrypt.hashpw(us.getContrasena(), BCrypt.gensalt());
            pstm.setString(7, us.getUsuario());
            pstm.setString(8, hashedPassword); // Contraseña encriptada
            pstm.setString(9, us.getTipo());
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al insertar el usuario: " + e);
        }
        return true;
    }

    public Usuario list(String id) {
        Usuario usu = new Usuario();
        try {
            Conexcion = new Conectar();
            con = Conexcion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexión con la base de datos");
            }
            pstm = con.prepareStatement("SELECT * FROM usuario WHERE Id = ?");
            pstm.setString(1, id);
            rs = pstm.executeQuery();
            if (rs.next()) {
                usu.setId(rs.getString("Id"));
                usu.setNombre(rs.getString("nombre"));
                usu.setApellido(rs.getString("apellido"));
                usu.setTelefono(rs.getString("telefono"));
                usu.setCorreo(rs.getString("correo"));
                usu.setUsuario(rs.getString("usuario"));
                usu.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
                usu.setContrasena(rs.getString("contrasena"));
                usu.setTipo(rs.getString("tipo"));
            }
        } catch (Exception e) {
            System.out.println("Error al listar el usuario por identificación: " + e);
        }
        return usu;
    }

    public boolean editar(Usuario us) {
        boolean actualizado = false;
        try {
            Conexcion = new Conectar();
            con = Conexcion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexión con la base de datos");

                // Verificar si el usuario existe antes de actualizar
                pstm = con.prepareStatement("SELECT * FROM usuario WHERE Id = ?");
                pstm.setString(1, us.getId());
                rs = pstm.executeQuery();

                if (rs.next()) {
                    // Si el usuario existe, procedemos a actualizar
                    StringBuilder sql = new StringBuilder("UPDATE usuario SET ");
                    sql.append("nombre = ?, apellido = ?, fecha_nacimiento = ?, ");
                    sql.append("telefono = ?, correo = ?, usuario = ?, tipo = ?");

                    // Si se proporciona una nueva contraseña, la incluimos en la actualización
                    if (us.getContrasena() != null && !us.getContrasena().isEmpty()) {
                        sql.append(", contrasena = ?");
                    }

                    sql.append(" WHERE Id = ?");

                    pstm = con.prepareStatement(sql.toString());
                    pstm.setString(1, us.getNombre());
                    pstm.setString(2, us.getApellido());
                    pstm.setString(3, us.getFecha_nacimiento());
                    pstm.setString(4, us.getTelefono());
                    pstm.setString(5, us.getCorreo());
                    pstm.setString(6, us.getUsuario());
                    pstm.setString(7, us.getTipo());

                    // Si se proporciona una nueva contraseña, la establecemos en el PreparedStatement
                    int index = 8;
                    if (us.getContrasena() != null && !us.getContrasena().isEmpty()) {
                        String hashedPassword = BCrypt.hashpw(us.getContrasena(), BCrypt.gensalt());
                        pstm.setString(index++, hashedPassword);
                    }

                    pstm.setString(index, us.getId());

                    int rowsAffected = pstm.executeUpdate();
                    if (rowsAffected > 0) {
                        actualizado = true;
                        System.out.println("Usuario actualizado correctamente");
                    }
                } else {
                    System.out.println("El usuario con el ID " + us.getId() + " no fue encontrado.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al editar el usuario: " + e);
        } finally {
            // Cerrar conexiones, resultsets, etc.
            try {
                if (rs != null) rs.close();
                if (pstm != null) pstm.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e);
            }
        }
        return actualizado;
    }

    public boolean eliminar(String id) {
        boolean eliminado = false;
        try {
            Conexcion = new Conectar();
            con = Conexcion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexión con la base de datos");

                pstm = con.prepareStatement("DELETE FROM usuario WHERE Id = ?");
                pstm.setString(1, id);
                int rowsAffected = pstm.executeUpdate();
                
                if (rowsAffected > 0) {
                    eliminado = true;
                    System.out.println("Usuario eliminado correctamente");
                } else {
                    System.out.println("El usuario con el ID " + id + " no fue encontrado.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar el usuario: " + e);
        } finally {
            // Cerrar conexiones, resultsets, etc.
            try {
                if (pstm != null) pstm.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e);
            }
        }
        return eliminado;
    }

    public void crearUsuario(String nombre, String apellido, String telefono, String correo, String fechanaci, String usuario, String contrasena) {
        Conectar conectar = new Conectar();
        Connection con = conectar.crearconexion();
        String sql = "INSERT INTO usuario (nombre, apellido, telefono, correo, fecha_nacimiento, usuario, contrasena, tipo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, telefono);
            ps.setString(4, correo);
            ps.setString(5, fechanaci);
            ps.setString(6, usuario);
            // Encriptar la contraseña antes de guardarla
            String contrasenaEncriptada = BCrypt.hashpw(contrasena, BCrypt.gensalt());
            ps.setString(7, contrasenaEncriptada);
            ps.setString(8, ""); // Establecer el tipo de usuario como 'Cliente'

            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al insertar el usuario: " + e.getMessage());
        } finally {
            // Cerrar conexiones, resultsets, etc.
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}

