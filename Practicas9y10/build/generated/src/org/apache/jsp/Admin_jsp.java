package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Registro de Administrador</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1> Formulario </h1>\n");
      out.write("        <form action=\"RegistrarUsuarios\" method=\"post\">\n");
      out.write("            Usuario\n");
      out.write("            <input type=\"text\" name=\"user\"><br>\n");
      out.write("            Contraseña\n");
      out.write("            <input type=\"password\" name=\"password\"><br>\n");
      out.write("            Fecha de nacimiento\n");
      out.write("            <input type=\"date\" name=\"nacimiento\"><br>\n");
      out.write("            Email\n");
      out.write("            <input type=\"text\" name=\"email\"><br>\n");
      out.write("            <input type=\"hidden\" name=\"usertype\" value=\"Admin\">\n");
      out.write("            ID\n");
      out.write("            <input type=\"text\" name=\"userid\"><br>\n");
      out.write("            Número de empleado\n");
      out.write("            <input type=\"text\" name=\"employeenumber\"><br>\n");
      out.write("            <input type=\"submit\" value=\"Regístrate\">\n");
      out.write("        </form>\n");
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