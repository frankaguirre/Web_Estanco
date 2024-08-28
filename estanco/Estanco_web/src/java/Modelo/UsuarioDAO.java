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
           Connection con = Conexcion.crearconexion();
           if (con != null){
               System.out.println("Se ha establecido una conexcion con la base de datos");
               pstm = con.prepareStatement("select * from usuarios where usuario = ? ");
               pstm.setString(1, usu);
               rs = pstm.executeQuery();
               while (rs.next()){
                   if (!rs.getString("Usuario").equals("")){
                       usua.setId(rs.getString("Id"));
                       usua.setNombre(rs.getString("Nombre"));
                       usua.setApellido(rs.getString("Apellido"));
                       usua.setDireccion(rs.getString("Direccion"));
                       usua.setTelefono(rs.getString("Telefono"));
                       usua.setUsuario(rs.getString("Usuario"));
                       usua.setCorreo(rs.getString("Correo"));
                       usua.setContrasena(rs.getString("Contrasena"));
                       usua.setTipo(rs.getString("Tipo"));
                   }
               }
           }
       }catch(Exception e){
           System.out.println("Error al conectarse conla base de datos: "+e);
       }
       return usua;
    }
    
    public List listar(){
        ArrayList<Usuario> list = new ArrayList<>();
        try{
            Conexcion = new Conectar();
           Connection con = Conexcion.crearconexion();
           if (con != null){
               System.out.println("Se ha establecido una conexcion con la base de datos");
           }
           pstm = con.prepareStatement("select * from usuarios");
           rs = pstm.executeQuery();
           while(rs.next()){
               Usuario usu = new Usuario();
               usu.setId(rs.getString(1));
               usu.setNombre(rs.getString(2));
               usu.setApellido(rs.getString(3));
               usu.setDireccion(rs.getString(4));
               usu.setTelefono(rs.getString(5));
               usu.setCorreo(rs.getString(6));
               usu.setUsuario(rs.getString(7));
               usu.setTipo(rs.getString(9));
               list.add(usu);
           }
        }catch(Exception e){
            System.out.println("Error al listar los usuarios");
        }
        return list;
    }
    
    public List listar(String nombre){
        ArrayList<Usuario> list = new ArrayList<>();
        nombre = "%"+nombre+"%";
        try{
            Conexcion = new Conectar();
           Connection con = Conexcion.crearconexion();
           if (con != null){
               System.out.println("Se ha establecido una conexcion con la base de datos");
           }
           pstm = con.prepareStatement("select * from usuarios where nombre like ?");
           pstm.setString(1, nombre);
           rs = pstm.executeQuery();
           while(rs.next()){
               Usuario usu = new Usuario();
               usu.setId(rs.getString(1));
               usu.setNombre(rs.getString(2));
               usu.setApellido(rs.getString(3));
               usu.setDireccion(rs.getString(4));
               usu.setTelefono(rs.getString(5));
               usu.setCorreo(rs.getString(6));
               usu.setUsuario(rs.getString(7));
               usu.setTipo(rs.getString(9));
               list.add(usu);
           }
        }catch(Exception e){
            System.out.println("Error al listar los usuarios por nombre");
        }
        return list;
    }
    
    public boolean crear(Usuario us){
        try{
           Conexcion = new Conectar();
           Connection con = Conexcion.crearconexion();
           if (con != null){
               System.out.println("Se ha establecido una conexcion con la base de datos");
           }
           pstm = con.prepareStatement("insert into usuarios values(?,?,?,?,?,?,?,?,?)");
           pstm.setString(1, us.getId());
           pstm.setString(2, us.getNombre());
           pstm.setString(3, us.getApellido());
           pstm.setString(4, us.getDireccion());
           pstm.setString(5, us.getTelefono());
           pstm.setString(6, us.getCorreo());
           pstm.setString(7, us.getUsuario());
           pstm.setString(8, us.getContrasena());
           pstm.setString(9, us.getTipo());
           pstm.executeUpdate();
        }catch(Exception e){
            System.out.println("Error al insertar el usuarios");
    }
        return true;
    }
    
    public Usuario list(String id){
        Usuario usu = new Usuario();
        try{
            Conexcion = new Conectar();
           Connection con = Conexcion.crearconexion();
           if (con != null){
               System.out.println("Se ha establecido una conexcion con la base de datos");
           }
           pstm = con.prepareStatement("select * from usuarios where id = ?");
           pstm.setString(1, id);
           rs = pstm.executeQuery();
           while(rs.next()){
               usu.setId(rs.getString(1));
               usu.setNombre(rs.getString(2));
               usu.setApellido(rs.getString(3));
               usu.setDireccion(rs.getString(4));
               usu.setTelefono(rs.getString(5));
               usu.setCorreo(rs.getString(6));
               usu.setUsuario(rs.getString(7));
               usu.setContrasena(rs.getString(8));
               usu.setTipo(rs.getString(9));
            }
        }catch(Exception e){
            System.out.println("Error al listar los usuarios por identificacion");
        }
        return usu;
    }
    
    public boolean editar(Usuario us){
        try{
           Conexcion = new Conectar();
           Connection con = Conexcion.crearconexion();
           if (con != null){
               System.out.println("Se ha establecido una conexcion con la base de datos");
           }
           pstm = con.prepareStatement("update usuarios set nombre = ?, apellido = ?, direccion = ?, telefono = ?, correo = ?, usuario = ?, contrasena = ?, tipo = ? where id = ?");
           pstm.setString(1, us.getNombre());
           pstm.setString(2, us.getApellido());
           pstm.setString(3, us.getDireccion());
           pstm.setString(4, us.getTelefono());
           pstm.setString(5, us.getCorreo());
           pstm.setString(6, us.getUsuario());
           pstm.setString(7, us.getContrasena());
           pstm.setString(8, us.getTipo());
           pstm.setString(9, us.getId());
           pstm.executeUpdate();
        }catch(Exception e){
            System.out.println("Error al editar el usuarios "+e);
    }
        return true;
    }
    
    public boolean eliminar(String id){
        try {
            Conexcion = new Conectar();
            Connection con = Conexcion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexcion con la base de datos");
            }
            pstm = con.prepareStatement("delete from usuarios where id = ?");
            pstm.setString(1, id);
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al eliminarr el usuarios " + e);
        }
        return true;
    }
}
