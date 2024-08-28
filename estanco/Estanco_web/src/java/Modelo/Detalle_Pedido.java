/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author HPLAPTOP01
 */
public class Detalle_Pedido {
    private int idetalle;
    private int idproducto;
    private String nombre;
    private int idpedido;
    private int cantidad;
    private int precio;

    public Detalle_Pedido(int idetalle, int idproducto, String nombre, int idpedido, int cantidad, int precio) {
        this.idetalle = idetalle;
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.idpedido = idpedido;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Detalle_Pedido() {
    }

    public int getIdetalle() {
        return idetalle;
    }

    public void setIdetalle(int idetalle) {
        this.idetalle = idetalle;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
    
}
