package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      <meta charset=\"UTF-8\"> \n");
      out.write("      <title>Registro</title>\n");
      out.write("   </head>\n");
      out.write("\n");
      out.write("       <h1>Registro</h1>\n");
      out.write("       <form action=\"Redirect\" method=\"POST\"> \n");
      out.write("           <label> Nombre </label> \n");
      out.write("           <input type=\"text\" name=\"nombre\"/><br>\n");
      out.write("           <label> Apellido </label> \n");
      out.write("           <input type=\"text\" name=\"apellido\"/><br>\n");
      out.write("           <label> Email </label> \n");
      out.write("           <input type=\"text\" name=\"usuario\"/><br>\n");
      out.write("           <label> Contraseña </label> \n");
      out.write("           <input type=\"password\" name=\"password\"/><br>  \n");
      out.write("           <label> Repite la contraseña </label> \n");
      out.write("           <input type=\"password\" name=\"password-repeat\"/><br>\n");
      out.write("           <input type=\"submit\" name=\"Registrarse\" value=\"Registro\"/>\n");
      out.write("           \n");
      out.write("           <select name=\"usertype\">\n");
      out.write("                <option value=\"Invitado\">Invitado</option>\n");
      out.write("                <option value=\"UsuarioNormal\">Usuario</option>\n");
      out.write("                <option value=\"Admin\">Administrador</option>\n");
      out.write("           </select>\n");
      out.write("            <input type=\"submit\" value=\"Enviar\">\n");
      out.write("       </form>\n");
      out.write("   </body>\n");
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
