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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALEANDRES RODRIGUEZ
 */
public class UsuarioDAO {
    Connection con;
    PreparedStatement pstm;
    Conectar conexion;
    ResultSet rs;

    public Usuario validar(String usuario, String contrasena) {
        Usuario us = null;
        try {
            conexion = new Conectar();
            con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexión con la base de datos");
                pstm = con.prepareStatement("SELECT * FROM usuario WHERE Usuario = ?");
                pstm.setString(1, usuario);
                rs = pstm.executeQuery();
                if (rs.next()) {
                    us = new Usuario();
                    us.setId(rs.getString("Id"));
                    us.setNombre(rs.getString("Nombre"));
                    us.setApellido(rs.getString("Apellido"));
                    us.setFecha_nacimiento(rs.getString("Fecha_nacimiento"));
                    us.setDireccion(rs.getString("Direccion"));
                    us.setTelefono(rs.getString("Telefono"));
                    us.setCorreo(rs.getString("Correo"));
                    us.setUsuario(rs.getString("Usuario"));
                    us.setContrasena(rs.getString("Contrasena"));
                    us.setTipo(rs.getString("Tipo"));
                }
            }
        } catch (Exception e) {
            System.out.println("Error al conectarse con la base de datos: " + e);
        }
        return us;
    }

    public List<Usuario> listar() {
        List<Usuario> list = new ArrayList<>();
        try {
            conexion = new Conectar();
            con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexión con la base de datos");
                pstm = con.prepareStatement("SELECT * FROM usuario");
                rs = pstm.executeQuery();
                while (rs.next()) {
                    Usuario us = new Usuario();
                    us.setId(rs.getString("Id"));
                    us.setNombre(rs.getString("Nombre"));
                    us.setApellido(rs.getString("Apellido"));
                    us.setFecha_nacimiento(rs.getString("Fecha_nacimiento"));
                    us.setDireccion(rs.getString("Direccion"));
                    us.setTelefono(rs.getString("Telefono"));
                    us.setCorreo(rs.getString("Correo"));
                    us.setUsuario(rs.getString("Usuario"));
                    us.setTipo(rs.getString("Tipo"));
                    list.add(us);
                }
            }
        } catch (Exception e) {
            System.out.println("Error al listar los usuarios: " + e);
        }
        return list;
    }

    public List<Usuario> listar(String nombre) {
        List<Usuario> list = new ArrayList<>();
        nombre = "%" + nombre + "%";
        try {
            conexion = new Conectar();
            con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexión con la base de datos");
                pstm = con.prepareStatement("SELECT * FROM usuario WHERE Nombre LIKE ?");
                pstm.setString(1, nombre);
                rs = pstm.executeQuery();
                while (rs.next()) {
                    Usuario us = new Usuario();
                    us.setId(rs.getString("Id"));
                    us.setNombre(rs.getString("Nombre"));
                    us.setApellido(rs.getString("Apellido"));
                    us.setFecha_nacimiento(rs.getString("Fecha_nacimiento"));
                    us.setDireccion(rs.getString("Direccion"));
                    us.setTelefono(rs.getString("Telefono"));
                    us.setCorreo(rs.getString("Correo"));
                    us.setUsuario(rs.getString("Usuario"));
                    us.setTipo(rs.getString("Tipo"));
                    list.add(us);
                }
            }
        } catch (Exception e) {
            System.out.println("Error al listar los usuarios por nombre: " + e);
        }
        return list;
    }

    public boolean crear(Usuario us) {
        try {
            conexion = new Conectar();
            con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexión con la base de datos");
                pstm = con.prepareStatement("INSERT INTO usuario (Id, Nombre, Apellido, Fecha_nacimiento, Direccion, Telefono, Correo, Usuario, Contrasena, Tipo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                pstm.setString(1, us.getId());
                pstm.setString(2, us.getNombre());
                pstm.setString(3, us.getApellido());
                pstm.setString(4, us.getFecha_nacimiento());
                pstm.setString(5, us.getDireccion());
                pstm.setString(6, us.getTelefono());
                pstm.setString(7, us.getCorreo());
                pstm.setString(8, us.getUsuario());
                pstm.setString(9, us.getContrasena());
                pstm.setString(10, us.getTipo());
                pstm.executeUpdate();
            }
        } catch (Exception e) {
            System.out.println("Error al insertar el usuario: " + e);
            return false;
        }
        return true;
    }

    public Usuario list(String id) {
        Usuario us = null;
        try {
            conexion = new Conectar();
            con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexión con la base de datos");
                pstm = con.prepareStatement("SELECT * FROM usuario WHERE Id = ?");
                pstm.setInt(1, Integer.parseInt(id));
                rs = pstm.executeQuery();
                if (rs.next()) {
                    us = new Usuario();
                    us.setId(rs.getString("Id"));
                    us.setNombre(rs.getString("Nombre"));
                    us.setApellido(rs.getString("Apellido"));
                    us.setFecha_nacimiento(rs.getString("Fecha_nacimiento"));
                    us.setDireccion(rs.getString("Direccion"));
                    us.setTelefono(rs.getString("Telefono"));
                    us.setCorreo(rs.getString("Correo"));
                    us.setUsuario(rs.getString("Usuario"));
                    us.setContrasena(rs.getString("Contrasena"));
                    us.setTipo(rs.getString("Tipo"));
                }
            }
        } catch (Exception e) {
            System.out.println("Error al listar el usuario por identificación: " + e);
        }
        return us;
    }

    public boolean editar(Usuario us) {
        try {
            conexion = new Conectar();
            con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexión con la base de datos");
                pstm = con.prepareStatement("UPDATE usuario SET Nombre = ?, Apellido = ?, Fecha_nacimiento = ?, Direccion = ?, Telefono = ?, Correo = ?, Usuario = ?, Contrasena = ?, Tipo = ? WHERE Id = ?");
                pstm.setString(1, us.getNombre());
                pstm.setString(2, us.getApellido());
                pstm.setString(3, us.getFecha_nacimiento());
                pstm.setString(4, us.getDireccion());
                pstm.setString(5, us.getTelefono());
                pstm.setString(6, us.getCorreo());
                pstm.setString(7, us.getUsuario());
                pstm.setString(8, us.getContrasena());
                pstm.setString(9, us.getTipo());
                pstm.setString(10, us.getId());
                pstm.executeUpdate();
            }
        } catch (Exception e) {
            System.out.println("Error al editar el usuario: " + e);
            return false;
        }
        return true;
    }

    public boolean eliminar(String id) {
        try {
            conexion = new Conectar();
            con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexión con la base de datos");
                pstm = con.prepareStatement("DELETE FROM usuario WHERE Id = ?");
                pstm.setInt(1, Integer.parseInt(id));
                pstm.executeUpdate();
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar el usuario: " + e);
            return false;
        }
        return true;
    }
}
