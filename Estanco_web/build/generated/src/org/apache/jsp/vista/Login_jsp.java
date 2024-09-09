package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Estanco Currambero</title>\r\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"/Estanco_web/css/login.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"left-side\">\r\n");
      out.write("                <img src=\"/Estanco_web/imagenes/logine.jpeg\" alt=\"\" class=\"shoe-image\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"right-side\">\r\n");
      out.write("                <div id=\"form-container\">\r\n");
      out.write("                    <!-- Formulario de inicio de sesión -->\r\n");
      out.write("                    <form id=\"login-form\" class=\"form active\" action=\"/Estanco_web/CtrValidar\" method=\"post\">\r\n");
      out.write("                        <h1> ¡Bienvenido! </h1>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            \r\n");
      out.write("                            <i class=\"fas fa-user icon\"></i>\r\n");
      out.write("                            <input type=\"text\" name=\"txtuser\" id=\"usuario\" placeholder=\"Usuario\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <i class=\"fas fa-lock icon\"></i>\r\n");
      out.write("                            <input type=\"password\" name=\"txtpass\" id=\"password\" placeholder=\"Contrasena\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"mt-6\">\r\n");
      out.write("                            <a href=\"/Estanco_web/vista/Login.jsp?signup=true\" class=\"registro\">No tienes cuenta? Registrate</a> \r\n");
      out.write("                            <a href=\"#\" class=\"forgot-password\">¿Se te olvidó la contraseña?</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <button type=\"submit\" name=\"accion\" value=\"Ingresar\" class=\"login-btn-form\">Iniciar Sesión</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Formulario de registro -->\r\n");
      out.write("                    <form id=\"signup-form\" class=\"form\" action=\"/Estanco_web/CtrUsuario?accion=nuevo\" method=\"post\">\r\n");
      out.write("                        \r\n");
      out.write("                        <h1>Crear tu cuenta:</h1>\r\n");
      out.write("                        <div class=\"input-group-row\">\r\n");
      out.write("                            <div class=\"input-group\">\r\n");
      out.write("                                <i class=\"fas fa-user icon\"></i>\r\n");
      out.write("                                <input type=\"text\" class=\"formulario_input\" name=\"nombre\" id=\"nombre\" placeholder=\"Nombre\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"input-group\">\r\n");
      out.write("                                <i class=\"fas fa-user icon\"></i>\r\n");
      out.write("                                <input type=\"text\" class=\"formulario_input\" name=\"apellido\" id=\"apellido\" placeholder=\"Apellido\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-group-row\">\r\n");
      out.write("                            <div class=\"input-group\">\r\n");
      out.write("                                <i class=\"fas fa-home icon\"></i>\r\n");
      out.write("                                <input type=\"text\" class=\"formulario_input\" name=\"direccion\" id=\"direccion\" placeholder=\"Dirección\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"input-group\">\r\n");
      out.write("                                <i class=\"fas fa-phone icon\"></i>\r\n");
      out.write("                                <input type=\"text\" class=\"formulario_input\" name=\"telefono\" id=\"telefono\" placeholder=\"Teléfono\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"input-group-row\">\r\n");
      out.write("                            <div class=\"input-group\">\r\n");
      out.write("                                <i class=\"fas fa-envelope icon\"></i>\r\n");
      out.write("                                <input type=\"email\" class=\"formulario_input\" name=\"correo\" id=\"correo\" placeholder=\"Correo\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"input-group\">\r\n");
      out.write("                                <i class=\"fas fa-calendar icon\"></i>\r\n");
      out.write("                                <input type=\"date\" class=\"formulario_input\" name=\"fechanaci\" id=\"fechanaci\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-group-row\">\r\n");
      out.write("                            <div class=\"input-group\">\r\n");
      out.write("                                <i class=\"fas fa-user icon\"></i>\r\n");
      out.write("                                <input type=\"text\" class=\"formulario_input\" name=\"usuario\" id=\"usuario_registro\" placeholder=\"Usuario\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"input-group\">\r\n");
      out.write("                                <i class=\"fas fa-lock icon\"></i>\r\n");
      out.write("                                <input type=\"password\" class=\"formulario_input\" name=\"contrasena\" id=\"contrasena\" placeholder=\"Contraseña\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-group-row\">\r\n");
      out.write("                            <div class=\"input-group\">\r\n");
      out.write("                                <i class=\"fas fa-lock icon\"></i>\r\n");
      out.write("                                <input type=\"password\" class=\"formulario_input\" name=\"contrasena_repetir\" id=\"contrasena_repetir\" placeholder=\"Repite Contraseña\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input\">\r\n");
      out.write("                            <label for=\"terminos\" class=\"formulario_label\">\r\n");
      out.write("                                <input type=\"checkbox\" class=\"formulario_checkbox\" name=\"terminos\" id=\"terminos\" required>\r\n");
      out.write("                                Acepto los términos y condiciones\r\n");
      out.write("                            </label> \r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"formulario_mensaje\" id=\"formulario_mensaje\"></div>\r\n");
      out.write("                        <button type=\"submit\" class=\"login-btn-form\" name=\"accion\" value=\"nuevo\">Crear Cuenta<i class=\"bi bi-floppy\"></i></button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"/Estanco_web/JS/login.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("    \r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
