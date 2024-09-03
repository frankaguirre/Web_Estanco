package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css\">\r\n");
      out.write("    <title>Ordenes</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <header>\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <a class=\"navbar-brand mx-auto\" href=\"/EstancoCurrambero/vista/VentasAdmin.jsp\" style=\"color: white;\">Inicio</a>\r\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse justify-content-around\" id=\"navbarNav\">\r\n");
      out.write("                    <ul class=\"navbar-nav\">\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"#\" style=\"color: white;\"><i class=\"bi bi-cart3\"></i> Carrito</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"#\" style=\"color: white;\">Ofertas</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item dropdown\">\r\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"categoriasDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\" style=\"color: white;\">\r\n");
      out.write("                                Categorías\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\" aria-labelledby=\"categoriasDropdown\">\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"#\">Cervezas</a></li>\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"#\">Licores</a></li>\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"#\">Mecatos</a></li>\r\n");
      out.write("                                <li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"#\">Otras</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"#\" style=\"color: white;\">Ayuda</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <form class=\"d-flex\" action=\"#\" method=\"post\">\r\n");
      out.write("                        <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\" name=\"busqueda\">\r\n");
      out.write("                        <button class=\"btn btn-outline-light\" type=\"submit\" value=\"buscar\"><i class=\"bi bi-search\"></i></button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <ul class=\"navbar-nav\">\r\n");
      out.write("                        <li class=\"nav-item dropdown\">\r\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\" style=\"color: white;\">\r\n");
      out.write("                                <i class=\"bi bi-person\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu dropdown-menu-end\" aria-labelledby=\"userDropdown\">\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"URL_DE_INICIO_SESION\">Administrador</a></li>\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"URL_DE_CREAR_CUENTA\">Pedidos</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <!-- Contenido principal -->\r\n");
      out.write("    <div class=\"container mt-4\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-sm-2\">\r\n");
      out.write("                <h3>Ordenes</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-5\">\r\n");
      out.write("                <form class=\"d-flex\" action=\"#\" method=\"post\">\r\n");
      out.write("                    <input class=\"form-control me-2\" type=\"search\" placeholder=\"idpedido\" aria-label=\"Search\" name=\"busqueda\">\r\n");
      out.write("                    <button class=\"btn btn-outline-success\" type=\"submit\">Buscar</button>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-5\">\r\n");
      out.write("                <form class=\"d-flex\" action=\"#\" method=\"post\">\r\n");
      out.write("                    <select class=\"form-control me-2\" name=\"busest\" aria-label=\"Search\">\r\n");
      out.write("                        <option value=\"En Proceso\">En Proceso</option>\r\n");
      out.write("                        <option value=\"Despachado\">Despachado</option>\r\n");
      out.write("                        <option value=\"Entregado\">Entregado</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                    <button class=\"btn btn-outline-success\" type=\"submit\">Buscar</button>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row mt-3\">\r\n");
      out.write("            <div class=\"col-sm-7\">\r\n");
      out.write("                <table class=\"table table-hover\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th class=\"text-center\">Pedido</th>\r\n");
      out.write("                            <th class=\"text-center\">Fecha</th>\r\n");
      out.write("                            <th class=\"text-center\">Valor</th>\r\n");
      out.write("                            <th class=\"text-center\">Estado</th>\r\n");
      out.write("                            <th class=\"text-center\">Detalle</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td class=\"text-center\">1</td>\r\n");
      out.write("                            <td class=\"text-center\">12/08/2024</td>\r\n");
      out.write("                            <td class=\"text-center\">$100.000</td>\r\n");
      out.write("                            <td class=\"text-center\">En Proceso</td>\r\n");
      out.write("                            <td class=\"text-center\">\r\n");
      out.write("                                <button class=\"btn btn-outline-info text-center\" data-bs-toggle=\"modal\" data-bs-target=\"#verModal\"><i class=\"bi bi-eye\"></i> Ver</button>\r\n");
      out.write("                                <button class=\"btn btn-outline-warning text-center\" data-bs-toggle=\"modal\" data-bs-target=\"#editarModal\"><i class=\"bi bi-pencil\"></i> Editar</button>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td class=\"text-center\">2</td>\r\n");
      out.write("                            <td class=\"text-center\">13/08/2024</td>\r\n");
      out.write("                            <td class=\"text-center\">$200.000</td>\r\n");
      out.write("                            <td class=\"text-center\">Despachado</td>\r\n");
      out.write("                            <td class=\"text-center\">\r\n");
      out.write("                                <button class=\"btn btn-outline-info text-center\" data-bs-toggle=\"modal\" data-bs-target=\"#verModal\"><i class=\"bi bi-eye\"></i> Ver</button>\r\n");
      out.write("                                <button class=\"btn btn-outline-warning text-center\" data-bs-toggle=\"modal\" data-bs-target=\"#editarModal\"><i class=\"bi bi-pencil\"></i> Editar</button>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-5\">\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                    <div class=\"card-header\">\r\n");
      out.write("                        <h3 class=\"text-center\">Datos del Administrador</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <label>Identificación: </label>\r\n");
      out.write("                        <h5>123456789</h5>\r\n");
      out.write("                        <label>Nombre: </label>\r\n");
      out.write("                        <h5>Omar Pérez</h5>\r\n");
      out.write("                        <label>Dirección: </label>\r\n");
      out.write("                        <h5>Calle Falsa 123</h5>\r\n");
      out.write("                        <label>Teléfono: </label>\r\n");
      out.write("                        <h5>3001234567</h5>\r\n");
      out.write("                        <label>Email: </label>\r\n");
      out.write("                        <h5>omar.perez@example.com</h5>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"card-footer\">\r\n");
      out.write("                        <a class=\"btn btn-outline-success btn-block\" href=\"#\" id=\"btnprint\">Imprimir <i class=\"bi bi-printer\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Modales para Ver y Editar -->\r\n");
      out.write("    <!-- Modal Ver -->\r\n");
      out.write("    <div class=\"modal fade\" id=\"verModal\" tabindex=\"-1\" aria-labelledby=\"verModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("        <div class=\"modal-dialog\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <h5 class=\"modal-title\" id=\"verModalLabel\">Detalles del Pedido</h5>\r\n");
      out.write("                    <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    <!-- Contenido de los detalles del pedido -->\r\n");
      out.write("                    <p>Pedido: 1</p>\r\n");
      out.write("                    <p>Fecha: 12/08/2024</p>\r\n");
      out.write("                    <p>Valor: $100.000</p>\r\n");
      out.write("                    <p>Estado: En Proceso</p>\r\n");
      out.write("                    <!-- Otros detalles del pedido -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Cerrar</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Modal Editar -->\r\n");
      out.write("    <div class=\"modal fade\" id=\"editarModal\" tabindex=\"-1\" aria-labelledby=\"editarModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("        <div class=\"modal-dialog\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <h5 class=\"modal-title\" id=\"editarModalLabel\">Editar Pedido</h5>\r\n");
      out.write("                    <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    <!-- Formulario de edición de pedido -->\r\n");
      out.write("                    <form>\r\n");
      out.write("                        <div class=\"mb-3\">\r\n");
      out.write("                            <label for=\"idPedido\" class=\"form-label\">ID Pedido</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"idPedido\" value=\"1\" disabled>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"mb-3\">\r\n");
      out.write("                            <label for=\"estadoPedido\" class=\"form-label\">Estado</label>\r\n");
      out.write("                            <select class=\"form-select\" id=\"estadoPedido\">\r\n");
      out.write("                                <option selected>En Proceso</option>\r\n");
      out.write("                                <option value=\"1\">Despachado</option>\r\n");
      out.write("                                <option value=\"2\">Entregado</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- Otros campos del formulario de edición -->\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Cerrar</button>\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary\">Guardar cambios</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Scripts de Bootstrap -->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
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
