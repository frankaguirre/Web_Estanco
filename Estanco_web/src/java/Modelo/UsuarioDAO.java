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

    private Conectar conectar;

    public UsuarioDAO() {
        conectar = new Conectar();
    }

    public Usuario validar(String u, String p) {
        Usuario usua = null;
        try (Connection con = conectar.crearconexion();
                PreparedStatement pstm = con.prepareStatement("SELECT * FROM usuario WHERE usuario = ?")) {
            pstm.setString(1, u);
            try (ResultSet rs = pstm.executeQuery()) {
                if (rs.next()) {
                    String contrasenaEncriptada = rs.getString("Contrasena");
                    if (BCrypt.checkpw(p, contrasenaEncriptada)) {
                        usua = new Usuario();
                        usua.setId(rs.getString("Id"));
                        usua.setNombre(rs.getString("Nombre"));
                        usua.setApellido(rs.getString("Apellido"));
                        usua.setFecha_nacimiento(rs.getString("Fecha_nacimiento"));
                        usua.setDireccion(rs.getString("Direccion"));
                        usua.setTelefono(rs.getString("Telefono"));
                        usua.setCorreo(rs.getString("Correo"));
                        usua.setUsuario(rs.getString("Usuario"));
                        usua.setContrasena(contrasenaEncriptada); // Store the encrypted password for further verification
                        usua.setTipo(rs.getString("Tipo"));
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("Error al conectarse con la base de datos: " + e.getMessage());
        }
        return usua;
    }

    public List<Usuario> listar() {
        List<Usuario> list = new ArrayList<>();
        try (Connection con = conectar.crearconexion();
                PreparedStatement pstm = con.prepareStatement("SELECT * FROM usuario");
                ResultSet rs = pstm.executeQuery()) {
            while (rs.next()) {
                Usuario u = new Usuario();
                u.setId(rs.getString("Id"));
                u.setNombre(rs.getString("Nombre"));
                u.setApellido(rs.getString("Apellido"));
                u.setFecha_nacimiento(rs.getString("Fecha_nacimiento"));
                u.setDireccion(rs.getString("Direccion"));
                u.setTelefono(rs.getString("Telefono"));
                u.setCorreo(rs.getString("Correo"));
                u.setUsuario(rs.getString("Usuario"));
                u.setTipo(rs.getString("Tipo"));
                list.add(u);
            }
        } catch (Exception e) {
            System.err.println("Error al listar los usuarios: " + e.getMessage());
        }
        return list;
    }

    public List<Usuario> listar(String n) {
        List<Usuario> list = new ArrayList<>();
        n = "%" + n + "%";
        try (Connection con = conectar.crearconexion();
                PreparedStatement pstm = con.prepareStatement("SELECT * FROM usuario WHERE nombre LIKE ?")) {
            pstm.setString(1, n);
            try (ResultSet rs = pstm.executeQuery()) {
                while (rs.next()) {
                    Usuario u = new Usuario();
                    u.setId(rs.getString("Id"));
                    u.setNombre(rs.getString("Nombre"));
                    u.setApellido(rs.getString("Apellido"));
                    u.setFecha_nacimiento(rs.getString("Fecha_nacimiento"));
                    u.setDireccion(rs.getString("Direccion"));
                    u.setTelefono(rs.getString("Telefono"));
                    u.setCorreo(rs.getString("Correo"));
                    u.setUsuario(rs.getString("Usuario"));
                    u.setTipo(rs.getString("Tipo"));
                    list.add(u);
                }
            }
        } catch (Exception e) {
            System.err.println("Error al listar los usuarios por nombre: " + e.getMessage());
        }
        return list;
    }

    public boolean crear(Usuario u) {
        try (Connection con = conectar.crearconexion();
                PreparedStatement pstm = con.prepareStatement("INSERT INTO usuario (Id, Nombre, Apellido, Fecha_nacimiento, Direccion, Telefono, Correo, Usuario, Contrasena, Tipo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")) {
            pstm.setString(1, u.getId());
            pstm.setString(2, u.getNombre());
            pstm.setString(3, u.getApellido());
            pstm.setString(4, u.getFecha_nacimiento());
            pstm.setString(5, u.getDireccion());
            pstm.setString(6, u.getTelefono());
            pstm.setString(7, u.getCorreo());
            pstm.setString(8, u.getUsuario());
            pstm.setString(9, u.getContrasena());
            pstm.setString(10, u.getTipo());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println("Error al insertar el usuario: " + e.getMessage());
            return false;
        }
    }

    public Usuario list(String id) {
        Usuario u = null;
        try (Connection con = conectar.crearconexion();
                PreparedStatement pstm = con.prepareStatement("SELECT * FROM usuario WHERE id = ?")) {
            pstm.setString(1, id);
            try (ResultSet rs = pstm.executeQuery()) {
                if (rs.next()) {
                    u = new Usuario();
                    u.setId(rs.getString("Id"));
                    u.setNombre(rs.getString("Nombre"));
                    u.setApellido(rs.getString("Apellido"));
                    u.setFecha_nacimiento(rs.getString("Fecha_nacimiento"));
                    u.setDireccion(rs.getString("Direccion"));
                    u.setTelefono(rs.getString("Telefono"));
                    u.setCorreo(rs.getString("Correo"));
                    u.setUsuario(rs.getString("Usuario"));
                    u.setContrasena(rs.getString("Contrasena"));
                    u.setTipo(rs.getString("Tipo"));
                }
            }
        } catch (Exception e) {
            System.err.println("Error al listar el usuario por identificación: " + e.getMessage());
        }
        return u;
    }

    public boolean editar(Usuario u) {
        try (Connection con = conectar.crearconexion();
                PreparedStatement pstm = con.prepareStatement("UPDATE usuario SET nombre = ?, apellido = ?, fecha_nacimiento = ?, direccion = ?, telefono = ?, correo = ?, usuario = ?, contrasena = ?, tipo = ? WHERE id = ?")) {
            pstm.setString(1, u.getNombre());
            pstm.setString(2, u.getApellido());
            pstm.setString(3, u.getFecha_nacimiento());
            pstm.setString(4, u.getDireccion());
            pstm.setString(5, u.getTelefono());
            pstm.setString(6, u.getCorreo());
            pstm.setString(7, u.getUsuario());
            pstm.setString(8, u.getContrasena());
            pstm.setString(9, u.getTipo());
            pstm.setString(10, u.getId());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println("Error al editar el usuario: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminar(String id) {
        try (Connection con = conectar.crearconexion();
                PreparedStatement pstm = con.prepareStatement("DELETE FROM usuario WHERE id = ?")) {
            pstm.setString(1, id);
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println("Error al eliminar el usuario: " + e.getMessage());
            return false;
        }
    }
    
    public void crearUsuario(String nombre, String apellido, String direccion, String telefono, String correo, String fechanaci, String usuario, String contrasena) {
        Conectar conectar = new Conectar();
        Connection con = conectar.crearconexion();
        String sql = "INSERT INTO usuario (nombre, apellido, direccion, telefono, correo, fecha_nacimiento, usuario, contrasena, tipo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, direccion);
            ps.setString(4, telefono);
            ps.setString(5, correo);
            ps.setString(6, fechanaci);
            ps.setString(7, usuario);
            // Encriptar la contraseña antes de guardarla
            String contrasenaEncriptada = BCrypt.hashpw(contrasena, BCrypt.gensalt());
            ps.setString(8, contrasenaEncriptada);
            ps.setString(9, "Cliente"); // Establecer el tipo de usuario como 'Cliente'

            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al insertar el usuario: " + e.getMessage());
        } finally {
            conectar.desconectar();
        }
    }

}
