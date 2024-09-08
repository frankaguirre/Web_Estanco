/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import static Controlador.CtrValidar.verificarcontrasena;
import Modelo.Usuario;
import Modelo.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author HPLAPTOP01
 */
public class CtrUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    UsuarioDAO dao = new UsuarioDAO();
    Usuario us = new Usuario();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CtrUsuario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CtrUsuario at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
    
      public static String encriptarcontrasena(String password){
        String passwordencriptado = BCrypt.hashpw(password, BCrypt.gensalt());
        return passwordencriptado;
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Usuario> list = dao.listar();
        String id, nom, ape, fnac, dir, tel, cor, usu, pas, tip;
        String accion = request.getParameter("accion");
        System.out.println("accion: " + accion);
        switch (accion) {
            case "Listar":
                list = dao.listar();
                request.setAttribute("usuario", list);
                request.getRequestDispatcher("/vista/ListarUsuario.jsp").forward(request, response);
                break;
            case "buscar":
                String txtBuscar = request.getParameter("txtbuscar");
                list = dao.listar(txtBuscar);
                request.setAttribute("usuario", list);
                request.getRequestDispatcher("/vista/ListarUsuario.jsp").forward(request, response);
                break;
            case "nuevo":
                id = request.getParameter("id");
                nom = request.getParameter("nombre");
                ape = request.getParameter("apellido");
                fnac = request.getParameter("fecha_nacimiento");
                dir = request.getParameter("direccion");
                tel = request.getParameter("telefono");
                cor = request.getParameter("correo");
                usu = request.getParameter("usuario");
                pas = request.getParameter("contrasena");
                tip = request.getParameter("tipo");
                
                us.setId(id);
                us.setNombre(nom);
                us.setApellido(ape);
                us.setFecha_nacimiento(fnac);
                us.setDireccion(dir);
                us.setTelefono(tel);
                us.setCorreo(cor);
                us.setUsuario(usu);
                String contrasenaencriptada = encriptarcontrasena(pas);
                us.setContrasena(contrasenaencriptada);
                us.setTipo(tip);
                
                dao.crear(us);
                list = dao.listar();
                request.setAttribute("usuario", list);
                request.getRequestDispatcher("/vista/ListarUsuario.jsp").forward(request, response);
                break;
            case "editar":
                String idUsu = request.getParameter("id");
                us = dao.list(idUsu);
                request.setAttribute("usuario", us);
                request.getRequestDispatcher("/vista/ListarUsuario.jsp").forward(request, response);
                break;
            case "actualizar":
                id = request.getParameter("id");
                nom = request.getParameter("nombre");
                ape = request.getParameter("apellido");
                fnac = request.getParameter("fecha_nacimiento");
                dir = request.getParameter("direccion");
                tel = request.getParameter("telefono");
                cor = request.getParameter("correo");
                usu = request.getParameter("usuario");
                pas = request.getParameter("contrasena");
                tip = request.getParameter("tipo");
                
                us.setId(id);
                us.setNombre(nom);
                us.setApellido(ape);
                us.setFecha_nacimiento(fnac);
                us.setDireccion(dir);
                us.setTelefono(tel);
                us.setCorreo(cor);
                us.setUsuario(usu);
                us.setContrasena(pas);
                us.setTipo(tip);
                
                dao.editar(us);
                list = dao.listar();
                request.setAttribute("usuario", list);
                request.getRequestDispatcher("/vista/ListarUsuario.jsp").forward(request, response);
                break;
            case "eliminar":
                id = request.getParameter("id");
                dao.eliminar(id);
                list = dao.listar();
                request.setAttribute("usuario", list);
                request.getRequestDispatcher("/vista/ListarUsuario.jsp").forward(request, response);
                break;
        }
        
    }
   
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

   private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");

        if ("nuevo".equals(accion)) {
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String direccion = request.getParameter("direccion");
            String telefono = request.getParameter("telefono");
            String correo = request.getParameter("correo");
            String fechanaci = request.getParameter("fechanaci");
            String usuario = request.getParameter("usuario");
            String contrasena = request.getParameter("contrasena");

            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuarioDAO.crearUsuario(nombre, apellido, direccion, telefono, correo, fechanaci, usuario, contrasena);

            response.sendRedirect("/Estanco_web/vista/Login.jsp");
        }
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