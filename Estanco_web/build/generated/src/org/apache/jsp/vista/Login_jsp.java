package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Login</title>\r\n");
      out.write("        <style>\r\n");
      out.write("            body {\r\n");
      out.write("\r\n");
      out.write("                background-image: url('https://cdn-3.expansion.mx/dims4/default/5b31df7/2147483647/strip/true/crop/1000x697+0+0/resize/1800x1255!/format/webp/quality/80/?url=https%3A%2F%2Fcdn-3.expansion.mx%2F34%2F3c%2Fca9a313849ddb6060b87cb6d5b85%2F2017-01-27t120000z-1783701375-rc1a6ec49670-rtrmadp-3-usa-trump-mexico-corona.JPG');\r\n");
      out.write("                background-size: cover;\r\n");
      out.write("                display: flex;\r\n");
      out.write("                justify-content: center;\r\n");
      out.write("                align-items: center;\r\n");
      out.write("                height: 100vh;\r\n");
      out.write("                margin: 0;\r\n");
      out.write("                font-family: Arial, sans-serif;\r\n");
      out.write("            }\r\n");
      out.write("            .login-container {\r\n");
      out.write("\r\n");
      out.write("                background: rgba(355, 355, 355, 0.0);\r\n");
      out.write("                padding: 20px;\r\n");
      out.write("                border-radius: 8px;\r\n");
      out.write("                box-shadow: 0 4px 8px rgba(0, 0, 0, 0.0);\r\n");
      out.write("                width: 300px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("            .login-container h2 {\r\n");
      out.write("                margin-bottom: 20px;\r\n");
      out.write("                color: #ffffff;\r\n");
      out.write("                border-radius: 1px;\r\n");
      out.write("            }\r\n");
      out.write("            .login-container input {\r\n");
      out.write("                background: rgba(355, 355, 355, 0.8);\r\n");
      out.write("                border-radius: 4px; \r\n");
      out.write("                width: 100%;\r\n");
      out.write("                padding: 10px;\r\n");
      out.write("                margin-bottom: 20px;\r\n");
      out.write("                border: 1px solid #ccc;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            .login-container button {\r\n");
      out.write("\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                padding: 10px;\r\n");
      out.write("                border: none;\r\n");
      out.write("                border-radius: 4px;\r\n");
      out.write("                background-color:darkorange;\r\n");
      out.write("                color: white;\r\n");
      out.write("                font-size: 16px;\r\n");
      out.write("                width: 200px;\r\n");
      out.write("            }\r\n");
      out.write("            .login-container a {\r\n");
      out.write("                padding-top: 9px;\r\n");
      out.write("                display: block;\r\n");
      out.write("                margin-top: 10px;\r\n");
      out.write("                color: #007bff; \r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .usuario{\r\n");
      out.write("\r\n");
      out.write("                color:black;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            img{\r\n");
      out.write("                height: 50px;\r\n");
      out.write("                width: 60px \r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    ");
String Mensaje = "";
    if (request.getParameter("ingreso")!= null){
        int i = Integer.parseInt(request.getParameter("ingreso"));
        if (i == 0){
            Mensaje = "Error: Datos Incorectos";
        }
    }
    
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"login-container\">\r\n");
      out.write("\r\n");
      out.write("            <img src=\"https://i.pinimg.com/236x/8d/59/9e/8d599e77e07f1d4a7f48a42926893e06.jpg\" >\r\n");
      out.write("            <h2>BIENVENIDO</h2>\r\n");
      out.write("            <form action=\"/Estanco_web/CtrValidar\" method=\"post\">\r\n");
      out.write("                <input class=\"usuario\" name=\"txtuser\"type=\"text\" placeholder=\"Usuario\" required> \r\n");
      out.write("                <input class=\"usuario\" name=\"txtpass\" type=\"password\" placeholder=\"Contraseña\" required>\r\n");
      out.write("                <button type=\"submit\" name=\"accion\" value=\"Ingresar\">Iniciar Sesión</button>\r\n");
      out.write("                <p style=\"Color: red;\">");
      out.print(Mensaje );
      out.write("</p>\r\n");
      out.write("                <a href=\"#\">Registrarse</a>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
