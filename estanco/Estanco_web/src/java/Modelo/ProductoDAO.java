/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conectar.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SENA
 */
public class ProductoDAO {
    Connection con;
    PreparedStatement pstm;
    Conectar Conexcion;
    ResultSet rs;
    
    public List  Listar(){
        List<Producto> producto = new ArrayList();
        try{
            Conexcion  = new Conectar();
            Connection con = Conexcion.crearconexion();
            if(con != null){
                System.out.println("se ha establecido la conexion con la base de datos");
            }
            pstm = con.prepareStatement("select * from producto where Stock > 0");
            rs = pstm.executeQuery();
            while(rs.next()){
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setFoto(rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setFecha_vencimiento(rs.getInt(5));
                p.setPrecio(rs.getInt(6));
                p.setStock(rs.getInt(7));
                p.setCategoria(rs.getInt(8));
                p.setId_proveedor(rs.getInt(9));
                producto.add(p);
            }
            

        }catch(Exception e){
            System.out.println("Error al listar los prouctos" + e);
        }
        return producto;
    }
    public List Listart(){
        List<Producto> producto = new ArrayList();
        try{
            Conexcion  = new Conectar();
            Connection con = Conexcion.crearconexion();
            if(con != null){
                System.out.println("se ha establecido la conexion con la base de datos");
            }
            pstm = con.prepareStatement("select * from producto where nombre like ?");
            rs = pstm.executeQuery();
            while(rs.next()){
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setFoto(rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setFecha_vencimiento(rs.getInt(5));
                p.setPrecio(rs.getInt(6));
                p.setStock(rs.getInt(7));
                p.setCategoria(rs.getInt(8));
                p.setId_proveedor(rs.getInt(9));
                producto.add(p);
            }
            

        }catch(Exception e){
            System.out.println("Error al listar los prouctos" + e);
        }
        return producto;
    }
    public List Listart(int id){
        List<Producto> producto = new ArrayList();
        try{
            Conexcion  = new Conectar();
            Connection con = Conexcion.crearconexion();
            if(con != null){
                System.out.println("se ha establecido la conexion con la base de datos");
            }
            pstm = con.prepareStatement("select * from producto where id = ? ");
            rs = pstm.executeQuery();
            while(rs.next()){
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setFoto(rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setFecha_vencimiento(rs.getInt(5));
                p.setPrecio(rs.getInt(6));
                p.setStock(rs.getInt(7));
                p.setCategoria(rs.getInt(8));
                p.setId_proveedor(rs.getInt(9));
                producto.add(p);
            }
            

        }catch(Exception e){
            System.out.println("Error al listar los prouctos" + e);
        }
        return producto;
    }
    public List buscarcat(){
        List<Producto> producto = new ArrayList();
        try{
            Conexcion  = new Conectar();
            Connection con = Conexcion.crearconexion();
            if(con != null){
                System.out.println("se ha establecido la conexion con la base de datos");
            }
            pstm = con.prepareStatement("select * from producto where Stock >0 and id = ?");
            rs = pstm.executeQuery();
            while(rs.next()){
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setFoto(rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setFecha_vencimiento(rs.getInt(5));
                p.setPrecio(rs.getInt(6));
                p.setStock(rs.getInt(7));
                p.setCategoria(rs.getInt(8));
                p.setId_proveedor(rs.getInt(9));
                producto.add(p);
            }
            

        }catch(Exception el){
            System.out.println("Error al listar los prouctos" + el);
        }
        return producto;
    }
    public List ListarT(){
        List<Producto> producto = new ArrayList();
        try{
            Conexcion  = new Conectar();
            Connection con = Conexcion.crearconexion();
            if(con != null){
                System.out.println("se ha establecido la conexion con la base de datos");
            }
            pstm = con.prepareStatement("select * from producto where Stock >0 and categoria = ?");
            rs = pstm.executeQuery();
            while(rs.next()){
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setFoto(rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setFecha_vencimiento(rs.getInt(5));
                p.setPrecio(rs.getInt(6));
                p.setStock(rs.getInt(7));
                p.setCategoria(rs.getInt(8));
                p.setId_proveedor(rs.getInt(9));
                producto.add(p);
            }
            

        }catch(Exception es){
            System.out.println("Error al listar los prouctos" + es);
        }
        return producto;
    }
    public List buscar(){
        List<Producto> producto = new ArrayList();
        try{
            Conexcion  = new Conectar();
            Connection con = Conexcion.crearconexion();
            if(con != null){
                System.out.println("se ha establecido la conexion con la base de datos");
            }
            pstm = con.prepareStatement("select * from producto where Stock > 0 and nombre like ?");
            rs = pstm.executeQuery();
            while(rs.next()){
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setFoto(rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setFecha_vencimiento(rs.getInt(5));
                p.setPrecio(rs.getInt(6));
                p.setStock(rs.getInt(7));
                p.setCategoria(rs.getInt(8));
                p.setId_proveedor(rs.getInt(9));
                producto.add(p);
            }
            

        }catch(Exception e){
            System.out.println("Error al listar los prouctos" + e);
        }
        return producto;
    }
    public List crear(){
        List<Producto> producto = new ArrayList();
        try{
            Conexcion  = new Conectar();
            Connection con = Conexcion.crearconexion();
            if(con != null){
                System.out.println("se ha establecido la conexion con la base de datos");
            }
            pstm = con.prepareStatement("insert into producto(nombre,Foto)");
            rs = pstm.executeQuery();
            while(rs.next()){
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setFoto(rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setFecha_vencimiento(rs.getInt(5));
                p.setPrecio(rs.getInt(6));
                p.setStock(rs.getInt(7));
                p.setCategoria(rs.getInt(8));
                p.setId_proveedor(rs.getInt(9));
                producto.add(p);
            }
            

        }catch(Exception e){
            System.out.println("Error al listar los prouctos" + e);
        }
        return producto;
    }
}
