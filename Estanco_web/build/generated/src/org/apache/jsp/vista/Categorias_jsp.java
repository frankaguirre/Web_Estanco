package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Categorias_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"es\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css\">\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("    <title>Categorías</title>\r\n");
      out.write("    <link href=\"../css/admin.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <link href=\"../css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <style>\r\n");
      out.write("        .contentmain h1 {\r\n");
      out.write("            border-bottom: 4px solid orange;\r\n");
      out.write("            padding-bottom: 10px;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        .table {\r\n");
      out.write("            background-color: #f8f9fa;\r\n");
      out.write("            border-radius: 8px;\r\n");
      out.write("            overflow: hidden;\r\n");
      out.write("        }\r\n");
      out.write("        .table thead {\r\n");
      out.write("            background-color: #343a40;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("        .table tbody tr:nth-child(even) {\r\n");
      out.write("            background-color: #f2f2f2;\r\n");
      out.write("        }\r\n");
      out.write("        .table tbody tr:hover {\r\n");
      out.write("            background-color: #e9ecef;\r\n");
      out.write("        }\r\n");
      out.write("        .table th, .table td {\r\n");
      out.write("            vertical-align: middle;\r\n");
      out.write("        }\r\n");
      out.write("        .btn-warning, .btn-danger {\r\n");
      out.write("            margin-right: 5px;\r\n");
      out.write("        }\r\n");
      out.write("        .modal-content {\r\n");
      out.write("            border-radius: 8px;\r\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);\r\n");
      out.write("        }\r\n");
      out.write("        .modal-header {\r\n");
      out.write("            border-bottom: 2px solid #dee2e6;\r\n");
      out.write("            background-color: #f8f9fa;\r\n");
      out.write("        }\r\n");
      out.write("        .modal-title {\r\n");
      out.write("            font-size: 1.25rem;\r\n");
      out.write("            font-weight: 500;\r\n");
      out.write("        }\r\n");
      out.write("        .btn-close {\r\n");
      out.write("            display: none;\r\n");
      out.write("        }\r\n");
      out.write("        .btn-cancel {\r\n");
      out.write("            background-color: #6c757d;\r\n");
      out.write("            border-color: #6c757d;\r\n");
      out.write("        }\r\n");
      out.write("        .btn-cancel:hover {\r\n");
      out.write("            background-color: #5a6268;\r\n");
      out.write("            border-color: #545b62;\r\n");
      out.write("        }\r\n");
      out.write("        .modal-body {\r\n");
      out.write("            padding: 2rem;\r\n");
      out.write("        }\r\n");
      out.write("        .modal-footer {\r\n");
      out.write("            border-top: 2px solid #dee2e6;\r\n");
      out.write("            padding: 1rem;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: flex-end;\r\n");
      out.write("        }\r\n");
      out.write("        .modal-footer .btn {\r\n");
      out.write("            margin-left: 0.5rem;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"wrapper\">\r\n");
      out.write("        <aside class=\"sidebar\">\r\n");
      out.write("            <div class=\"sidebar-header\">\r\n");
      out.write("                <img src=\"imagenes/logo.png\" alt=\"CodingLab Logo\" />\r\n");
      out.write("                <h2>Estanco<br>Currambero</h2>\r\n");
      out.write("            </div>\r\n");
      out.write("            <ul class=\"sidebar-links\">\r\n");
      out.write("                <div class=\"menu-separator\"></div>\r\n");
      out.write("                <li><a href=\"/Estanco_web/vista/VentasAdmin.jsp\"><i class=\"bi bi-house-door\"></i> Inicio</a></li>\r\n");
      out.write("                <li><a href=\"/EstancoCurrambero/vista/ListarProductos.jsp\"><i class=\"bi bi-grid\"></i> Productos</a></li>\r\n");
      out.write("                <li><a href=\"/EstancoCurrambero/vista/ListarUsuario.jsp\"><i class=\"bi bi-people\"></i> Usuarios</a></li>\r\n");
      out.write("                <li><a href=\"/EstancoCurrambero/vista/PedidosAdmin.jsp\"><i class=\"bi bi-box-seam\"></i> Pedidos</a></li>\r\n");
      out.write("                <li><a href=\"/EstancoCurrambero/vista/ListarProveedor.jsp\"><i class=\"bi bi-folder\"></i> Proveedores</a></li>\r\n");
      out.write("                <li><a href=\"/EstancoCurrambero/vista/Categorias.jsp\"><i class=\"bi bi-tags\"></i> Categorías</a></li>\r\n");
      out.write("                <li><a href=\"#\"><i class=\"bi bi-bar-chart\"></i> Reportes</a></li>\r\n");
      out.write("                <li><a href=\"#\"><i class=\"bi bi-question-circle\"></i> Ayuda</a></li>\r\n");
      out.write("                <li><a href=\"/Estanco_web/CtrProducto?accion=salir\"><i class=\"bi bi-box-arrow-left\"></i> Salir</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <div class=\"user-account\">\r\n");
      out.write("                <div class=\"user-profile\">\r\n");
      out.write("                    <img src=\"images/profile-img.jpg\" alt=\"Profile Image\" />\r\n");
      out.write("                    <div class=\"user-detail\">\r\n");
      out.write("                        <h3>Alejandra</h3>\r\n");
      out.write("                        <span>Administrador</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </aside>\r\n");
      out.write("        <main class=\"contentmain\">\r\n");
      out.write("            <div class=\"container mt-5\">\r\n");
      out.write("                <div class=\"d-flex justify-content-between align-items-center mb-4\">\r\n");
      out.write("                    <h1>Categorías</h1>\r\n");
      out.write("                    <form class=\"form-inline mt-4 mb-4\" action=\"#\">\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control form-control-sm\" name=\"txtbuscar\" placeholder=\"Buscar categoría\">\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-success\" name=\"accion\" value=\"buscar\">\r\n");
      out.write("                                <i class=\"bi bi-search\"></i> Buscar\r\n");
      out.write("                            </button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary\" data-bs-toggle=\"modal\" data-bs-target=\"#agregarCategoriaModal\">\r\n");
      out.write("                        <i class=\"bi bi-plus-square\"></i> Agregar\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <table class=\"table table-bordered table-striped\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th class=\"text-center\">ID</th>\r\n");
      out.write("                            <th class=\"text-center\">Nombre</th>\r\n");
      out.write("                            <th class=\"text-center\">Descripción</th>\r\n");
      out.write("                            <th class=\"text-center\">Acciones</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td class=\"text-center\">1</td>\r\n");
      out.write("                            <td class=\"text-center\">Cerveza Águila</td>\r\n");
      out.write("                            <td class=\"text-center\">Refrescante en todo momento</td>\r\n");
      out.write("                            <td class=\"text-center\">\r\n");
      out.write("                                <a class=\"btn btn-warning\" href=\"#\" data-bs-toggle=\"modal\" data-bs-target=\"#editarCategoriaModal\">\r\n");
      out.write("                                    <i class=\"bi bi-pencil-fill\"></i> Editar\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <a class=\"btn btn-danger\" href=\"#\" onclick=\"return confirm('¿Estás seguro de que deseas eliminar esta categoría?');\">\r\n");
      out.write("                                    <i class=\"bi bi-trash-fill\"></i> Eliminar\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </main>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Modal para agregar categoría -->\r\n");
      out.write("    <div class=\"modal fade\" id=\"agregarCategoriaModal\" tabindex=\"-1\" aria-labelledby=\"agregarCategoriaModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("        <div class=\"modal-dialog\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <h5 class=\"modal-title\" id=\"agregarCategoriaModalLabel\">Agregar Categoría</h5>\r\n");
      out.write("                    <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    <form>\r\n");
      out.write("                        <div class=\"mb-3\">\r\n");
      out.write("                            <label for=\"nombreCategoria\" class=\"form-label\">Nombre de la Categoría</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"nombreCategoria\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"mb-3\">\r\n");
      out.write("                            <label for=\"descripcionCategoria\" class=\"form-label\">Descripción</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"descripcionCategoria\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Cancelar</button>\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Agregar</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Modal para editar categoría -->\r\n");
      out.write("    <div class=\"modal fade\" id=\"editarCategoriaModal\" tabindex=\"-1\" aria-labelledby=\"editarCategoriaModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("        <div class=\"modal-dialog\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <h5 class=\"modal-title\" id=\"editarCategoriaModalLabel\">Editar Categoría</h5>\r\n");
      out.write("                    <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    <form>\r\n");
      out.write("                        <div class=\"mb-3\">\r\n");
      out.write("                            <label for=\"editarNombreCategoria\" class=\"form-label\">Nombre de la Categoría</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"editarNombreCategoria\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"mb-3\">\r\n");
      out.write("                            <label for=\"editarDescripcionCategoria\" class=\"form-label\">Descripción</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"editarDescripcionCategoria\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Cancelar</button>\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Guardar Cambios</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-rbsA0bDhUn/TxU+0bD6I4BO15AVY8l+t9f/4coiTrTWGFj1PSJrAKFENIG+9j2N\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
