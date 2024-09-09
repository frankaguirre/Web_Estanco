package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class VentasAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"UTF-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css\">\r\n");
      out.write("        <title>Inicio Administrador</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200\" />\r\n");
      out.write("        <link href=\"../css/admin.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    ");

        //if (session.getAttribute("log") == null || session.getAttribute("log").equals('0')) {
          //  response.sendRedirect("../vista/Login.jsp");
        //}
    
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"wrapper\">\r\n");
      out.write("            <aside class=\"sidebar\">\r\n");
      out.write("                <div class=\"sidebar-header\">\r\n");
      out.write("                    <img src=\"images/logo.png\" alt=\"CodingLab Logo\" />\r\n");
      out.write("                    <h2>Estanco<br>Currambero</h2>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"sidebar-links\">\r\n");
      out.write("                    <div class=\"menu-separator\"></div>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#=inicio\">\r\n");
      out.write("                            <i class=\"bi bi-house-door\"></i> Inicio\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"/Estanco_web/vista/ListarProductos.jsp\">\r\n");
      out.write("                            <i class=\"bi bi-grid\"></i> Productos\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"/Estanco_web/vista/ListarUsuario.jsp\">\r\n");
      out.write("                            <i class=\"bi bi-people\"></i> Usuarios\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"/Estanco_web/vista/PedidosAdmin.jsp\">\r\n");
      out.write("                            <i class=\"bi bi-box-seam\"></i> Pedidos\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"/Estanco_web/vista/ListarProveedor.jsp\">\r\n");
      out.write("                            <i class=\"bi bi-folder\"></i> Proveedores\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"/Estanco_web/vista/Categorias.jsp\">\r\n");
      out.write("                            <i class=\"bi bi-tags\"></i> Categorias\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <i class=\"bi bi-bar-chart\"></i> Reportes\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <i class=\"bi bi-question-circle\"></i> Ayuda\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"/Estanco_web/CtrProducto?accion=salir\">\r\n");
      out.write("                            <i class=\"bi bi-box-arrow-left\"></i> Salir\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"user-account\">\r\n");
      out.write("                    <div class=\"user-profile\">\r\n");
      out.write("                        <img src=\"images/profile-img.jpg\" alt=\"Profile Image\" />\r\n");
      out.write("                        <div class=\"user-detail\">\r\n");
      out.write("                            <h3>Alejandra</h3>\r\n");
      out.write("                            <span>Administrador</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </aside>\r\n");
      out.write("            <main class=\"contentmain\">\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                    <div class=\"contentmaini\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-9\">\r\n");
      out.write("                                <div class=\"alert alert-custom\">\r\n");
      out.write("                                    <h4 class=\"alert-heading\">¡Hola, Administrador!</h4>\r\n");
      out.write("                                    <p class=\"mb-0\">Aquí puedes gestionar los productos, usuarios, pedidos y más.</p>\r\n");
      out.write("                                    <p class=\"mb-0\">Navega usando el menú lateral para acceder a las diferentes opciones.</p>\r\n");
      out.write("                                    <p class=\"mb-0\">Si necesitas asistencia, por favor contacta al soporte o consulta la sección de <a href=\"#\" class=\"text-light\">Ayuda</a>.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-3 mb-4\">\r\n");
      out.write("                                <div class=\"card bg-warning\" style=\"border-radius: 0 15px 15px 0; margin-right: 20px;\">\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <i class=\"bi bi-tags card-icon\"></i>\r\n");
      out.write("                                        <h5 class=\"card-title\">Categorías</h5>\r\n");
      out.write("                                        <p class=\"card-text\">Gestiona las diferentes categorías de productos para una mejor organización.</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card-group\">\r\n");
      out.write("                            <div class=\"card bg-primary\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <i class=\"bi bi-beer card-icon\"></i>\r\n");
      out.write("                                    <h5 class=\"card-title\">Productos</h5>\r\n");
      out.write("                                    <p class=\"card-text\">Gestiona los productos disponibles en el estanco, incluyendo agregar, editar y eliminar productos.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"card bg-secondary\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <i class=\"bi bi-person-circle card-icon\"></i>\r\n");
      out.write("                                    <h5 class=\"card-title\">Usuarios</h5>\r\n");
      out.write("                                    <p class=\"card-text\">Gestiona la información de los usuarios, incluyendo la asignación de roles y permisos.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"card bg-success\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <i class=\"bi bi-truck card-icon\"></i>\r\n");
      out.write("                                    <h5 class=\"card-title\">Pedidos</h5>\r\n");
      out.write("                                    <p class=\"card-text\">Revisa y gestiona los pedidos realizados por los clientes. Asegúrate de seguir el estado de los pedidos.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"card bg-danger\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <i class=\"bi bi-people card-icon\"></i>\r\n");
      out.write("                                    <h5 class=\"card-title\">Proveedores</h5>\r\n");
      out.write("                                    <p class=\"card-text\">Mantén actualizada la información de tus proveedores para una gestión eficiente.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"mt-4\">\r\n");
      out.write("                            <div class=\"card bg-info\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <i class=\"bi bi-info-circle card-icon\"></i>\r\n");
      out.write("                                    <h5 class=\"card-title\">Información Adicional</h5>\r\n");
      out.write("                                    <p class=\"card-text\">Para asistencia adicional, consulta la sección de <a href=\"#\" class=\"text-dark\">Ayuda</a> o contacta a soporte. Revisa los reportes para obtener información detallada sobre el desempeño del negocio.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </main>\r\n");
      out.write("        </div>   \r\n");
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
