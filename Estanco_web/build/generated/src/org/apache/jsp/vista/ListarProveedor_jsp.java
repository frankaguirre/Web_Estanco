package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ListarProveedor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Proveedor</title>\r\n");
      out.write("        <link href=\"../css/admin.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    ");

        if (session.getAttribute("log") == null || session.getAttribute("log").equals('0')) {
            response.sendRedirect("../vista/Login.jsp");
        }
    
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
      out.write("                        <a href=\"/Estanco_web/vista/VentasAdmin.jsp\">\r\n");
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
      out.write("                <div class=\"container mt-4\">\r\n");
      out.write("                    <div class=\"d-flex justify-content-between align-items-center mb-4\">\r\n");
      out.write("                        <h1>Proveedores</h1>\r\n");
      out.write("                        <form class=\"form-inline mt-4 mb-4\" action=\"#\">\r\n");
      out.write("                            <div class=\"input-group\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control form-control-sm\" name=\"txtbuscar\" placeholder=\"Digite nombre\">\r\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-success\" name=\"accion\" value=\"buscar\">\r\n");
      out.write("                                    <i class=\"bi bi-search\"></i> Buscar\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary\" data-bs-toggle=\"modal\" data-bs-target=\"#addProductModal\">\r\n");
      out.write("                            <i class=\"bi bi-plus-square\"></i>\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row mt-3\">\r\n");
      out.write("                        <div class=\"col-sm\">\r\n");
      out.write("                            <table class=\"table table-hover\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th class=\"text-center\">Id</th>\r\n");
      out.write("                                        <th class=\"text-center\">Ciudad</th>\r\n");
      out.write("                                        <th class=\"text-center\">Correo</th>\r\n");
      out.write("                                        <th class=\"text-center\">Nombre</th>\r\n");
      out.write("                                        <th class=\"text-center\">Telefono</th>\r\n");
      out.write("                                        <th class=\"text-center\">Nombre de Contacto</th>\r\n");
      out.write("                                        <th class=\"text-center\">Acción</th>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                                <tbody>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td class=\"text-center\">1</td>\r\n");
      out.write("                                        <td class=\"text-center\">Barranquilla</td>\r\n");
      out.write("                                        <td class=\"text-center\">bavaria@gmail.com</td>\r\n");
      out.write("                                        <td class=\"text-center\">bavaria</td>\r\n");
      out.write("                                        <td class=\"text-center\">308472912</td>\r\n");
      out.write("                                        <td class=\"text-center\">Fernando Palomo</td>\r\n");
      out.write("                                        <td class=\"text-center\">\r\n");
      out.write("                                            <a class=\"btn btn-warning\" href=\"#\" data-bs-toggle=\"modal\" data-bs-target=\"#editProductModal\"><i class=\"bi bi-pencil-fill\"></i></a>\r\n");
      out.write("                                            <a class=\"btn btn-danger\" href=\"#\"><i class=\"bi bi-trash-fill\"></i></a>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </tbody>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            </main>\r\n");
      out.write("            <!-- Modal para agregar proveedor -->\r\n");
      out.write("                <div class=\"modal fade\" id=\"addProductModal\" tabindex=\"-1\" aria-labelledby=\"addProductModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("                    <div class=\"modal-dialog modal-dialog-centered\">\r\n");
      out.write("                        <div class=\"modal-content\">\r\n");
      out.write("                            <div class=\"modal-header\">\r\n");
      out.write("                                <h5 class=\"modal-title\" id=\"addProductModalLabel\">Agregar Proveedor</h5>\r\n");
      out.write("                                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-body\">\r\n");
      out.write("                                <form action=\"#\" method=\"POST\">\r\n");
      out.write("                                    <div class=\"mb-3\">\r\n");
      out.write("                                        <label for=\"ciudad\" class=\"form-label\">Ciudad</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"ciudad\" name=\"ciudad\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"mb-3\">\r\n");
      out.write("                                        <label for=\"correo\" class=\"form-label\">Correo</label>\r\n");
      out.write("                                        <input type=\"email\" class=\"form-control\" id=\"correo\" name=\"correo\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"mb-3\">\r\n");
      out.write("                                        <label for=\"nombre\" class=\"form-label\">Nombre</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"nombre\" name=\"nombre\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"mb-3\">\r\n");
      out.write("                                        <label for=\"telefono\" class=\"form-label\">Teléfono</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"telefono\" name=\"telefono\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"mb-3\">\r\n");
      out.write("                                        <label for=\"contacto\" class=\"form-label\">Nombre de Contacto</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"contacto\" name=\"contacto\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"modal-footer\">\r\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Cerrar</button>\r\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary\">Agregar</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Modal para editar proveedor -->\r\n");
      out.write("                <div class=\"modal fade\" id=\"editProductModal\" tabindex=\"-1\" aria-labelledby=\"editProductModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("                    <div class=\"modal-dialog modal-dialog-centered\">\r\n");
      out.write("                        <div class=\"modal-content\">\r\n");
      out.write("                            <div class=\"modal-header\">\r\n");
      out.write("                                <h5 class=\"modal-title\" id=\"editProductModalLabel\">Editar Proveedor</h5>\r\n");
      out.write("                                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-body\">\r\n");
      out.write("                                <form action=\"#\" method=\"POST\">\r\n");
      out.write("                                    <div class=\"mb-3\">\r\n");
      out.write("                                        <label for=\"id\" class=\"form-label\">Id</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"id\" name=\"id\" value=\"1\" readonly>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"mb-3\">\r\n");
      out.write("                                        <label for=\"ciudad\" class=\"form-label\">Ciudad</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"ciudad\" name=\"ciudad\" value=\"Barranquilla\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"mb-3\">\r\n");
      out.write("                                        <label for=\"correo\" class=\"form-label\">Correo</label>\r\n");
      out.write("                                        <input type=\"email\" class=\"form-control\" id=\"correo\" name=\"correo\" value=\"bavaria@gmail.com\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"mb-3\">\r\n");
      out.write("                                        <label for=\"nombre\" class=\"form-label\">Nombre</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"nombre\" name=\"nombre\" value=\"bavaria\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"mb-3\">\r\n");
      out.write("                                        <label for=\"telefono\" class=\"form-label\">Teléfono</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"telefono\" name=\"telefono\" value=\"308472912\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"mb-3\">\r\n");
      out.write("                                        <label for=\"contacto\" class=\"form-label\">Nombre de Contacto</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"contacto\" name=\"contacto\" value=\"Fernando Palomo\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"modal-footer\">\r\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Cerrar</button>\r\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary\">Guardar Cambios</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js\" integrity=\"sha384-oBqDVmMz4fnFO9gybVuC2B34KpZ9I6eg5a1FhH5A5cKtFNwKkMxWoDhPpQ0ZaK4i\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js\" integrity=\"sha384-ho+j7jyWK8fNQe+A12B5L8sUwZH5qOOhcvr+rZeGsGA/UbmXp2vI2U2BWI5yIk05\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
