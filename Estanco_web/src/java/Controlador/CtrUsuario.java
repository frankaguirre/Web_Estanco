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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.mindrot.jbcrypt.BCrypt;

public class CtrUsuario extends HttpServlet {

    UsuarioDAO dao = new UsuarioDAO();
    Usuario us = new Usuario();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
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

    public static String encriptarcontrasena(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Usuario> list = dao.listar();
        String id, nomb, ape, dir, tel, cor, usu, pas, tip, fechaNac;
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
                request.getRequestDispatcher("/vista/NuevoUsuario.jsp").forward(request, response);
                break;
            case "editar":
                id = request.getParameter("id");
                us = dao.list(id);
                request.setAttribute("usuario", us);
                request.getRequestDispatcher("/vista/EditarUsuario.jsp").forward(request, response);
                break;
            case "actualizar":
                id = request.getParameter("id");

                // Obtener los datos del formulario
                String nombre = request.getParameter("nombre");
                String apellido = request.getParameter("apellido");
                String fechaNacimiento = request.getParameter("fecha_nacimiento");
                String direccion = request.getParameter("direccion");
                String telefono = request.getParameter("telefono");
                String correo = request.getParameter("correo");
                String usuario = request.getParameter("usuario");
                String contrasena = request.getParameter("contrasena");
                String tipo = request.getParameter("tipo");

                // Obtener el usuario actual de la base de datos
                Usuario usuarioExistente = dao.list(id);

                if (usuarioExistente != null) {
                    // Actualizar los campos del usuario
                    usuarioExistente.setNombre(nombre);
                    usuarioExistente.setApellido(apellido);
                    usuarioExistente.setFecha_nacimiento(fechaNacimiento);
                    usuarioExistente.setDireccion(direccion);
                    usuarioExistente.setTelefono(telefono);
                    usuarioExistente.setCorreo(correo);
                    usuarioExistente.setUsuario(usuario);

                    // Si se proporciona una nueva contraseña, encriptarla
                    if (contrasena != null && !contrasena.isEmpty()) {
                        usuarioExistente.setContrasena(encriptarcontrasena(contrasena));
                    } else {
                        usuarioExistente.setContrasena(usuarioExistente.getContrasena()); // Mantener la contraseña existente
                    }
                    
                    usuarioExistente.setTipo(tipo);

                    // Llamar al método para actualizar el usuario
                    dao.editar(usuarioExistente);

                    // Listar de nuevo los usuarios actualizados
                    list = dao.listar();
                    request.setAttribute("usuarios", list);
                    request.getRequestDispatcher("/vista/ListarUsuario.jsp").forward(request, response);
                } else {
                    // Manejar error si el usuario no existe
                    request.setAttribute("error", "Usuario no encontrado.");
                    request.getRequestDispatcher("/vista/Error.jsp").forward(request, response);
                }
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

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");

        if ("nuevo".equals(accion)) {
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String direccion = request.getParameter("direccion");
            String telefono = request.getParameter("telefono");
            String correo = request.getParameter("correo");
            String fechaNac = request.getParameter("fecha_nacimiento");
            String usuario = request.getParameter("usuario");
            String contrasena = request.getParameter("contrasena");

            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuarioDAO.crearUsuario(nombre, apellido, direccion, telefono, correo, fechaNac, usuario, contrasena);

            response.sendRedirect("/Estanco_web/vista/Login.jsp");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
