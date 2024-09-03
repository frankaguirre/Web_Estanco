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

/**
 *
 * @author ALEANDRES RODRIGUEZ
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
}
