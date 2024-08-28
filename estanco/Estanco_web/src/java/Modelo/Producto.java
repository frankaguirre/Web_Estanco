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
public class Producto {
    private int id;
    private String nombre;
    private String foto;
    private String descripcion;
    private int precio;
    private int stok;
    private int categoria;

    public Producto() {
    }

    public Producto(int id, String nombre, String foto, String descripcion, int precio, int stok, int categoria) {
        this.id = id;
        this.nombre = nombre;
        this.foto = foto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stok = stok;
        this.categoria = categoria;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
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

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    
}
