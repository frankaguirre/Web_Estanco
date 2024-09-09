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

/**
 *
 * @author HPLAPTOP01
 */
public class UsuarioDAO {
    Connection con;
    PreparedStatement pstm;
    Conectar Conexcion;
    ResultSet rs;
    Usuario us = new Usuario();
    Usuario usua;
    
    public Usuario validar(String usu, String pass){
       usua = new Usuario();
       try{
           Conexcion = new Conectar();
           con = Conexcion.crearconexion();
           if (con != null){
               System.out.println("Se ha establecido una conexión con la base de datos");
               pstm = con.prepareStatement("SELECT * FROM usuario WHERE usuario = ? AND contrasena = ?");
               pstm.setString(1, usu);
               pstm.setString(2, pass);
               rs = pstm.executeQuery();
               while (rs.next()){
                   if (!rs.getString("usuario").equals("")){
                       usua.setId(rs.getString("Id"));
                       usua.setNombre(rs.getString("nombre"));
                       usua.setApellido(rs.getString("apellido"));
                       usua.setDireccion(rs.getString("direccion"));
                       usua.setTelefono(rs.getString("telefono"));
                       usua.setUsuario(rs.getString("usuario"));
                       usua.setCorreo(rs.getString("correo"));
                       usua.setContrasena(rs.getString("contrasena"));
                       usua.setTipo(rs.getString("tipo"));
                   }
               }
           }
       }catch(Exception e){
           System.out.println("Error al conectarse con la base de datos: " + e);
       }
       return usua;
    }
    
    public List<Usuario> listar(){
        ArrayList<Usuario> list = new ArrayList<>();
        try{
            Conexcion = new Conectar();
            con = Conexcion.crearconexion();
            if (con != null){
                System.out.println("Se ha establecido una conexión con la base de datos");
            }
            pstm = con.prepareStatement("SELECT * FROM usuario");
            rs = pstm.executeQuery();
            while(rs.next()){
                Usuario usu = new Usuario();
                usu.setId(rs.getString("Id"));
                usu.setNombre(rs.getString("nombre"));
                usu.setApellido(rs.getString("apellido"));
                usu.setDireccion(rs.getString("direccion"));
                usu.setTelefono(rs.getString("telefono"));
                usu.setCorreo(rs.getString("correo"));
                usu.setUsuario(rs.getString("usuario"));
                usu.setFecha_nacimiento(rs.getString("fecha_nacimiento")); // Agregado
                usu.setTipo(rs.getString("tipo"));
                list.add(usu);
            }
        }catch(Exception e){
            System.out.println("Error al listar los usuarios: " + e);
        } 
        return list;
    }
    
    public List<Usuario> listar(String nombre){
        ArrayList<Usuario> list = new ArrayList<>();
        nombre = "%" + nombre + "%";
        try{
            Conexcion = new Conectar();
            con = Conexcion.crearconexion();
            if (con != null){
                System.out.println("Se ha establecido una conexión con la base de datos");
            }
            pstm = con.prepareStatement("SELECT * FROM usuario WHERE nombre LIKE ?");
            pstm.setString(1, nombre);
            rs = pstm.executeQuery();
            while(rs.next()){
                Usuario usu = new Usuario();
                usu.setId(rs.getString("Id"));
                usu.setNombre(rs.getString("nombre"));
                usu.setApellido(rs.getString("apellido"));
                usu.setDireccion(rs.getString("direccion"));
                usu.setTelefono(rs.getString("telefono"));
                usu.setCorreo(rs.getString("correo"));
                usu.setUsuario(rs.getString("usuario"));
                usu.setFecha_nacimiento(rs.getString("fecha_nacimiento")); // Agregado
                usu.setTipo(rs.getString("tipo"));
                list.add(usu);
            }
        }catch(Exception e){
            System.out.println("Error al listar los usuarios por nombre: " + e);
        } 
        return list;
    }
    
