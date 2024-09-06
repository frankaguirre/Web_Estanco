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
public class ProductoDAO {
    Connection con;
    PreparedStatement pstm;
    Conectar Conexion;
    ResultSet rs;
    
    public List listar(){
        List<Producto> producto = new ArrayList();
        try {
            Conexion = new Conectar();
            Connection con = Conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexion con la base de datos");

            }
            pstm = con.prepareStatement("select * from producto where Stock >0");
            rs = pstm.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setFoto(rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setFecha_vencimiento(rs.getString(5));
                p.setPrecio(rs.getInt(6));
                p.setStock(rs.getInt(7));
                p.setCategoria(rs.getInt(8));
                p.setId_proveedor(rs.getInt(9));
                producto.add(p);
            }

        } catch (Exception e) {
            System.out.println("Error al listar los productos " + e);
        }
        return producto;
    }
    public List buscarcat(int idcat){
       List<Producto> producto = new ArrayList();
        try {
            Conexion = new Conectar();
            Connection con = Conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexion con la base de datos");

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
                p.setFecha_vencimiento(rs.getString(5));
                p.setPrecio(rs.getInt(6));
                p.setStock(rs.getInt(7));
                p.setCategoria(rs.getInt(8));
                p.setId_proveedor(rs.getInt(9));
                producto.add(p);
            }

        } catch (Exception e) {
            System.out.println("Error al listar los productos por categoria " + e);
        }
        return producto;  
    }
}
