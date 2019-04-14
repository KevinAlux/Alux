package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Practica LDOO</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Iniciar Sesion</h1>\n");
      out.write("        <form action=IniciarSesion.java\" metho=\"post\" >\n");
      out.write("            <div>\n");
      out.write("\t\t<label for=\"nombre\"><b>Nombre(s)</b></label>\n");
      out.write("\t\t<input type=\"text\" placeholder=\"¿Cual es tu nombre?\" name=\"nombre\" required><br>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t<label for=\"nacimiento\"><b>Apellidos</b></label>\n");
      out.write("                <input type=\"text\" placeholder=\"Apellidos\" name=\"apellidos\" required><br>\n");
      out.write("\n");
      out.write("                <label for=\"email\"><b>Email</b></label>\n");
      out.write("                <input type=\"text\" placeholder=\"Email\" name=\"usuario\" required><br>\n");
      out.write("\t\t\t\t\t\n");
      out.write("                <label for=\"psw\"><b>Password</b></label>\n");
      out.write("                <input type=\"password\" placeholder=\"Password\" name=\"password\" required><br>\n");
      out.write("\t\t\t\t\t\n");
      out.write("                <label for=\"psw-repeat\"><b>Repeat Password</b></label>\n");
      out.write("\t\t<input type=\"password\" placeholder=\"Repeat Password\" name=\"password-repeat\" required><br>\n");
      out.write("\t\t\t\t\t\n");
      out.write("                <input type=\"submit\" value=\"Iniciar Sesion\">\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <br>\n");
      out.write("        Si no tienes una cuenta <a href=\"Registro.jsp\">¡Registrate!</a>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
