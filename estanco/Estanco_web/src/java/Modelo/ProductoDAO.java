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
public class ProductoDAO {
    Connection con;
    PreparedStatement pstm;
    Conectar Conexcion;
    ResultSet rs;
    
    public List listar(){
        List<Producto> producto = new ArrayList();
        try {
            Conexcion = new Conectar();
            Connection con = Conexcion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexcion con la base de datos");

            }
            pstm = con.prepareStatement("select * from producto where Stock >0");
            rs = pstm.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setFoto(rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setPrecio(rs.getInt(5));
                p.setStok(rs.getInt(6));
                producto.add(p);
            }

        } catch (Exception e) {
            System.out.println("Error al listar los productos " + e);
        }
        return producto;
    }
    
    public List listarT(){
        List<Producto> producto = new ArrayList();
        try {
            Conexcion = new Conectar();
            Connection con = Conexcion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexcion con la base de datos");

            }
            pstm = con.prepareStatement("select * from producto");
            rs = pstm.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setFoto(rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setPrecio(rs.getInt(5));
                p.setStok(rs.getInt(6));
                p.setCategoria(rs.getInt(7));
                producto.add(p);
            }

        } catch (Exception e) {
            System.out.println("Error al listar los productos " + e);
        }
        return producto;
    }
    
    public List listarT(String nombre){
        List<Producto> producto = new ArrayList();
        nombre = "%"+nombre+"%";
        try {
            Conexcion = new Conectar();
            Connection con = Conexcion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexcion con la base de datos");

            }
            pstm = con.prepareStatement("select * from producto where nombre like ?");
            pstm.setString(1, nombre);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setFoto(rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setPrecio(rs.getInt(5));
                p.setStok(rs.getInt(6));
                p.setCategoria(rs.getInt(7));
                producto.add(p);
            }

        } catch (Exception e) {
            System.out.println("Error al listar los productos " + e);
        }
        return producto;
    }
    
    public Producto listarT(int id){
        Producto p = new Producto();
        try {
            Conexcion = new Conectar();
            Connection con = Conexcion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexcion con la base de datos");

            }
            pstm = con.prepareStatement("select * from producto where id= ?");
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setFoto(rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setPrecio(rs.getInt(5));
                p.setStok(rs.getInt(6));
                p.setCategoria(rs.getInt(7));
                
            }

        } catch (Exception e) {
            System.out.println("Error al listar los productos " + e);
        }
        return p;
    }
    
    public Producto listarid(int idp){
        Producto p = new Producto();
        try {
            Conexcion = new Conectar();
            Connection con = Conexcion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexcion con la base de datos");

            }
            pstm = con.prepareStatement("select * from producto where Stock >0 and id = ?");
            pstm.setInt(1, idp);
            rs = pstm.executeQuery();
            while (rs.next()) {
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setFoto(rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setPrecio(rs.getInt(5));
                p.setStok(rs.getInt(6));
            }

        } catch (Exception e) {
            System.out.println("Error al listar los productos " + e);
        }
        return p;
    }
    
    public List buscarcat(int idcat){
       List<Producto> producto = new ArrayList();
        try {
            Conexcion = new Conectar();
            Connection con = Conexcion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexcion con la base de datos");

            }
            pstm = con.prepareStatement("select * from producto where Stock >0 and categoria = ?");
            pstm.setInt(1, idcat);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setFoto(rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setPrecio(rs.getInt(5));
                p.setStok(rs.getInt(6));
                producto.add(p);
            }

        } catch (Exception e) {
            System.out.println("Error al listar los productos por categoria " + e);
        }
        return producto;  
    }
    
    public List buscar(String nombre){
        List<Producto> producto = new ArrayList();
        try {
            Conexcion = new Conectar();
            Connection con = Conexcion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexcion con la base de datos");

            }
            nombre = "%"+ nombre +"%";
            pstm = con.prepareStatement("select * from producto where Stock >0 and nombre like ?");
            pstm.setString(1, nombre);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setFoto(rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setPrecio(rs.getInt(5));
                p.setStok(rs.getInt(6));
                producto.add(p);
            }

        } catch (Exception e) {
            System.out.println("Error al buscar los productos" + e);
        }
        return producto;
    }
    
    public void crear(Producto pro){
        try{
            Conexcion = new Conectar();
            Connection con = Conexcion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexcion con la base de datos");

            }
            pstm = con.prepareStatement("insert into producto (Nombre, Descripcion, Foto, Precio, Categoria, Stock) Value(?,?,?,?,?,?)");
            pstm.setString(1, pro.getNombre());
            pstm.setString(2, pro.getDescripcion());
            pstm.setString(3, pro.getFoto());
            pstm.setInt(4, pro.getPrecio());
            pstm.setInt(5, pro.getCategoria());
            pstm.setInt(6, pro.getStok());
            pstm.executeUpdate();
        }catch(Exception e){
             System.out.println("Error al crear los productos" + e);
        }
    }
        
    public void editar(Producto pro){
        try{
            Conexcion = new Conectar();
            Connection con = Conexcion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexcion con la base de datos");

            }
            pstm = con.prepareStatement("update producto set Nombre=?, Descripcion=?, Foto=?, Precio=?, Categoria=?, Stock=? where id = ?");
            pstm.setString(1, pro.getNombre());
            pstm.setString(2, pro.getDescripcion());
            pstm.setString(3, pro.getFoto());
            pstm.setInt(4, pro.getPrecio());
            pstm.setInt(5, pro.getCategoria());
            pstm.setInt(6, pro.getStok());
            pstm.setInt(7, pro.getId());
            pstm.executeUpdate();
        }catch(Exception e){
             System.out.println("Error al editar los productos" + e);
        }
    }
}
