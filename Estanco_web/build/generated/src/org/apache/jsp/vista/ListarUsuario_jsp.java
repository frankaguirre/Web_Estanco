package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ListarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("        <title>Usuarios</title>\r\n");
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
      out.write("                <div class=\"container mt-5\">\r\n");
      out.write("                    <div class=\"d-flex justify-content-between align-items-center mb-4\">\r\n");
      out.write("                        <h1>Usuarios</h1>\r\n");
      out.write("                        <!-- Formulario de búsqueda -->\r\n");
      out.write("                        <form class=\"form-inline mt-4 mb-4\" action=\"/Estanco_web/CtrUsuario?accion=buscar\" method=\"get\">\r\n");
      out.write("                            <div class=\"input-group\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control form-control-sm\" name=\"txtbuscar\" placeholder=\"Digite nombre\">\r\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-success\" name=\"accion\" value=\"buscar\">\r\n");
      out.write("                                    <i class=\"bi bi-search\"></i> Buscar\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <!-- Botón para agregar usuario (abrir modal) -->\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary\" data-bs-toggle=\"modal\" data-bs-target=\"#agregarUsuarioModal\">\r\n");
      out.write("                            <i class=\"bi bi-plus-square\"></i> Agregar Usuario\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Tabla de usuarios -->\r\n");
      out.write("                    <div class=\"row mt-3\">\r\n");
      out.write("                        <div class=\"col-sm\">\r\n");
      out.write("                            <table class=\"table table-hover\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th class=\"text-center\">Id</th>\r\n");
      out.write("                                        <th class=\"text-center\">Nombre</th>\r\n");
      out.write("                                        <th class=\"text-center\">Apellido</th>\r\n");
      out.write("                                        <th class=\"text-center\">Fecha de Nacimiento</th>\r\n");
      out.write("                                        <th class=\"text-center\">Dirección</th>\r\n");
      out.write("                                        <th class=\"text-center\">Telefono</th>\r\n");
      out.write("                                        <th class=\"text-center\">Correo</th>\r\n");
      out.write("                                        <th class=\"text-center\">Usuario</th>\r\n");
      out.write("                                        <th class=\"text-center\">Tipo</th>\r\n");
      out.write("                                        <th class=\"text-center\">Acciones</th>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                                <tbody>\r\n");
      out.write("                                    <!-- Iteración sobre la lista de usuarios -->\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                </tbody>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Modal para agregar usuario -->\r\n");
      out.write("                <div class=\"modal fade\" id=\"agregarUsuarioModal\" tabindex=\"-1\" aria-labelledby=\"agregarUsuarioModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("                    <div class=\"modal-dialog\">\r\n");
      out.write("                        <div class=\"modal-content\">\r\n");
      out.write("                            <div class=\"modal-header\">\r\n");
      out.write("                                <h5 class=\"modal-title\" id=\"agregarUsuarioModalLabel\">Agregar Usuario</h5>\r\n");
      out.write("                                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-body\">\r\n");
      out.write("                                <form action=\"/Estanco_web/CtrUsuario?accion=nuevo\" method=\"post\">\r\n");
      out.write("                                    <input type=\"hidden\" name=\"accion\" value=\"agregar\">\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"mb-3\">\r\n");
      out.write("                                        <label for=\"nombre\" class=\"form-label\">Nombre</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"nombre\" id=\"nombre\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"mb-3\">\r\n");
      out.write("                                        <label for=\"apellido\" class=\"form-label\">Apellido</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"apellido\" id=\"apellido\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"mb-3\">\r\n");
      out.write("                                        <label for=\"direccion\" class=\"form-label\">Dirección</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"direccion\" id=\"direccion\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"mb-3\">\r\n");
      out.write("                                        <label for=\"telefono\" class=\"form-label\">Teléfono</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"telefono\" id=\"telefono\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"input-group\">\r\n");
      out.write("                                        <label for=\"correo\" class=\"form-label\">Fecha_nacimiento</label>\r\n");
      out.write("                                        <i class=\"fas fa-calendar icon\"></i>\r\n");
      out.write("                                        <input type=\"date\" class=\"formulario_input\" name=\"fechanaci\" id=\"fechanaci\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"mb-3\">\r\n");
      out.write("                                        <label for=\"correo\" class=\"form-label\">Correo</label>\r\n");
      out.write("                                        <input type=\"email\" class=\"form-control\" name=\"correo\" id=\"correo\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"mb-3\">\r\n");
      out.write("                                        <label for=\"usuario\" class=\"form-label\">Usuario</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"usuario\" id=\"usuario\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"mb-3\">\r\n");
      out.write("                                        <label for=\"contrasena\" class=\"form-label\">contraseña</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"contrasena\" id=\"contrasena\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"mb-3\">\r\n");
      out.write("                                        <label for=\"tipo\" class=\"form-label\">Tipo</label>\r\n");
      out.write("                                        <select class=\"form-control\" name=\"tipo\" id=\"tipo\" required>\r\n");
      out.write("                                            <option value=\"Administrador\">Administrador</option>\r\n");
      out.write("                                            <option value=\"Cliente\">Cliente</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"modal-footer\">\r\n");
      out.write("                                        <button type=\"button\" hrf=\"/Estanco_web/vista/ListarUsuario.jsp\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Cancelar</button>\r\n");
      out.write("                                        <button type=\"submit\" hrf=\"/Estanco_web/vista/ListarUsuario.jsp\" class=\"btn btn-primary\">Agregar Usuario</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </main>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.js\"></script>                        \r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" crossorigin=\"anonymous\"></script>  \r\n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-rbsA0bDhUn/TxU+0bD6I4BO15AVY8l+t9f/4coiTrTWGFj1PSJrAKFENIG+9j2N\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </body>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("usu");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarios}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <tr>\r\n");
          out.write("                                        <td class=\"text-center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td class=\"text-center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td class=\"text-center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getApellido()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td class=\"text-center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getFecha_nacimiento()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td class=\"text-center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getDireccion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td class=\"text-center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getTelefono()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td class=\"text-center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getCorreo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td class=\"text-center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getUsuario()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td class=\"text-center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getTipo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td class=\"text-center\">\r\n");
          out.write("                                            <!-- Botón Editar -->\r\n");
          out.write("                                            <a class=\"btn btn-warning\" href=\"#\" data-bs-toggle=\"modal\" data-bs-target=\"#editarUsuarioModal");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                                <i class=\"bi bi-pencil-fill\"></i>\r\n");
          out.write("                                            </a>\r\n");
          out.write("\r\n");
          out.write("                                            <!-- Botón Eliminar -->\r\n");
          out.write("                                            <a class=\"btn btn-danger\" href=\"/Estanco_web/CtrUsuario?accion=eliminar&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                                <i class=\"bi bi-trash-fill\"></i>\r\n");
          out.write("                                            </a>\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                    </tr>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("usu");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarios}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <!-- Modal para editar usuario -->\r\n");
          out.write("                                    <div class=\"modal fade\" id=\"editarUsuarioModal");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" tabindex=\"-1\" aria-labelledby=\"editarUsuarioModalLabel\" aria-hidden=\"true\">\r\n");
          out.write("                                        <div class=\"modal-dialog\">\r\n");
          out.write("                                            <div class=\"modal-content\">\r\n");
          out.write("                                                <div class=\"modal-header\">\r\n");
          out.write("                                                    <h5 class=\"modal-title\" id=\"editarUsuarioModalLabel\">Editar Usuario</h5>\r\n");
          out.write("                                                    <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                                <div class=\"modal-body\">\r\n");
          out.write("                                                    <form action=\"/Estanco_web/CtrUsuario?accion=actualizar\" method=\"post\">\r\n");
          out.write("                                                        <input type=\"hidden\" name=\"accion\" value=\"actualizar\">\r\n");
          out.write("                                                        <input type=\"hidden\" name=\"id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("\r\n");
          out.write("                                                        <div class=\"mb-3\">\r\n");
          out.write("                                                            <label for=\"nombre");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"form-label\">Nombre</label>\r\n");
          out.write("                                                            <input type=\"text\" class=\"form-control\" name=\"nombre\" id=\"nombre");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" required>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("\r\n");
          out.write("                                                        <div class=\"mb-3\">\r\n");
          out.write("                                                            <label for=\"apellido");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"form-label\">Apellido</label>\r\n");
          out.write("                                                            <input type=\"text\" class=\"form-control\" name=\"apellido\" id=\"apellido");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getApellido()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" required>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("\r\n");
          out.write("                                                        <div class=\"mb-3\">\r\n");
          out.write("                                                            <label for=\"fecha_nacimiento");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"form-label\">Fecha de Nacimiento</label>\r\n");
          out.write("                                                            <input type=\"date\" class=\"form-control\" name=\"fecha_nacimiento\" id=\"fecha_nacimiento");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getFecha_nacimiento()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" required>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("\r\n");
          out.write("                                                        <div class=\"mb-3\">\r\n");
          out.write("                                                            <label for=\"direccion");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"form-label\">Dirección</label>\r\n");
          out.write("                                                            <input type=\"text\" class=\"form-control\" name=\"direccion\" id=\"direccion");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getDireccion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" required>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("\r\n");
          out.write("                                                        <div class=\"mb-3\">\r\n");
          out.write("                                                            <label for=\"telefono");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"form-label\">Teléfono</label>\r\n");
          out.write("                                                            <input type=\"text\" class=\"form-control\" name=\"telefono\" id=\"telefono");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getTelefono()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" required>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("\r\n");
          out.write("                                                        <div class=\"mb-3\">\r\n");
          out.write("                                                            <label for=\"correo");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"form-label\">Correo</label>\r\n");
          out.write("                                                            <input type=\"email\" class=\"form-control\" name=\"correo\" id=\"correo");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getCorreo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" required>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("\r\n");
          out.write("                                                        <div class=\"mb-3\">\r\n");
          out.write("                                                            <label for=\"usuario");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"form-label\">Usuario</label>\r\n");
          out.write("                                                            <input type=\"text\" class=\"form-control\" name=\"usuario\" id=\"usuario");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getUsuario()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" required>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("\r\n");
          out.write("                                                        <div class=\"mb-3\">\r\n");
          out.write("                                                            <label for=\"tipo");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"form-label\">Tipo</label>\r\n");
          out.write("                                                            <select class=\"form-control\" name=\"tipo\" id=\"tipo");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" required>\r\n");
          out.write("                                                                <option value=\"Administrador\" ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getTipo() == 'Administrador' ? 'selected' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">Administrador</option>\r\n");
          out.write("                                                                <option value=\"Cliente\" ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getTipo() == 'Cliente' ? 'selected' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">Cliente</option>\r\n");
          out.write("                                                            </select>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("\r\n");
          out.write("                                                        <div class=\"modal-footer\">\r\n");
          out.write("                                                            <button type=\"submit\" class=\"btn btn-primary\">Guardar cambios</button>\r\n");
          out.write("                                                            <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Cancelar</button>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("                                                    </form>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
