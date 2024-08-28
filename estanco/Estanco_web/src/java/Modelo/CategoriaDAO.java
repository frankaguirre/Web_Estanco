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
public class CategoriaDAO {
    
    Connection con;
    PreparedStatement pstm;
    Conectar Conexcion;
    ResultSet rs;
    
    public List listar(){
        List<Categoria> categoria = new ArrayList();
        try {
            Conexcion = new Conectar();
            Connection con = Conexcion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexcion con la base de datos");

            }
            pstm = con.prepareStatement("select * from categoria");
            rs = pstm.executeQuery();
            while (rs.next()) {
                Categoria c = new Categoria();
                c.setId(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setDescripcion(rs.getString(3));
                categoria.add(c);
            }

        } catch (Exception e) {
            System.out.println("Error al listar las categoriasos " + e);
        }
        return categoria;
    }
}
