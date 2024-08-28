/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
/**
 *
 * @author SENA
 */
public class Producto {
    private int id;
    private String nombre;
    private String apellido;    
    private String foto;
    private String descripcion;
    private int fecha_vencimiento;
    private int precio;
    private int Stock;
    private int categoria;
    private int id_proveedor;
    
    public Producto(int id, String nombre, String foto, String descripcion, int fecha_vencimiento, int precio, int stock, int categoria, int id_proveedor) {
        this.id = id;
        this.nombre = nombre;
        this.foto = foto;
        this.descripcion = descripcion;
        this.fecha_vencimiento = fecha_vencimiento;
        this.precio = precio;
        this.Stock = stock;
        this.categoria = categoria;
        this.id_proveedor = id_proveedor;
    }

    public Producto() {
    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(int fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        this.Stock = stock;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getId_provedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_provedor) {
        this.id_proveedor = id_proveedor;
    }
}
