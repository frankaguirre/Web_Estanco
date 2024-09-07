package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"es\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link href=\"../css/inicio.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <title>Estanco Currambero</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Header -->\r\n");
      out.write("        <header>\r\n");
      out.write("            <nav class=\"navbar navbar-dark bg-dark justify-content-between px-3\">\r\n");
      out.write("                <a href=\"#\" class=\"navbar-brand\">Inicio</a>\r\n");
      out.write("                <div class=\"d-flex align-items-center\">\r\n");
      out.write("                    <a href=\"/Estanco_web/vista/CarritoInicio.jsp\" class=\"nav-link\"><i class=\"bi bi-cart3\"></i> Carrito</a>\r\n");
      out.write("                    <a href=\"#\" class=\"nav-link\">Ofertas</a>\r\n");
      out.write("                    <div class=\"dropdown\">\r\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"categoriasDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                            Categorías\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul class=\"dropdown-menu\" aria-labelledby=\"categoriasDropdown\">\r\n");
      out.write("                            <c:forEach var=\"c\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categorias}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"/Estanco_web/CtrProducto?accion=buscarcat&catid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\r\n");
      out.write("                            </c:forEach>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <a href=\"#\" class=\"nav-link\">Ayuda</a>\r\n");
      out.write("                    <form class=\"d-flex ms-3\" style=\"width: 340px;\">\r\n");
      out.write("                        <input class=\"form-control me-2\" type=\"search\" placeholder=\"Buscar\" aria-label=\"Buscar\">\r\n");
      out.write("                        <button class=\"btn btn-outline-light\" type=\"submit\"><i class=\"bi bi-search\"></i></button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <a href=\"/Estanco_web/vista/Login.jsp\" class=\"nav-link\">Iniciar Sesión</a>\r\n");
      out.write("                    <a href=\"#\" class=\"nav-link\">Crear Cuenta</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        <!-- Carousel -->\r\n");
      out.write("        <div class=\"carousel\">\r\n");
      out.write("            <div class=\"list\">\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <img src=\"../imagenes/img1.jpg\" alt=\"TODO TIPO DE CERVEZAS\"/>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <div class=\"title\">TODO TIPO</div>\r\n");
      out.write("                        <div class=\"topic\">DE CERVEZAS</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <img src=\"../imagenes/img2.jpg\" alt=\"Licores Y RON\"/>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <div class=\"title\">Licores</div>\r\n");
      out.write("                        <div class=\"topic\">Y RON</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <img src=\"../imagenes/img3.jpg\" alt=\"MECATOS Y MÁS...\"/>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <div class=\"title\">MECATOS</div>\r\n");
      out.write("                        <div class=\"topic\">Y MÁS...</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <img src=\"../imagenes/img4.jpg\" alt=\"GASEOSAS Y ENERGIZANTES\"/>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <div class=\"title\">GASEOSAS</div>\r\n");
      out.write("                        <div class=\"topic\">Y ENERGIZANTES</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <img src=\"../imagenes/img1.jpg\" alt=\"TODO TIPO DE CERVEZAS\"/>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <div class=\"title\">Contamos con todo tipo de Cervezas.</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <img src=\"../imagenes/img2.jpg\" alt=\"Licores Y RON\"/>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <div class=\"title\">¡Los mejores licores y ron del mercado!</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <img src=\"../imagenes/img3.jpg\" alt=\"MECATOS Y MÁS...\"/>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <div class=\"title\">¡Mecatos y más!</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <img src=\"../imagenes/img4.jpg\" alt=\"GASEOSAS Y ENERGIZANTES\"/>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <div class=\"title\">Gaseosas y Energizantes!</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"arrows\">\r\n");
      out.write("                <button id=\"prev\"><</button>\r\n");
      out.write("                <button id=\"next\">></button>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"time\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("       <div class=\"product-container\">\r\n");
      out.write("            <c:forEach var=\"p\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${producto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                <div class=\"product-card\">\r\n");
      out.write("                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.foto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \"alt=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                    <h2><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></h2>\r\n");
      out.write("                    <p><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.descripcion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></p>\r\n");
      out.write("                    <div class=\"price\">$<c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.precio}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></div>\r\n");
      out.write("                    <a href=\"/Estanco_web/CtrProducto?accion=AgregarCarrito&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"class=\"order-btn\"><i class=\"bi bi-cart3\"></i></a>\r\n");
      out.write("                </div>\r\n");
      out.write("               </c:forEach>\r\n");
      out.write("        <footer>\r\n");
      out.write("            <div class=\"container-fluid\" style=\"background-color: black; color: white; padding: 20px;\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-4\">\r\n");
      out.write("                        <h5>Sobre Nosotros</h5>\r\n");
      out.write("                        <p>Estanco Currambero ofrece una amplia selección de cervezas, licores, mecatos y más. ¡Descubre nuestros productos y disfruta de una experiencia única!</p>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <a href=\"https://facebook.com\" target=\"_blank\" style=\"color: white; margin-right: 10px;\">\r\n");
      out.write("                                <i class=\"bi bi-facebook\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a href=\"https://twitter.com\" target=\"_blank\" style=\"color: white; margin-right: 10px;\">\r\n");
      out.write("                                <i class=\"bi bi-twitter\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a href=\"https://instagram.com\" target=\"_blank\" style=\"color: white; margin-right: 10px;\">\r\n");
      out.write("                                <i class=\"bi bi-instagram\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a href=\"https://linkedin.com\" target=\"_blank\" style=\"color: white;\">\r\n");
      out.write("                                <i class=\"bi bi-linkedin\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4\">\r\n");
      out.write("                        <h5>Enlaces Rápidos</h5>\r\n");
      out.write("                        <ul style=\"list-style-type: none; padding: 0;\">\r\n");
      out.write("                            <li><a href=\"/Estanco_web/vista/Inicio.jsp\" style=\"color: white;\">Inicio</a></li>\r\n");
      out.write("                            <li><a href=\"#\" style=\"color: white;\">Ofertas</a></li>\r\n");
      out.write("                            <li><a href=\"#\" style=\"color: white;\">Categorías</a></li>\r\n");
      out.write("                            <li><a href=\"#\" style=\"color: white;\">Ayuda</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4\">\r\n");
      out.write("                        <h5>Contacto</h5>\r\n");
      out.write("                        <p>Email: contacto@estancocurrambero.com</p>\r\n");
      out.write("                        <p>Teléfono: +57 300 123 4567</p>\r\n");
      out.write("                        <p>Dirección: Calle 123, Barranquilla, Colombia</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-srnF2N6FQFmNm0R1O5yKo+TpyDntpD3B5Q1mlO7xHFvY67p06mH0nv6S1V8GxTkg\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"../JS/carrusel.js\" type=\"text/javascript\"></script>\r\n");
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
