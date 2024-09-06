package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;
import java.util.*;
import java.sql.*;
import javax.sql.*;
import java.io.FileInputStream;

public final class VentasCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Estanco Currambero</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    ");

        if (session.getAttribute("log") == null || session.getAttribute("log").equals('0')) {
            response.sendRedirect("../vista/Login.jsp");
        }
    
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <header>\r\n");
      out.write("            <nav class=\"navbar navbar-dark bg-dark justify-content-between px-3\">\r\n");
      out.write("                <a href=\"/Estanco_web/CtrProducto?accion=inicio\" class=\"navbar-brand\">Inicio</a>\r\n");
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
      out.write("                        <ul class=\"dropdown-menu dropdown-menu-end\" aria-labelledby=\"userDropdown\">\r\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\">Cliente</a></li>\r\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\">hola</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        <!-- Carrusel -->\r\n");
      out.write("        <div class=\"carousel\">\r\n");
      out.write("            <div class=\"list\">\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <img src=\"../imagenes/img1.jpg\" alt=\"\"/>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <div class=\"title\">TODO TIPO</div>\r\n");
      out.write("                        <div class=\"topic\">DE CERVEZAS</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <img src=\"../imagenes/img2.jpg\" alt=\"\"/>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <div class=\"title\">Licores</div>\r\n");
      out.write("                        <div class=\"topic\">Y RON</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <img src=\"../imagenes/img3.jpg\" alt=\"\"/>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <div class=\"title\">MECATOS</div>\r\n");
      out.write("                        <div class=\"topic\">Y MÁS...</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <img src=\"../imagenes/img4.jpg\" alt=\"\"/>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <div class=\"title\">GASEOSAS</div>\r\n");
      out.write("                        <div class=\"topic\">Y ENERGIZANTES</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <img src=\"../imagenes/img1.jpg\" alt=\"\"/>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <div class=\"title\">\r\n");
      out.write("                            Contamos con todo tipo de Cervezas.\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <img src=\"../imagenes/img2.jpg\" alt=\"\"/>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <div class=\"title\">\r\n");
      out.write("                            ¡Los mejores licores y ron del mercado!!\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <img src=\"../imagenes/img3.jpg\" alt=\"\"/>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <div class=\"title\">\r\n");
      out.write("                            ¡Mecatos y más!\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <img src=\"../imagenes/img4.jpg\" alt=\"\"/>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <div class=\"title\">\r\n");
      out.write("                            Gaseosas y Energizantes!!\r\n");
      out.write("                        </div>\r\n");
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
      out.write("        <!-- Product Cards -->\r\n");
      out.write("        <div class=\"container mt-5\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                ");

                    // Cargar el archivo de configuración de la base de datos
                    Properties props = new Properties();
                    props.load(new FileInputStream(application.getRealPath("/WEB-INF/dbconfig.properties")));

                    String url = props.getProperty("jdbc.url");
                    String user = props.getProperty("jdbc.user");
                    String password = props.getProperty("jdbc.password");

                    // Conectar a la base de datos
                    Connection conn = DriverManager.getConnection(url, user, password);
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT p.*, c.Nombre AS CategoriaNombre, pr.Nombre AS ProveedorNombre FROM producto p JOIN categoria c ON p.Categoria = c.Id JOIN proveedor pr ON p.Id_proveedor = pr.Id_proveedor");

                    while (rs.next()) {
                        int id = rs.getInt("Id");
                        String nombre = rs.getString("Nombre");
                        String foto = rs.getString("Foto");
                        String descripcion = rs.getString("Descripcion");
                        Date fechaVencimiento = rs.getDate("Fecha_vencimiento");
                        int precio = rs.getInt("Precio");
                        int stock = rs.getInt("Stock");
                        String categoriaNombre = rs.getString("CategoriaNombre");
                        String proveedorNombre = rs.getString("ProveedorNombre");
                
      out.write("\r\n");
      out.write("                <div class=\"col-md-4 mb-4\">\r\n");
      out.write("                    <div class=\"card\" style=\"width: 18rem;\">\r\n");
      out.write("                        <img src=\"");
      out.print( foto );
      out.write("\" class=\"card-img-top\" alt=\"");
      out.print( nombre );
      out.write("\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <h5 class=\"card-title\">");
      out.print( nombre );
      out.write("</h5>\r\n");
      out.write("                            <p class=\"card-text\">");
      out.print( descripcion );
      out.write("</p>\r\n");
      out.write("                            <p class=\"card-text\">Precio: $");
      out.print( precio );
      out.write("</p>\r\n");
      out.write("                            <p class=\"card-text\">Stock: ");
      out.print( stock );
      out.write("</p>\r\n");
      out.write("                            <p class=\"card-text\">Categoría: ");
      out.print( categoriaNombre );
      out.write("</p>\r\n");
      out.write("                            <p class=\"card-text\">Proveedor: ");
      out.print( proveedorNombre );
      out.write("</p>\r\n");
      out.write("                            <a href=\"#\" class=\"btn btn-primary\"><i class=\"bi bi-cart3\"></i> Comprar</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");

                    }
                    rs.close();
                    stmt.close();
                    conn.close();
                
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <footer>\r\n");
      out.write("        <div class=\"container-fluid\" style=\"background-color: black; color: white; padding: 20px;\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <h5>Sobre Nosotros</h5>\r\n");
      out.write("                    <p>Estanco Currambero ofrece una amplia selección de cervezas, licores, mecatos y más. ¡Descubre nuestros productos y disfruta de una experiencia única!</p>\r\n");
      out.write("                    <a href=\"https://facebook.com\" target=\"_blank\" style=\"color: white; margin-right: 10px;\">\r\n");
      out.write("                        <i class=\"bi bi-facebook\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"https://twitter.com\" target=\"_blank\" style=\"color: white; margin-right: 10px;\">\r\n");
      out.write("                        <i class=\"bi bi-twitter\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"https://instagram.com\" target=\"_blank\" style=\"color: white; margin-right: 10px;\">\r\n");
      out.write("                        <i class=\"bi bi-instagram\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"https://linkedin.com\" target=\"_blank\" style=\"color: white;\">\r\n");
      out.write("                        <i class=\"bi bi-linkedin\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <h5>Enlaces Rápidos</h5>\r\n");
      out.write("                    <ul style=\"list-style-type: none; padding: 0;\">\r\n");
      out.write("                        <li><a href=\"/EstancoCurrambero/vista/VentasAdmin.jsp\" style=\"color: white;\">Inicio</a></li>\r\n");
      out.write("                        <li><a href=\"#\" style=\"color: white;\">Ofertas</a></li>\r\n");
      out.write("                        <li><a href=\"#\" style=\"color: white;\">Categorías</a></li>\r\n");
      out.write("                        <li><a href=\"#\" style=\"color: white;\">Ayuda</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <h5>Contacto</h5>\r\n");
      out.write("                    <p>Email: contacto@estancocurrambero.com</p>\r\n");
      out.write("                    <p>Teléfono: +123 456 789</p>\r\n");
      out.write("                    <p>Dirección: Calle Ficticia 123, Ciudad, País</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\r\n");
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
