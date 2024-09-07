package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Producto;
import Modelo.ProductoDAO;

public final class ProductoDes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("        <title>Producto Descripcion</title>\r\n");
      out.write("        <link href=\"/Estanco_web/css/inicio.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            background: linear-gradient(120deg, #f0f4f8, #d9e2ec);\r\n");
      out.write("            font-family: 'Roboto', sans-serif;\r\n");
      out.write("            color: #343a40;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        header {\r\n");
      out.write("            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar-dark {\r\n");
      out.write("            background-color: #343a40;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar-dark .navbar-brand, \r\n");
      out.write("        .navbar-dark .nav-link {\r\n");
      out.write("            color: #ffffff;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar-dark .nav-link:hover {\r\n");
      out.write("            color: #ffc107;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar-dark .nav-link i {\r\n");
      out.write("            color: #ffffff; \r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        .container {\r\n");
      out.write("            background: #ffffff;\r\n");
      out.write("            padding: 40px;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.15);\r\n");
      out.write("            margin-top: 30px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        h1 {\r\n");
      out.write("            font-weight: 700;\r\n");
      out.write("            color: #495057;\r\n");
      out.write("            text-transform: uppercase;\r\n");
      out.write("            border-bottom: 3px solid #ffa500;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            padding-bottom: 10px;\r\n");
      out.write("            margin-bottom: 30px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .table-striped tbody tr:nth-of-type(odd) {\r\n");
      out.write("            background-color: rgba(0, 0, 0, 0.03);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .table thead {\r\n");
      out.write("            background-color: #007bff;\r\n");
      out.write("            color: #ffffff;\r\n");
      out.write("            text-transform: uppercase;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn-primary {\r\n");
      out.write("            background-color: #007bff;\r\n");
      out.write("            border-color: #007bff;\r\n");
      out.write("            transition: all 0.3s;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn-primary:hover {\r\n");
      out.write("            background-color: #0056b3;\r\n");
      out.write("            border-color: #004085;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn-warning {\r\n");
      out.write("            background-color: #ffcc00;\r\n");
      out.write("            border-color: #ffcc00;\r\n");
      out.write("            transition: all 0.3s;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn-warning:hover {\r\n");
      out.write("            background-color: #cc9900;\r\n");
      out.write("            border-color: #cc9900;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn-danger {\r\n");
      out.write("            background-color: #e60000;\r\n");
      out.write("            border-color: #e60000;\r\n");
      out.write("            transition: all 0.3s;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn-danger:hover {\r\n");
      out.write("            background-color: #cc0000;\r\n");
      out.write("            border-color: #cc0000;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .modal-content {\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            background: #f8f9fa;\r\n");
      out.write("            box-shadow: 0 6px 12px rgba(0, 0, 0, 0.2);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form-label {\r\n");
      out.write("            font-weight: 600;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn-close {\r\n");
      out.write("            background-color: #e60000;\r\n");
      out.write("            color: #ffffff;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn-close:hover {\r\n");
      out.write("            background-color: #cc0000;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .dropdown-menu {\r\n");
      out.write("            border-radius: 8px;\r\n");
      out.write("            background: #f8f9fa;\r\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.15);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .dropdown-item:hover {\r\n");
      out.write("            background-color: #007bff;\r\n");
      out.write("            color: #ffffff;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
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
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
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
      out.write("        ");

        // Obtener el ID del producto desde la solicitud
        String idStr = request.getParameter("id");
        if (idStr != null) {
            int productId = Integer.parseInt(idStr);
            ProductoDAO productoDAO = new ProductoDAO();
            Producto producto = productoDAO.getProductoById(productId);
            if (producto == null) {
                out.println("Producto no encontrado.");
                return;
            }
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container mt-5\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <!-- Product Image -->\r\n");
      out.write("            <div class=\"col-md-6\">\r\n");
      out.write("                <img src=\"");
      out.print( producto.getFoto() );
      out.write("\" class=\"img-fluid\" alt=\"");
      out.print( producto.getNombre() );
      out.write("\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-md-6\">\r\n");
      out.write("                <h1 class=\"product-title\">");
      out.print( producto.getNombre() );
      out.write("</h1>\r\n");
      out.write("                <p class=\"product-price text-success\" style=\"font-size: 1.5rem;\">$ ");
      out.print( producto.getPrecio() );
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"product-features list-unstyled\">\r\n");
      out.write("                    <li><i class=\"bi bi-check-circle-fill text-success\"></i> Característica 1</li>\r\n");
      out.write("                    <li><i class=\"bi bi-check-circle-fill text-success\"></i> Característica 2</li>\r\n");
      out.write("                    <li><i class=\"bi bi-check-circle-fill text-success\"></i> Característica 3</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("                <!-- Botones organizados en columna -->\r\n");
      out.write("                <div class=\"d-grid gap-2\">\r\n");
      out.write("                    <button class=\"btn btn-primary btn-checkout\">Método de pago</button>\r\n");
      out.write("                    <button class=\"btn btn-danger btn-checkout\">Generar pedido</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Product Description -->\r\n");
      out.write("        <div class=\"row mt-5\">\r\n");
      out.write("            <div class=\"col-12\">\r\n");
      out.write("                <h4>Descripción del Producto</h4>\r\n");
      out.write("                <p>");
      out.print( producto.getDescripcion() );
      out.write("</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    ");

        } else {
            out.println("ID de producto no proporcionado.");
        }
    
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("                        <h5 class=\"modal-title mb-4\" id=\"registerModalLabel\" style=\"color: black;\">Crea tu Cuenta</h5>\r\n");
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
      out.write("                            <button type=\"submit\" class=\"btn custom-btn w-75\">Crear Cuenta</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <p class=\"mt-4\" style=\"color: black;\">¿Ya tienes una cuenta? <a href=\"#\" data-bs-toggle=\"modal\" data-bs-target=\"#IniciarSesion\">Inicia Sesión</a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("c");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categorias}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <li><a class=\"dropdown-item\" href=\"/Estanco_web/CtrProducto?accion=buscarcat&catid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\r\n");
          out.write("                                <input type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"catid\" id=\"catid\">\r\n");
          out.write("                            ");
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
}
