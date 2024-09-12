package Controlador;

import Modelo.Usuario;
import Modelo.UsuarioDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.mindrot.jbcrypt.BCrypt;

public class CtrValidar extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    UsuarioDAO usudao = new UsuarioDAO();
    Usuario us = new Usuario();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    public static boolean verificarcontrasena(String password, String contrasenaencriptada) {
        return BCrypt.checkpw(password, contrasenaencriptada);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        
        if ("Ingresar".equalsIgnoreCase(accion)) {
            HttpSession sesion = request.getSession();
            String usu = request.getParameter("txtuser");
            String pas = request.getParameter("txtpass");
            
            us = usudao.validar(usu, pas);
            
            if (us != null && us.getUsuario() != null) {
                boolean verificarpassword = verificarcontrasena(pas, us.getContrasena());
                
                if (verificarpassword) {
                    sesion.setAttribute("log", '1');
                    sesion.setAttribute("User", us.getUsuario());
                    sesion.setAttribute("tipo", us.getTipo());
                    sesion.setAttribute("id", us.getId());
                    sesion.setAttribute("correo", us.getCorreo());
                    sesion.setAttribute("usuario", us);
                    
                    if ("Administrador".equals(us.getTipo())) {
                        response.sendRedirect("/Estanco_web/vista/VentasAdmin.jsp");
                    } else if ("Cliente".equals(us.getTipo())) {
                        response.sendRedirect("/Estanco_web/CtrProducto?accion=inicio");
                    }
                } else {
                    response.sendRedirect("/Estanco_web/vista/Login.jsp?ingreso=0");
                }
            } else {
                response.sendRedirect("/Estanco_web/vista/Login.jsp?ingreso=0");
            }
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
