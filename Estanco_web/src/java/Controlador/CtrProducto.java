/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Categoria;
import Modelo.CategoriaDAO;
import Modelo.Producto;
import Modelo.ProductoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "CtrProducto_1", urlPatterns = {"/CtrProducto_1"})
public class CtrProducto extends HttpServlet {

    ProductoDAO pdao = new ProductoDAO();
    CategoriaDAO cdao = new CategoriaDAO();
    List<Producto> productos = new ArrayList();
    List<Categoria> categoria = new ArrayList();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        System.out.println("accion= " + accion);
        HttpSession sesion = request.getSession();
        productos = pdao.listar();
        categoria = cdao.Listar();
        Producto p = new Producto();
        switch (accion) {
            case "inicio":
                request.setAttribute("categoria", categoria);
                request.setAttribute("producto", productos);
                if (sesion.getAttribute("Tipo") != null) {
                    System.out.println("Tipo en sesión: " + sesion.getAttribute("Tipo"));
                    if (sesion.getAttribute("Tipo").equals("administrador")) {
                        System.out.println("Redireccionando a la vista del administrador");
                        request.getRequestDispatcher("/Estanco_web/vista/VentasAdmin.jsp").forward(request, response);
                    } else if (sesion.getAttribute("Tipo").equals("cliente")) {
                        System.out.println("Redireccionando a la vista del cliente");
                        request.getRequestDispatcher("/Estanco_web/vista/VentasCliente.jsp").forward(request, response);
                    }
                } else {
                    System.out.println("Atributo Tipo es null, redirigiendo a inicio");
                    request.getRequestDispatcher("/vista/Inicio.jsp").forward(request, response);
                }
                break;
            case "salir":
                //HttpSession sesion = request.getSession();
                sesion.invalidate();
                response.sendRedirect("/Estanco_web/vista/Inicio.jsp");
                break;
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
