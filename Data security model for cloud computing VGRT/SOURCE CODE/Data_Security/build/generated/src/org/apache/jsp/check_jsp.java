package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import network.DbConnection;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public final class check_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<title>An Efficient File Hierarchy</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/coin-slider.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-aller.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/coin-slider.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"main\">\n");
      out.write("  <div class=\"header\">\n");
      out.write("    <div class=\"header_resize\">\n");
      out.write("      <div class=\"logo\">\n");
      out.write("        <h1><a href=\"index.html\">An Efficient File Hierarchy Attribute-Based\n");
      out.write("                Encryption &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Scheme in Cloud Computing</a></h1>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"menu_nav\">\n");
      out.write("        <ul>\n");
      out.write("          <li><a href=\"admin_home.jsp\"><span>Admin Home</span></a></li>\n");
      out.write("          <li><a href=\"user_de.jsp\"><span>User Details</span></a></li>\n");
      out.write("          <li><a href=\"owner_de.jsp\"><span>Owner Details</span></a></li>\n");
      out.write("          <li><a href=\"research_de.jsp\"><span>Researcher Details</span></a></li>\n");
      out.write("           <li class=\"active\"><a href=\"user_req.jsp\"><span>User Request</span></a></li>\n");
      out.write("           <li><a href=\"researcher_req.jsp\"><span>Researcher Request</span></a></li>\n");
      out.write("           <li><a href=\"download_de.jsp\"><span>Downloaded file</span></a></li>\n");
      out.write("          <li><a href=\"index.jsp\"><span>logout</span></a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("     \n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"content\">\n");
      out.write("      <div class=\"content_resize\">\n");
      out.write("<!-- start body---->\n");
      out.write("   <!-- /.container -->\n");
      out.write("  ");

//                        String uname = session.getAttribute("name").toString();
                        String search = request.getParameter("search");
                        System.out.println("get the search"+search);
                        session.setAttribute("search", search);
                    
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"box\" style=\"height: 400px;\">\n");
      out.write("                    <!--To do you work-->\n");
      out.write("                    <div style=\"border: 1px solid white;height: 350px;border-top-width: 20px;border-bottom-width: 10px\">\n");
      out.write("                        <center><h3>User Details</h3></center><br />\n");
      out.write("                        <table border=\"1\" style=\"text-align: center;margin-left: 80px\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th style=\"text-align: center;width: 70px;\">File ID</th>\n");
      out.write("                                <th style=\"text-align: center;width: 70px;\">Client Name</th>\n");
      out.write("                                <th style=\"text-align: center;width: 100px;\">File Name</th>\n");
      out.write("                                <th style=\"text-align: center;width: 300px;\">Data</th>\n");
      out.write("                                <th style=\"text-align: center; width: 100px;\">View</th>\n");
      out.write("                                <th style=\"text-align: center; width: 100px;\">Download</th>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                               ");
int fid=0;
                                Connection con = null;
                                Statement st = null;
                                ResultSet rs = null;
                                try {
                                    con = DbConnection.getConnection();
                                    st = con.createStatement();
                                    rs = st.executeQuery("select * from uploads where secretkey LIKE '" + search + "'");
                                    if (rs.next()) {
                                   
//                                  
                                      	do{		
                                      
                            
      out.write("\n");
      out.write("    \n");
      out.write("                               \n");
      out.write("                                <td>");
      out.print(rs.getString("fileid"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString("cname"));
      out.write("</td>     \n");
      out.write("                                <td>");
      out.print(rs.getString("filename"));
      out.write("</td>     \n");
      out.write("                                <td>");
      out.print(rs.getString("date"));
      out.write("</td>     \n");
      out.write("                                <td> <a href=\"view_file.jsp?");
      out.print(rs.getString("id"));
      out.write("\"><font style=\"color: green\">Send</a></font> </td>  \n");
      out.write("                                <td> <a href=\"u_mail.jsp?");
      out.print(rs.getString("id"));
      out.write("\"><font style=\"color: green\">Send</a></font> </td>   \n");
      out.write("                                        <tr />\n");
      out.write("                                        \n");
      out.write("                                     ");
 }while (rs.next());
      out.write("\n");
      out.write("                                     \n");
      out.write("                                     ");
 }else{ 
                                        response.sendRedirect("other1.jsp");
                                        
   
      out.write("   \n");
      out.write("                                        ");
 } 
                                    } catch (Exception ex) {
                                        ex.printStackTrace();
                                    }

                                
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- end body---->\n");
      out.write("<br></br><br></br>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"fbg\">\n");
      out.write("    <div class=\"fbg_resize\">\n");
      out.write("    \n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"footer\">\n");
      out.write("    <div class=\"footer_resize\">\n");
      out.write("      <p class=\"lf\">&copy; Copyright <a href=\"http://www.jpinfotech.com/\"></a>Jp</p>\n");
      out.write("      <p class=\"rf\"><a href=\"\"></a></p>\n");
      out.write("      <div style=\"clear:both;\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div align=center>This template  downloaded form <a href='http://all-free-download.com/free-website-templates/'>free website templates</a></div></body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
