package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class VentasCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
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
      out.write("        <link href=\"/Estanco_web/css/inicio.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <title>Estanco Currambero</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    ");
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
      out.write("                    <div class=\"dropdown ms-3\">\r\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                            <i class=\"bi bi-person\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-menu-end\" aria-labelledby=\"userDropdown\">\r\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\">Ciente</a></li>\r\n");
      out.write("                            <li><a class=\"dropdown-item text-center\" href=\"/Estanco_web/CtrProducto?accion=salir\">Salir</a></li>\r\n");
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
      out.write("                    <img src=\"/Estanco_web/imagenes/img1.jpg\" alt=\"\"/>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <div class=\"title\">TODO TIPO</div>\r\n");
      out.write("                        <div class=\"topic\">DE CERVEZAS</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <img src=\"/Estanco_web/imagenes/img2.jpg\" alt=\"\"/>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <div class=\"title\">Licores</div>\r\n");
      out.write("                        <div class=\"topic\">Y RON</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <img src=\"/Estanco_web/imagenes/img3.jpg\" alt=\"\"/>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <div class=\"title\">MECATOS</div>\r\n");
      out.write("                        <div class=\"topic\">Y MÁS...</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <img src=\"/Estanco_web/imagenes/img4.jpg\" alt=\"\"/>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <div class=\"title\">GASEOSAS</div>\r\n");
      out.write("                        <div class=\"topic\">Y ENERGIZANTES</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <img src=\"/Estanco_web/imagenes/img1.jpg\" alt=\"\"/>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <div class=\"title\">\r\n");
      out.write("                            Contamos con todo tipo de Cervezas.\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <img src=\"/Estanco_web/imagenes/img2.jpg\" alt=\"\"/>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <div class=\"title\">\r\n");
      out.write("                            ¡Los mejores licores y ron del mercado!!\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <img src=\"/Estanco_web/imagenes/img3.jpg\" alt=\"\"/>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <div class=\"title\">\r\n");
      out.write("                            ¡Mecatos y más!\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <img src=\"/Estanco_web/imagenes/img4.jpg\" alt=\"\"/>\r\n");
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
      out.write("        \r\n");
      out.write("        <div class=\"product-container\">\r\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <footer>\r\n");
      out.write("        <div class=\"container-fluid\" style=\"background-color: black; color: white; padding: 20px;\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <h5>Sobre Nosotros</h5>\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("p");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                <div class=\"product-card\">\r\n");
          out.write("                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getFoto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                    <h2>");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("</h2>\r\n");
          out.write("                    <div class=\"price-container\">\r\n");
          out.write("                        <div class=\"price\">$");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("</div>\r\n");
          out.write("                        <a href=\"/Estanco_web/CtrProducto?accion=AgregarCarrito&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"order-btn\">\r\n");
          out.write("                            <i class=\"bi bi-cart3\"></i>\r\n");
          out.write("                        </a>\r\n");
          out.write("                    </div>\r\n");
          out.write("                </div>\r\n");
          out.write("            ");
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

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getNombre()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getPrecio()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }
}
