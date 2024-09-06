package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CarritoInicio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css\">\r\n");
      out.write("        <link href=\"../css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"../css/inicio.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <title>Inicia Sesíon para realizar tus compras</title>\r\n");
      out.write("        <style>\r\n");
      out.write("            body {\r\n");
      out.write("               height: 100%;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            background-image: url('../imagenes/imagencarrito.jpg');\r\n");
      out.write("            background-size: cover; \r\n");
      out.write("            background-position: center; \r\n");
      out.write("            background-repeat: no-repeat; \r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            header {\r\n");
      out.write("                box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .navbar-dark {\r\n");
      out.write("                background-color: #343a40;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .navbar-dark .navbar-brand, \r\n");
      out.write("            .navbar-dark .nav-link {\r\n");
      out.write("                color: #ffffff;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .navbar-dark .nav-link:hover {\r\n");
      out.write("                color: #ffc107;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .container {\r\n");
      out.write("                background: #ffffff;\r\n");
      out.write("                padding: 20px;\r\n");
      out.write("                border-radius: 10px;\r\n");
      out.write("                box-shadow: 0 8px 16px rgba(0, 0, 0, 0.15);\r\n");
      out.write("                margin-top: 30px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .empty-cart {\r\n");
      out.write("                display: flex;\r\n");
      out.write("                align-items: center;\r\n");
      out.write("                justify-content: center;\r\n");
      out.write("                height: 350px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .empty-cart img {\r\n");
      out.write("                max-width: 350px;\r\n");
      out.write("                margin-right: 50px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .empty-cart h2 {\r\n");
      out.write("                font-size: 2rem;\r\n");
      out.write("                color: #343a40;\r\n");
      out.write("                font-weight: 700;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .empty-cart a {\r\n");
      out.write("                color: #007bff;\r\n");
      out.write("                text-decoration: underline;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <header>\r\n");
      out.write("            <nav class=\"navbar navbar-dark bg-dark justify-content-between px-3\">\r\n");
      out.write("                <a href=\"/Estanco_web/vista/Inicio.jsp\" class=\"navbar-brand\">Inicio</a>\r\n");
      out.write("                <div class=\"d-flex align-items-center\">\r\n");
      out.write("                    <a href=\"/Estanco_web/vista/CarritoInicio.jsp\" class=\"nav-link\"><i class=\"bi bi-cart3\"></i> Carrito</a>\r\n");
      out.write("                    <a href=\"#\" class=\"nav-link\">Ofertas</a>\r\n");
      out.write("                    <div class=\"dropdown\">\r\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"categoriasDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                            Categorías\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul class=\"dropdown-menu\" aria-labelledby=\"categoriasDropdown\">\r\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\">Cervezas</a></li>\r\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\">Licores</a></li>\r\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\">Mecatos</a></li>\r\n");
      out.write("                            <li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\">Otras</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <a href=\"#\" class=\"nav-link\">Ayuda</a>\r\n");
      out.write("                    <form class=\"d-flex ms-3\" style=\"width: 340px;\">\r\n");
      out.write("                        <input class=\"form-control me-2\" type=\"search\" placeholder=\"Buscar\" aria-label=\"Buscar\">\r\n");
      out.write("                        <button class=\"btn btn-outline-light\" type=\"submit\"><i class=\"bi bi-search\"></i></button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <div class=\"dropdown ms-3\">\r\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                            <i class=\"bi bi-person\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-menu-end\" aria-labelledby=\"userDropdown\">\r\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"URL_DE_INICIO_SESION\">Iniciar Sesión</a></li>\r\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"URL_DE_CREAR_CUENTA\">Crear Cuenta</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container mt-4\">\r\n");
      out.write("            <div class=\"empty-cart\">\r\n");
      out.write("                <img src=\"../imagenes/carrito.jpeg\" alt=\"\"/>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <h2>Inicia sesión para realizar tus compras</h2>\r\n");
      out.write("                    <a href=\"URL_DE_INICIO_SESION\">Inicia sesión aquí</a> o <a href=\"URL_DE_CREAR_CUENTA\">crea una cuenta</a>.\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Modal de Iniciar Sesión -->\r\n");
      out.write("        <div class=\"modal fade\" id=\"IniciarSesion\" tabindex=\"-1\" aria-labelledby=\"loginModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered\">\r\n");
      out.write("                <div class=\"modal-content\" style=\"border-radius: 10px; background-color: rgba(255, 255, 255, 0.8);\">\r\n");
      out.write("                    <div class=\"modal-body d-flex flex-column align-items-center text-center\">\r\n");
      out.write("                        <h5 class=\"modal-title mb-4\" id=\"loginModalLabel\" style=\"color: black;\">Iniciar Sesión</h5>\r\n");
      out.write("                        <form action=\"#\" class=\"w-100 d-flex flex-column align-items-center\">\r\n");
      out.write("                            <div class=\"mb-3 w-75\">\r\n");
      out.write("                                <input type=\"text\" id=\"username\" class=\"form-control\" placeholder=\"Usuario\" required style=\"border-radius: 5px;\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"mb-3 w-75\">\r\n");
      out.write("                                <input type=\"password\" id=\"password\" class=\"form-control\" placeholder=\"Contraseña\" required style=\"border-radius: 5px;\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <button type=\"submit\" class=\"btn custom-btn w-75\">Ingresar</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <p class=\"mt-4\" style=\"color: black;\">¿No tienes una cuenta? <a href=\"#\" data-bs-toggle=\"modal\" data-bs-target=\"#CrearCuenta\">Regístrate</a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Modal de Crear Cuenta -->\r\n");
      out.write("        <div class=\"modal fade\" id=\"CrearCuenta\" tabindex=\"-1\" aria-labelledby=\"registerModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered\">\r\n");
      out.write("                <div class=\"modal-content\" style=\"border-radius: 10px; background-color: rgba(255, 255, 255, 0.8);\">\r\n");
      out.write("                    <div class=\"modal-body d-flex flex-column align-items-center text-center\">\r\n");
      out.write("                        <h5 class=\"modal-title mb-4\" id=\"registerModalLabel\" style=\"color: black;\">Crear Cuenta</h5>\r\n");
      out.write("                        <form action=\"#\" class=\"w-100 d-flex flex-column align-items-center\">\r\n");
      out.write("                            <div class=\"mb-3 w-75\">\r\n");
      out.write("                                <input type=\"text\" id=\"newUser\" class=\"form-control\" placeholder=\"Usuario\" required style=\"border-radius: 5px;\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"mb-3 w-75\">\r\n");
      out.write("                                <input type=\"email\" id=\"email\" class=\"form-control\" placeholder=\"Correo Electrónico\" required style=\"border-radius: 5px;\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"mb-3 w-75\">\r\n");
      out.write("                                <input type=\"password\" id=\"newPassword\" class=\"form-control\" placeholder=\"Contraseña\" required style=\"border-radius: 5px;\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <button type=\"submit\" class=\"btn custom-btn w-75\">Registrar</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <p class=\"mt-4\" style=\"color: black;\">¿Ya tienes una cuenta? <a href=\"#\" data-bs-toggle=\"modal\" data-bs-target=\"#IniciarSesion\">Inicia Sesión</a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </body>\r\n");
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