    public boolean crear(Usuario us){
        try{
           Conexcion = new Conectar();
           con = Conexcion.crearconexion();
           if (con != null){
               System.out.println("Se ha establecido una conexión con la base de datos");
           }
           pstm = con.prepareStatement("INSERT INTO usuario (Id, nombre, apellido, direccion, telefono, correo, fecha_nacimiento, usuario, contrasena, tipo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
           pstm.setString(1, us.getId());
           pstm.setString(2, us.getNombre());
           pstm.setString(3, us.getApellido());
           pstm.setString(4, us.getDireccion());
           pstm.setString(5, us.getTelefono());
           pstm.setString(6, us.getCorreo());
           pstm.setString(7, us.getFecha_nacimiento()); // Agregado
           pstm.setString(8, us.getUsuario());
           pstm.setString(9, us.getContrasena());
           pstm.setString(10, us.getTipo());
           pstm.executeUpdate();
        }catch(Exception e){
            System.out.println("Error al insertar el usuario: " + e);
        }
        return true;
    }
    
    public Usuario list(String id){
        Usuario usu = new Usuario();
        try{
            Conexcion = new Conectar();
            con = Conexcion.crearconexion();
            if (con != null){
                System.out.println("Se ha establecido una conexión con la base de datos");
            }
            pstm = con.prepareStatement("SELECT * FROM usuario WHERE Id = ?");
            pstm.setString(1, id);
            rs = pstm.executeQuery();
            while(rs.next()){
                usu.setId(rs.getString("Id"));
                usu.setNombre(rs.getString("nombre"));
                usu.setApellido(rs.getString("apellido"));
                usu.setDireccion(rs.getString("direccion"));
                usu.setTelefono(rs.getString("telefono"));
                usu.setCorreo(rs.getString("correo"));
                usu.setUsuario(rs.getString("usuario"));
                usu.setFecha_nacimiento(rs.getString("fecha_nacimiento")); // Agregado
                usu.setContrasena(rs.getString("contrasena"));
                usu.setTipo(rs.getString("tipo"));
            }
        }catch(Exception e){
            System.out.println("Error al listar el usuario por identificación: " + e);
        }
        return usu;
    }
    
    public boolean editar(Usuario us){
        try{
           Conexcion = new Conectar();
           con = Conexcion.crearconexion();
           if (con != null){
               System.out.println("Se ha establecido una conexión con la base de datos");
           }
           pstm = con.prepareStatement("UPDATE usuario SET direccion = ?, tipo = ?, fecha_nacimiento = ? WHERE Id = ?");
          
           pstm.setString(3, us.getDireccion());
           pstm.setString(8, us.getTipo());
           pstm.setString(9, us.getFecha_nacimiento()); // Agregado
           pstm.setString(10, us.getId());
           pstm.executeUpdate();
        }catch(Exception e){
            System.out.println("Error al editar el usuario: " + e);
        }
        return true;
    }
    
    public boolean eliminar(String id){
        try {
            Conexcion = new Conectar();
            con = Conexcion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexión con la base de datos");
            }
            pstm = con.prepareStatement("DELETE FROM usuario WHERE Id = ?");
            pstm.setString(1, id);
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al eliminar el usuario: " + e);
        }
        return true;
    }


public boolean actualizar(Usuario usuario) {
    String sql = "UPDATE usuario SET nombre=?, apellido=?, fecha_nacimiento=?, direccion=?, telefono=?, correo=?, usuario=?, tipo=? WHERE id=?";
    try {
        Connection conn = this.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, usuario.getNombre());
        ps.setString(2, usuario.getApellido());
        ps.setString(3, usuario.getFecha_nacimiento());
        ps.setString(4, usuario.getDireccion());
        ps.setString(5, usuario.getTelefono());
        ps.setString(6, usuario.getCorreo());
        ps.setString(7, usuario.getUsuario());
        ps.setString(8, usuario.getTipo());
        ps.setString(9, usuario.getId());
        
        int rowsAffected = ps.executeUpdate();
        return rowsAffected > 0;
    } catch (SQLException e) {
    }
    return false;
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
        }
    }

    private Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}