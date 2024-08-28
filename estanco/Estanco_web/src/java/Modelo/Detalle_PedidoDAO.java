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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HPLAPTOP01
 */
public class Detalle_PedidoDAO {
     Connection con;
    PreparedStatement pstm;
    Statement stm;
    Conectar cone;
    ResultSet rs;
    
    public void crear(Detalle_Pedido dp){
        try {
            cone = new Conectar();
            con = cone.crearconexion();
            if (con != null){
                System.out.println("Se establecio una conexcion con la base de datos");
            }
            pstm = con.prepareStatement("insert into detalle_pedidos (IdProducto, Nombre, IdPedido, Cantidad, PrecioCompra) values (?, ?, ?, ?, ?)");
            pstm.setInt(1, dp.getIdproducto());
            pstm.setString(2, dp.getNombre());
            pstm.setInt(3, dp.getIdpedido());
            pstm.setInt(4, dp.getCantidad());
            pstm.setInt(5, dp.getPrecio());
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al crear en la base de datos "+e.getMessage());
        }
    }
    
    public List Listar(int idp){
        List<Detalle_Pedido> detped = new ArrayList();
        try{
            cone = new Conectar();
            con = cone.crearconexion();
            if (con != null){
                System.out.println("Se establecio una conexcion con la base de datos");
            }
            pstm = con.prepareStatement("select * from detalle_pedidos where idpedido = ?");
            pstm.setInt(1, idp);
            rs = pstm.executeQuery();
            while(rs.next()){
                Detalle_Pedido dep = new Detalle_Pedido();
                dep.setIdetalle(rs.getInt(1));
                dep.setIdproducto(rs.getInt(2));
                dep.setNombre(rs.getString(3));
                dep.setIdpedido(rs.getInt(4));
                dep.setCantidad(rs.getInt(5));
                dep.setPrecio(rs.getInt(6));
                detped.add(dep);
            }
        }catch(Exception e){
            System.out.println("Error al listar los detalles de pedido"+e.getMessage());
        }
        return detped;
    }
}
