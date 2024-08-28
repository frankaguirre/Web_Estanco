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
public class PedidoDAO {
    Connection con;
    PreparedStatement pstm;
    Statement stm;
    Conectar cone;
    ResultSet rs;
    
    public void crear (Pedido ped){
        try {
            cone = new Conectar();
            con = cone.crearconexion();
            if (con != null){
                System.out.println("Se establecio una conexcion con la base de datos pedido");
            }
            pstm = con.prepareStatement("insert into pedidos (IdCliente, FechaPedido, Monto, Estado, IdPago) values (?, ?, ?, ?, ?)");
            pstm.setString(1, ped.getIdcliente());
            pstm.setString(2, ped.getFecha());
            pstm.setInt(3, ped.getMonto());
            pstm.setString(4, ped.getEstado());
            pstm.setInt(5, ped.getIdpago());
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al crear en la base de datos "+e.getMessage());
        }
    }
    
    public int listarId(){
        int idp = 0;
        try {
            cone = new Conectar();
            con = cone.crearconexion();
            if (con != null){
                System.out.println("Se establecio una conexcion con la base de datos pedido");
            }
            pstm = con.prepareStatement("select MAX(IdPedido) from pedidos");
            rs = pstm.executeQuery();
            while (rs.next()){
                idp = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("Error al listar IdPedido en la base de datos "+e.getMessage());
        }
        return idp;
    }
    
    public Pedido listar(int idp){
        Pedido p = new Pedido();
        try {
            cone = new Conectar();
            con = cone.crearconexion();
            if (con != null){
                System.out.println("Se establecio una conexcion con la base de datos pedido");
            }
            pstm = con.prepareStatement("select * from pedidos where idpedido = ?");
            pstm.setInt(1, idp);
            rs = pstm.executeQuery();
            while (rs.next()){
                p.setIdpedido(rs.getInt(1));
                p.setIdcliente(rs.getString(2));
                p.setIdpago(rs.getInt(3));
                p.setFecha(rs.getString(4));
                p.setMonto(rs.getInt(5));
                p.setEstado(rs.getString(6));
            }
        } catch (Exception e) {
            System.out.println("Error al listar IdPedido en la base de datos "+e.getMessage());
        }
        return p;
    }
    
    public List listar(String idcliente){
        List<Pedido> pedido = new ArrayList();
        try {
            cone = new Conectar();
            con = cone.crearconexion();
            if (con != null){
                System.out.println("Se establecio una conexcion con la base de datos pedido");
            }
            pstm = con.prepareStatement("select * from Pedidos where IdCliente = ?");
            pstm.setString(1, idcliente);
            rs=pstm.executeQuery();
            while (rs.next()){
                Pedido p = new Pedido();
                p.setIdpedido(rs.getInt(1));
                p.setIdcliente(rs.getString(2));
                p.setIdpago(rs.getInt(3));
                p.setFecha(rs.getString(4));
                p.setMonto(rs.getInt(5));
                p.setEstado(rs.getString(6));
                pedido.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error al listar IdPedido en la base de datos "+e.getMessage());
        }
        return pedido;
    }
    
    public List listar(){
        List<Pedido> pedido = new ArrayList();
        try {
            cone = new Conectar();
            con = cone.crearconexion();
            if (con != null){
                System.out.println("Se establecio una conexcion con la base de datos pedido");
            }
            pstm = con.prepareStatement("select * from Pedidos");
            rs=pstm.executeQuery();
            while (rs.next()){
                Pedido p = new Pedido();
                p.setIdpedido(rs.getInt(1));
                p.setIdcliente(rs.getString(2));
                p.setIdpago(rs.getInt(3));
                p.setFecha(rs.getString(4));
                p.setMonto(rs.getInt(5));
                p.setEstado(rs.getString(6));
                pedido.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error al listar IdPedido en la base de datos "+e.getMessage());
        }
        return pedido;
    }
    
    public void actualizar (String es, int idped){
        try{
            cone = new Conectar();
            con = cone.crearconexion();
            if (con != null){
                System.out.println("Se establecio una conexcion con la base de datos pedido");
            }
            pstm = con.prepareStatement("Update pedidos set estado = ? where idpedido = ?");
            pstm.setString(1, es);
            pstm.setInt(2, idped);
            pstm.executeUpdate();
        }catch(Exception e){
            System.out.println("Error al actualizar el estado del pedido en la base de datos "+e.getMessage());
        }
    }
    
    public List buscarest(String est){
      List<Pedido> pedido = new ArrayList();
        try {
            cone = new Conectar();
            con = cone.crearconexion();
            if (con != null){
                System.out.println("Se establecio una conexcion con la base de datos pedido");
            }
            pstm = con.prepareStatement("select * from Pedidos where estado = ?");
            pstm.setString(1, est);
            rs=pstm.executeQuery();
            while (rs.next()){
                Pedido p = new Pedido();
                p.setIdpedido(rs.getInt(1));
                p.setIdcliente(rs.getString(2));
                p.setIdpago(rs.getInt(3));
                p.setFecha(rs.getString(4));
                p.setMonto(rs.getInt(5));
                p.setEstado(rs.getString(6));
                pedido.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error al listar IdPedido en la base de datos "+e.getMessage());
        }
        return pedido;  
    }
   
}
