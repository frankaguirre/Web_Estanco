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
public class Pedido {
    private int idpedido;
    private String idcliente;
    private String fecha;
    private int idpago;
    private int monto;
    private String estado;

    public Pedido() {
    }

    public int getIdpago() {
        return idpago;
    }

    public void setIdpago(int idpago) {
        this.idpago = idpago;
    }

    public Pedido(int idpedido, String idcliente, String fecha, int idpago, int monto, String estado) {
        this.idpedido = idpedido;
        this.idcliente = idcliente;
        this.fecha = fecha;
        this.idpago = idpago;
        this.monto = monto;
        this.estado = estado;
    }

  

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
