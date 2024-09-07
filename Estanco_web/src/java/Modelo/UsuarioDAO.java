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
 */
public class UsuarioDAO {
    Connection con;
    PreparedStatement pstm;
    Conectar Conexion;
    ResultSet rs;
    Usuario us = new Usuario();
    Usuario usua;
    
    
    public Usuario validar(String usu, String pass){
       usua = new Usuario();
       try{
           Conexion = new Conectar();
           Connection con = Conexion.crearconexion();
           if (con != null){
               System.out.println("Se ha establecido una conexion con la base de datos");
               pstm = con.prepareStatement("select * from usuario where Usuario = ? ");
               pstm.setString(1, usu);
               rs = pstm.executeQuery();
               while (rs.next()){
                   if (!rs.getString("Usuario").equals("")){
                       usua.setId(rs.getInt("Id"));
                       usua.setNombre(rs.getString("Nombre"));
                       usua.setApellido(rs.getString("Apellido"));
                       usua.setFecha_nacimiento(rs.getString("Fecha_nacimiento"));
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
           System.out.println("Error al conectarse con la base de datos: "+e);
       }
       return usua;
    }
    public List listar(){
        ArrayList<Usuario> list = new ArrayList<>();
        try{
            Conexion = new Conectar();
           Connection con = Conexion.crearconexion();
           if (con != null){
               System.out.println("Se ha establecido una conexcion con la base de datos");
           }
           pstm = con.prepareStatement("select * from usuario");
           rs = pstm.executeQuery();
           while(rs.next()){
               Usuario usu = new Usuario();
               usu.setId(rs.getInt(1));
               usu.setNombre(rs.getString(2));
               usu.setApellido(rs.getString(3));
               usu.setFecha_nacimiento(rs.getString(4));
               usu.setDireccion(rs.getString(5));
               usu.setTelefono(rs.getString(6));
               usu.setCorreo(rs.getString(7));
               usu.setUsuario(rs.getString(8));
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
            Conexion = new Conectar();
           Connection con = Conexion.crearconexion();
           if (con != null){
               System.out.println("Se ha establecido una conexcion con la base de datos");
           }
           pstm = con.prepareStatement("select * from usuario where Nombre like ?");
           pstm.setString(1, nombre);
           rs = pstm.executeQuery();
           while(rs.next()){
               Usuario usu = new Usuario();
               usu.setId(rs.getInt(1));
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
}
