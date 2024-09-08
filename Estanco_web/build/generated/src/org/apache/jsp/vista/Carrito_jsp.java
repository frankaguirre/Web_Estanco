package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Carrito_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css\">\r\n");
      out.write("        <link href=\"../css/inicio.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <title>Estanco Currambero</title>\r\n");
      out.write("        <style>\r\n");
      out.write("            body {\r\n");
      out.write("\r\n");
      out.write("                height: 100%;\r\n");
      out.write("                margin: 0;\r\n");
      out.write("                background-image: url('../imagenes/imagencarrito.jpg');\r\n");
      out.write("                background-size: cover; \r\n");
      out.write("                background-position: center; \r\n");
      out.write("                background-repeat: no-repeat; \r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .cart-container {\r\n");
      out.write("                max-width: 1200px;\r\n");
      out.write("                margin: 20px auto;\r\n");
      out.write("                background-color:#ffffff; \r\n");
      out.write("                padding: 20px;\r\n");
      out.write("                border-radius: 8px;\r\n");
      out.write("                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); \r\n");
      out.write("                display: flex; \r\n");
      out.write("                gap: 20px; \r\n");
      out.write("                align-items: flex-start; \r\n");
      out.write("            }\r\n");
      out.write("            .cart-image {\r\n");
      out.write("                width: 60%;\r\n");
      out.write("            }\r\n");
      out.write("            .cart-image img {\r\n");
      out.write("                max-width: 160%;\r\n");
      out.write("                border-radius: 8px;\r\n");
      out.write("            }\r\n");
      out.write("            .product-list, .cart-summary {\r\n");
      out.write("                width: 70%;\r\n");
      out.write("            }\r\n");
      out.write("            .cart-summary {\r\n");
      out.write("                margin-top: 20px;\r\n");
      out.write("                font-size: 1.1rem;\r\n");
      out.write("            }\r\n");
      out.write("            .cart-summary div {\r\n");
      out.write("                margin-bottom: 15px;\r\n");
      out.write("            }\r\n");
      out.write("            .cart-total {\r\n");
      out.write("                font-size: 1.25rem;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("            }\r\n");
      out.write("            .btn-checkout {\r\n");
      out.write("                margin-top: 20px;\r\n");
      out.write("                width: 48%; \r\n");
      out.write("            }\r\n");
      out.write("            .product-list table {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                background-color: #e9ecef;\r\n");
      out.write("            }\r\n");
      out.write("            .product-list th, .product-list td {\r\n");
      out.write("                padding: 15px;\r\n");
      out.write("                text-align: left;\r\n");
      out.write("            }\r\n");
      out.write("            .product-list th {\r\n");
      out.write("                background-color: #e9ecef;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    ");

        if (session.getAttribute("log") == null || session.getAttribute("log").equals('0')) {
            response.sendRedirect("../vista/Login.jsp");
        }
    
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Header -->\r\n");
      out.write("        <header>\r\n");
      out.write("            <nav class=\"navbar navbar-dark bg-dark justify-content-between px-3\">\r\n");
      out.write("                <a href=\"/Estanco_web/vista/VentasCliente.jsp\" class=\"navbar-brand\">Inicio</a>\r\n");
      out.write("                <div class=\"d-flex align-items-center\">\r\n");
      out.write("                    <a href=\"/Estanco_web/vista/Carrito.jsp\" class=\"nav-link\"><i class=\"bi bi-cart3\"></i> Carrito</a>\r\n");
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
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        <!-- Cart Container -->\r\n");
      out.write("        <div class=\"cart-container\">\r\n");
      out.write("            <div class=\"cart-image\">\r\n");
      out.write("                <img src=\"../imagenes/carrito.jpeg\" alt=\"Carrito Image\" class=\"img-fluid\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"product-list\">\r\n");
      out.write("                <table class=\"table\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>Productos</th>\r\n");
      out.write("                            <th>Precio</th>\r\n");
      out.write("                            <th>Cantidad</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                    <c:forEach var=\"car\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${carrito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${car.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${car.getFoto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" width=\"100\" height=\"100\"></td>\r\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${car.getPrecio()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                            <td><input type=\"hidden\" id=\"idpro\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${car.getIdproducto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                <input type=\"number\" id=\"cantidad\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${car.getCantidad()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control text-center\" min=\"1\">\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${car.getSubtotal()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                            <td><input type=\"hidden\" id=\"idp\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${car.getIdproducto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                <a class=\"btn btn-outline-danger\" href=\"#\" id=\"btndelete\"><i class=\"bi bi-trash\"></i></a>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </c:forEach>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"cart-summary\">\r\n");
      out.write("                <center><h2>Carrito</h2></center>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <label for=\"subtotal\">Subtotal:</label>\r\n");
      out.write("                    <input type=\"text\" id=\"subtotal\" class=\"form-control\" value=\"$24,500\" readonly>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <label for=\"descuento\">Descuento:</label>\r\n");
      out.write("                    <input type=\"text\" id=\"descuento\" class=\"form-control\" value=\"20%\" readonly>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <label for=\"total\">Total:</label>\r\n");
      out.write("                    <input type=\"text\" id=\"total\" class=\"form-control cart-total\" value=\"$19,600\" readonly>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"d-flex justify-content-between mt-3\">\r\n");
      out.write("                    <button class=\"btn btn-primary btn-checkout\">Método de pago</button>\r\n");
      out.write("                    <button class=\"btn btn-danger btn-checkout\">Generar pedido</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Scripts -->\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
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
