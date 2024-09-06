/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import Modelo.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author ALEANDRES RODRIGUEZ
 */
@WebServlet(name = "CtrUsuario_1", urlPatterns = {"/CtrUsuario_1"})
public class CtrUsuario extends HttpServlet {
    UsuarioDAO dao = new UsuarioDAO();
    Usuario us = new Usuario();

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
   
    public static String encriptarContrasena(String password) {
    return BCrypt.hashpw(password, BCrypt.gensalt());
}

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    List<Usuario> list = dao.listar();
    String id, nombre, apellido, fechaNacimiento, direccion, telefono, correo, usuario, contrasena, tipo;
    String accion = request.getParameter("accion");
    System.out.println("accion: " + accion);

    switch (accion) {
        case "Listar":
            list = dao.listar();
            request.setAttribute("usuarios", list);
            request.getRequestDispatcher("/vista/ListarUsuario.jsp").forward(request, response);
            break;

        case "buscar":
            String nom = request.getParameter("txtbuscar");
            list = dao.listar(nom);
            request.setAttribute("usuarios", list);
            request.getRequestDispatcher("/vista/ListarUsuario.jsp").forward(request, response);
            break;

        case "nuevo":
            id = request.getParameter("id");
            nombre = request.getParameter("nombre");
            apellido = request.getParameter("apellido");
            fechaNacimiento = request.getParameter("fecha_nacimiento");
            direccion = request.getParameter("direccion");
            telefono = request.getParameter("telefono");
            correo = request.getParameter("correo");
            usuario = request.getParameter("usuario");
            contrasena = request.getParameter("contrasena");
            tipo = request.getParameter("tipo");
            
            Usuario us = new Usuario();
            us.setId(id);
            us.setNombre(nombre);
            us.setApellido(apellido);
            us.setFecha_nacimiento(fechaNacimiento);
            us.setDireccion(direccion);
            us.setTelefono(telefono);
            us.setCorreo(correo);
            us.setUsuario(usuario);
            String contrasenaEncriptada = encriptarContrasena(contrasena);
            us.setContrasena(contrasenaEncriptada);
            us.setTipo(tipo);
            
            dao.crear(us);
            list = dao.listar();
            request.setAttribute("usuarios", list);
            request.getRequestDispatcher("/vista/ListarUsuario.jsp").forward(request, response);
            break;

        case "editar":
            String idUsu = request.getParameter("id");
            Usuario usuarioEditar = dao.list(idUsu);
            request.setAttribute("usuario", usuarioEditar);
            System.out.println("contrasena: " + usuarioEditar.getContrasena());
            request.getRequestDispatcher("/vista/EditarUsuario.jsp").forward(request, response);
            break;

        case "actualizar":
            id = request.getParameter("id");
            nombre = request.getParameter("nombre");
            apellido = request.getParameter("apellido");
            fechaNacimiento = request.getParameter("fecha_nacimiento");
            direccion = request.getParameter("direccion");
            telefono = request.getParameter("telefono");
            correo = request.getParameter("correo");
            usuario = request.getParameter("usuario");
            contrasena = request.getParameter("contrasena");
            tipo = request.getParameter("tipo");
            
            us = dao.list(id);
            us.setNombre(nombre);
            us.setApellido(apellido);
            us.setFecha_nacimiento(fechaNacimiento);
            us.setDireccion(direccion);
            us.setTelefono(telefono);
            us.setCorreo(correo);
            us.setUsuario(usuario);
            if (contrasena != null && !contrasena.isEmpty()) {
                us.setContrasena(encriptarContrasena(contrasena));
            }
            us.setTipo(tipo);
            
            dao.editar(us);
            list = dao.listar();
            request.setAttribute("usuarios", list);
            request.getRequestDispatcher("/vista/ListarUsuario.jsp").forward(request, response);
            break;

        case "eliminar":
            id = request.getParameter("id");
            System.out.println("identificacion: " + id);
            dao.eliminar(id);
            list = dao.listar();
            request.setAttribute("usuarios", list);
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
