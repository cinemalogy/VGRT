package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import network.DbConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class c_005fdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <title>Military Networks</title>\n");
      out.write("        <!-- Bootstrap Core CSS -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link href=\"css/business-casual.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Fonts -->\n");
      out.write("        <link href=\"http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"http://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("         <div class=\"brand\">DATA SECURITY MODEL FOR CLOUD\n");
      out.write("COMPUTING<br>USING V -GRT\n");
      out.write("METHODOLOGY</div>\n");
      out.write("        <!-- Navigation -->\n");
      out.write("        <nav class=\"navbar navbar-default\" role=\"navigation\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <!-- navbar-brand is hidden on larger screens, but visible when the menu is collapsed -->\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.html\">Business Casual</a>\n");
      out.write("                </div>\n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                                        <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"c_home.jsp\">Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"c_profile.jsp\">Profile</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"file_upload.jsp\">File Upload</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"c_details.jsp\">View Command</a>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"index.jsp\">Logout</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.navbar-collapse -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.container -->\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"box\" style=\"height: 400px;\">\n");
      out.write("                    <!--To do you work-->\n");
      out.write("                    <div style=\"border: 1px solid white;height: 350px;border-top-width: 20px;border-bottom-width: 10px\">\n");
      out.write("                        <center><h3>Commander Details</h3></center><br />\n");
      out.write("                        <table border=\"1\" style=\"text-align: center;margin-left: 440px\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th style=\"text-align: center;width: 70px;\">ID</th>\n");
      out.write("                                <th style=\"text-align: center;width: 100px;\">File Name</th>\n");
      out.write("<!--                                <th style=\"text-align: center;width: 300px;\">File</th>-->\n");
      out.write("                                <!--\n");
      out.write("-->                                <th style=\"text-align: center;width: 60px;\">Date</th><!--\n");
      out.write("-->                                <!--\n");
      out.write("                                <th style=\"text-align: center;width: 100px;\">Date of Birth</th>-->\n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                ");

                                    Connection con = null;
                                    Statement st = null;
                                    ResultSet rs = null;
                                    try {
                                        con = DbConnection.getConnection();
                                        st = con.createStatement();
                                        rs = st.executeQuery("select * from upload ");
                                        while(rs.next())
                                        {
      out.write("\n");
      out.write("                                        <td>");
      out.print(rs.getString("file_id"));
      out.write("</td>     \n");
      out.write("                                        <td>");
      out.print(rs.getString("file_name"));
      out.write("</td>    \n");
      out.write("                                        <td>");
      out.print(rs.getString("date"));
      out.write("</td>    \n");
      out.write("\n");
      out.write("                                    \n");
      out.write("                        \n");
      out.write("                                        </tr>\n");
      out.write("                                        ");
} 
                                    } catch (Exception ex) {
                                        ex.printStackTrace();
                                    }

                                
      out.write("\n");
      out.write("                        </table></center>\n");
      out.write("                    </div> \n");
      out.write("        </div>\n");
      out.write("        <!-- /.container -->\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12 text-center\">\n");
      out.write("                        <p>Copyright &copy; 2015-2016\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
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
