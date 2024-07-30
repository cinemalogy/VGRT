package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Algorithms.CaesarCipher;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import network.DbConnection;

public final class ceaser_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

//    String j = request.getQueryString();
//                Connection con = DbConnection.getConnection();
//                Statement st =con.createStatement();
//int id=Integer.parseInt(request.getQueryString());
int IDS=1;
String filename="W6187hAmEnQ49JEXW4a8ng==";

 String CaesarCipher = new CaesarCipher().encrypt(filename.toString(), IDS);
 System.out.println("CEASER"+CaesarCipher);
//    int i = st.executeUpdate("update reg set request = 'Yes' where id = '" + id + "'");
//    if (i != 0) {
//        response.sendRedirect("csp_c_details.jsp?msg=Request_Sent_Successfully");
//    } else {
//        response.sendRedirect("csp_c_details.jsp?msgg=Error");
//    }

      out.write('\n');
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
