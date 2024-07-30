package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class client_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("    <title>Commander</title>\n");
      out.write("<style>\n");
      out.write("      /* NOTE: The styles were added inline because Prefixfree needs access to your styles and they must be inlined if they are on local disk! */\n");
      out.write("      body {\n");
      out.write("  font-family: \"Open Sans\", sans-serif;\n");
      out.write("  height: 100vh;\n");
      out.write("  background: url(\"img/2.jpg\") 50% fixed;\n");
      out.write("  background-size: cover;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes spinner {\n");
      out.write("  0% {\n");
      out.write("    transform: rotateZ(0deg);\n");
      out.write("  }\n");
      out.write("  100% {\n");
      out.write("    transform: rotateZ(359deg);\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".wrapper {\n");
      out.write("  display: flex;\n");
      out.write("  align-items: center;\n");
      out.write("  flex-direction: column;\n");
      out.write("  justify-content: center;\n");
      out.write("  width: 100%;\n");
      out.write("  min-height: 100%;\n");
      out.write("  padding: 20px;\n");
      out.write("  background: rgba(4, 40, 68, 0.85);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login {\n");
      out.write("  border-radius: 2px 2px 5px 5px;\n");
      out.write("  padding: 10px 20px 20px 20px;\n");
      out.write("  width: 90%;\n");
      out.write("  max-width: 320px;\n");
      out.write("  background: #ffffff;\n");
      out.write("  position: relative;\n");
      out.write("  padding-bottom: 80px;\n");
      out.write("  box-shadow: 0px 1px 5px rgba(0, 0, 0, 0.3);\n");
      out.write("}\n");
      out.write(".login.loading button {\n");
      out.write("  max-height: 100%;\n");
      out.write("  padding-top: 50px;\n");
      out.write("}\n");
      out.write(".login.loading button .spinner {\n");
      out.write("  opacity: 1;\n");
      out.write("  top: 40%;\n");
      out.write("}\n");
      out.write(".login.ok button {\n");
      out.write("  background-color: #8bc34a;\n");
      out.write("}\n");
      out.write(".login.ok button .spinner {\n");
      out.write("  border-radius: 0;\n");
      out.write("  border-top-color: transparent;\n");
      out.write("  border-right-color: transparent;\n");
      out.write("  height: 20px;\n");
      out.write("  animation: none;\n");
      out.write("  transform: rotateZ(-45deg);\n");
      out.write("}\n");
      out.write(".login input {\n");
      out.write("  display: block;\n");
      out.write("  padding: 15px 10px;\n");
      out.write("  margin-bottom: 10px;\n");
      out.write("  width: 100%;\n");
      out.write("  border: 1px solid #ddd;\n");
      out.write("  transition: border-width 0.2s ease;\n");
      out.write("  border-radius: 2px;\n");
      out.write("  color: #ccc;\n");
      out.write("}\n");
      out.write(".login input + i.fa {\n");
      out.write("  color: #fff;\n");
      out.write("  font-size: 1em;\n");
      out.write("  position: absolute;\n");
      out.write("  margin-top: -47px;\n");
      out.write("  opacity: 0;\n");
      out.write("  left: 0;\n");
      out.write("  transition: all 0.1s ease-in;\n");
      out.write("}\n");
      out.write(".login input:focus {\n");
      out.write("  outline: none;\n");
      out.write("  color: #444;\n");
      out.write("  border-color: #2196F3;\n");
      out.write("  border-left-width: 35px;\n");
      out.write("}\n");
      out.write(".login input:focus + i.fa {\n");
      out.write("  opacity: 1;\n");
      out.write("  left: 30px;\n");
      out.write("  transition: all 0.25s ease-out;\n");
      out.write("}\n");
      out.write(".login a {\n");
      out.write("  font-size: 0.8em;\n");
      out.write("  color: #2196F3;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write(".login .title {\n");
      out.write("  color: #444;\n");
      out.write("  font-size: 1.2em;\n");
      out.write("  font-weight: bold;\n");
      out.write("  margin: 10px 0 30px 0;\n");
      out.write("  border-bottom: 1px solid #eee;\n");
      out.write("  padding-bottom: 20px;\n");
      out.write("}\n");
      out.write(".login button {\n");
      out.write("  width: 100%;\n");
      out.write("  height: 100%;\n");
      out.write("  padding: 10px 10px;\n");
      out.write("  background: #2196F3;\n");
      out.write("  color: #fff;\n");
      out.write("  display: block;\n");
      out.write("  border: none;\n");
      out.write("  margin-top: 20px;\n");
      out.write("  position: absolute;\n");
      out.write("  left: 0;\n");
      out.write("  bottom: 0;\n");
      out.write("  max-height: 60px;\n");
      out.write("  border: 0px solid rgba(0, 0, 0, 0.1);\n");
      out.write("  border-radius: 0 0 2px 2px;\n");
      out.write("  transform: rotateZ(0deg);\n");
      out.write("  transition: all 0.1s ease-out;\n");
      out.write("  border-bottom-width: 7px;\n");
      out.write("}\n");
      out.write(".login button .spinner {\n");
      out.write("  display: block;\n");
      out.write("  width: 40px;\n");
      out.write("  height: 40px;\n");
      out.write("  position: absolute;\n");
      out.write("  border: 4px solid #ffffff;\n");
      out.write("  border-top-color: rgba(255, 255, 255, 0.3);\n");
      out.write("  border-radius: 100%;\n");
      out.write("  left: 50%;\n");
      out.write("  top: 0;\n");
      out.write("  opacity: 0;\n");
      out.write("  margin-left: -20px;\n");
      out.write("  margin-top: -20px;\n");
      out.write("  animation: spinner 0.6s infinite linear;\n");
      out.write("  transition: top 0.3s 0.3s ease, opacity 0.3s 0.3s ease, border-radius 0.3s ease;\n");
      out.write("  box-shadow: 0px 1px 0px rgba(0, 0, 0, 0.2);\n");
      out.write("}\n");
      out.write(".login:not(.loading) button:hover {\n");
      out.write("  box-shadow: 0px 1px 3px #2196F3;\n");
      out.write("}\n");
      out.write(".login:not(.loading) button:focus {\n");
      out.write("  border-bottom-width: 4px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("footer {\n");
      out.write("  display: block;\n");
      out.write("  padding-top: 50px;\n");
      out.write("  text-align: center;\n");
      out.write("  color: #ddd;\n");
      out.write("  font-weight: normal;\n");
      out.write("  text-shadow: 0px -1px 0px rgba(0, 0, 0, 0.2);\n");
      out.write("  font-size: 0.8em;\n");
      out.write("}\n");
      out.write("footer a, footer a:link {\n");
      out.write("  color: #fff;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("\t<link href=\"css/animate.min.css\" rel=\"stylesheet\"> \n");
      out.write("\t<link href=\"css/style.css\" rel=\"stylesheet\" />\t\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("            <script src=\"js/prefixfree.min.js\"></script>\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("    <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("  </head>\n");
      out.write("  <body >\t\n");
      out.write("\t<header id=\"header\">\n");
      out.write("        <nav class=\"navbar navbar-default navbar-static-top\" role=\"banner\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                   <div class=\"navbar-brand\">\n");
      out.write("                       <center><a href=\"index.html\"><h1>Secure Data Retrieval for Decentralized Disruption<br>Tolerant Military Networks</h1></a></center><br>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                </div>\t\t\t\t\n");
      out.write("                <div class=\"navbar-collapse collapse\">\t\t\t\t\t\t\t\n");
      out.write("                    <br><div class=\"menu\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav nav-tabs\" role=\"tablist\"><br><br>\n");
      out.write("\t\t\t\t                        <li role=\"presentation\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li role=\"presentation\"><a href=\"com.jsp\"  class=\"active\">Commander</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li role=\"presentation\"><a href=\"sol.jsp\">Soldier</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li role=\"presentation\"><a href=\"admin.jsp\" >Admin</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li role=\"presentation\"><a href=\"reg.jsp\">Registration</a></li>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\t\t\n");
      out.write("            </div><!--/.container-->\n");
      out.write("        </nav><!--/nav-->\t\t\n");
      out.write("    </header><!--/header-->\t\n");
      out.write("\t\n");
      out.write("\t<div class=\"slider\">\t\t\n");
      out.write("\t\t<div id=\"about-slider\">\n");
      out.write("\t\t\t<div id=\"carousel-slider\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\t\t\t\t<!-- Indicators -->\n");
      out.write("\t\t\t\t<ol class=\"carousel-indicators visible-xs\">\n");
      out.write("\t\t\t\t\t<li data-target=\"#carousel-slider\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("\t\t\t\t\t<li data-target=\"#carousel-slider\" data-slide-to=\"1\"></li>\n");
      out.write("\t\t\t\t\t<li data-target=\"#carousel-slider\" data-slide-to=\"2\"></li>\n");
      out.write("\t\t\t\t</ol>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"carousel-inner\">\n");
      out.write("\t\t\t\t\t<div class=\"item active\">\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                                                \n");
      out.write("\n");
      out.write("                                            <br><br><br><form class=\"login\" action=\"loginaction.jsp\">\n");
      out.write("    <p class=\"title\">Log in</p>\n");
      out.write("    <input type=\"text\" placeholder=\"Name\" name=\"name\" autofocus/>\n");
      out.write("    <i class=\"fa fa-user\"></i>\n");
      out.write("    <input type=\"password\" placeholder=\"Password\" name=\"pass\"/>\n");
      out.write("    <i class=\"fa fa-key\"></i>\n");
      out.write("     <input type=\"hidden\" value=\"1\" name=\"status\" />\n");
      out.write("<!--    <input type=\"password\" placeholder=\"Secret Key\" name=\"key\"/>\n");
      out.write("    <i class=\"fa fa-key\"></i>-->\n");
      out.write("<!--    <input type=\"hidden\" value=\"2\" name=\"status\" />-->\n");
      out.write("    <button>\n");
      out.write("      <i class=\"spinner\"></i>\n");
      out.write("      <span class=\"state\">Log in</span>\n");
      out.write("    </button>\n");
      out.write("  </form>\n");
      out.write("\n");
      out.write("</div><br><br><br><br><br><br>\n");
      out.write("                                           \n");
      out.write("                                                    \n");
      out.write("<!--\t\t\t\t\t\t\t<div class=\"wow fadeInUp\" data-wow-offset=\"0\" data-wow-delay=\"0.3s\">\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<h2><span>Clean & Modern Design Template</span></h2>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-10 col-md-offset-1\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wow fadeInUp\" data-wow-offset=\"0\" data-wow-delay=\"0.6s\">\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet consectetur adipisicing</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wow fadeInUp\" data-wow-offset=\"0\" data-wow-delay=\"0.9s\">\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<form class=\"form-inline\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"livedemo\" name=\"Live Demo\" class=\"btn btn-primary btn-lg\" required=\"required\">Live Demo</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"getnow\" name=\"Get Now\" class=\"btn btn-primary btn-lg\" required=\"required\">Get Now</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t</div>-->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\n");
      out.write("<!--\t\t\t\t    <div class=\"item\">\n");
      out.write("\t\t\t\t\t\t<img src=\"img/22.jpg\" class=\"img-responsive\" alt=\"\"> \n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-caption\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wow fadeInUp\" data-wow-offset=\"0\" data-wow-delay=\"1.0s\">\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<h2>Fully Responsive</h2>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-10 col-md-offset-1\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wow fadeInUp\" data-wow-offset=\"0\" data-wow-delay=\"0.6s\">\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet consectetur adipisicing</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wow fadeInUp\" data-wow-offset=\"0\" data-wow-delay=\"1.6s\">\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<form class=\"form-inline\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"livedemo\" name=\"purchase\" class=\"btn btn-primary btn-lg\" required=\"required\">Live Demo</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"getnow\" name=\"subscribe\" class=\"btn btn-primary btn-lg\" required=\"required\">Get Now</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t    </div> -->\n");
      out.write("<!--\t\t\t\t    <div class=\"item\">\n");
      out.write("\t\t\t\t\t\t<img src=\"img/222.jpg\" class=\"img-responsive\" alt=\"\"> \n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-caption\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wow fadeInUp\" data-wow-offset=\"0\" data-wow-delay=\"0.3s\">\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<h2>Modern Design</h2>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-10 col-md-offset-1\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wow fadeInUp\" data-wow-offset=\"0\" data-wow-delay=\"0.6s\">\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet consectetur adipisicing</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wow fadeInUp\" data-wow-offset=\"0\" data-wow-delay=\"0.9s\">\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<form class=\"form-inline\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"livedemo\" name=\"purchase\" class=\"btn btn-primary btn-lg\" required=\"required\">Live Demo</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"getnow\" name=\"subscribe\" class=\"btn btn-primary btn-lg\" required=\"required\">Get Now</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t    </div> -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("<!--\t\t\t\t<a class=\"left carousel-control hidden-xs\" href=\"#carousel-slider\" data-slide=\"prev\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-angle-left\"></i> \n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<a class=\" right carousel-control hidden-xs\"href=\"#carousel-slider\" data-slide=\"next\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-angle-right\"></i> \n");
      out.write("\t\t\t\t</a>-->\n");
      out.write("\t\t\t</div> <!--/#carousel-slider-->\n");
      out.write("\t\t</div><!--/#about-slider-->\n");
      out.write("\t</div><!--/#slider-->\n");
      out.write("\t\n");
      out.write("<!--\t<div class=\"about\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"text-center\">\n");
      out.write("\t\t\t\t<h2>Quaerat quod voluptate consequuntur </h2>\n");
      out.write("\t\t\t\t<div class=\"col-md-10 col-md-offset-1\">\n");
      out.write("\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quaerat quod voluptate consequuntur ad quasi, \n");
      out.write("\t\t\t\t\tdolores obcaecati ex aliquid, dolor provident accusamus omnis dolorum ipsam. Voluptatem ipsum expedita, corporis facilis laborum asperiores nostrum! \n");
      out.write("\t\t\t\t\tAmet porro numquam ratione temporibus quia dolorem sint lorem voluptates quasi mollitia.</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t<div class=\"col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("\t\t\t\t\t<div class=\"btn-gamp\"><a href=\"#\">Learn More</a></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("\t\t\t\t\t<div class=\"gamp-btn\"><a href=\"#\">download</a></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\t\n");
      out.write("\t\t</div>\t\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<hr>\n");
      out.write("\t\n");
      out.write("\t<div class=\"services\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"text-center\">\n");
      out.write("\t\t\t\t<h2>consectetur adipisicing elit</h2>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-3 wow fadeInDown\" data-wow-duration=\"1000ms\" data-wow-delay=\"300ms\">\n");
      out.write("\t\t\t\t<i class=\"fa fa-heart-o\"></i>\n");
      out.write("\t\t\t\t<h3>Fully Responsive</h3>\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nostrum nam numquam voluptates cumque inventore, quibusdam corporis consequatur amet.</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-3 wow fadeInDown\" data-wow-duration=\"1000ms\" data-wow-delay=\"600ms\">\n");
      out.write("\t\t\t\t<i class=\"fa fa-cloud\"></i>\n");
      out.write("\t\t\t\t<h3>Retina Ready</h3>\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nostrum nam numquam voluptates cumque inventore, quibusdam corporis consequatur amet.</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-3 wow fadeInDown\" data-wow-duration=\"1000ms\" data-wow-delay=\"900ms\">\n");
      out.write("\t\t\t\t<i class=\"fa fa-book\"></i>\t\n");
      out.write("\t\t\t\t<h3>Fresh and Clean</h3>\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nostrum nam numquam voluptates cumque inventore, quibusdam corporis consequatur amet.</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-3 wow fadeInDown\" data-wow-duration=\"1000ms\" data-wow-delay=\"1200ms\">\n");
      out.write("\t\t\t\t<i class=\"fa fa-gear\"></i>\t\n");
      out.write("\t\t\t\t<h3>Easy to Customize</h3>\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nostrum nam numquam voluptates cumque inventore, quibusdam corporis consequatur amet.</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\t\t\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<section class=\"action\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"left-text hidden-xs\">\n");
      out.write("\t\t\t\t<h4>Amet porro numquam ratione</h4>\n");
      out.write("\t\t\t\t<p><em>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nisi ut explicabo magni sapiente.</em><br><br>Inventore at quia, vel in repellendus, cumque dolorem autem ad quidem mollitia porro blanditiis atque rerum debitis eveniet nostrum aliquam. Sint aperiam expedita sapiente amet officia quis perspiciatis adipisci, iure dolorem esse exercitationem!</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"right-image hidden-xs\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t\n");
      out.write("\t<div class=\"gallery\">\n");
      out.write("\t\t<div class=\"text-center\">\n");
      out.write("\t\t\t<h2>Gallery</h2>\n");
      out.write("\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quaerat quod voluptate consequuntur ad quasi, dolores obcaecati ex aliquid, dolor provident </p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"container\">\t\t\n");
      out.write("\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t<figure class=\"effect-marley\">\n");
      out.write("\t\t\t\t\t<img src=\"img/8.jpg\" alt=\"\" class=\"img-responsive\"/>\n");
      out.write("\t\t\t\t\t<figcaption>\n");
      out.write("\t\t\t\t\t\t<h4>sweet marley</h4>\n");
      out.write("\t\t\t\t\t\t<p>Marley tried to convince her but she was not interested.</p>\t\t\t\t\n");
      out.write("\t\t\t\t\t</figcaption>\t\t\t\n");
      out.write("\t\t\t\t</figure>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t<figure class=\"effect-marley\">\n");
      out.write("\t\t\t\t\t<img src=\"img/9.jpg\" alt=\"\" class=\"img-responsive\"/>\n");
      out.write("\t\t\t\t\t<figcaption>\n");
      out.write("\t\t\t\t\t\t<h4>sweet marley</h4>\n");
      out.write("\t\t\t\t\t\t<p>Marley tried to convince her but she was not interested.</p>\t\t\t\t\n");
      out.write("\t\t\t\t\t</figcaption>\t\t\t\n");
      out.write("\t\t\t\t</figure>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t<figure class=\"effect-marley\">\n");
      out.write("\t\t\t\t\t<img src=\"img/10.jpg\" alt=\"\" class=\"img-responsive\"/>\n");
      out.write("\t\t\t\t\t<figcaption>\n");
      out.write("\t\t\t\t\t\t<h4>sweet marley</h4>\n");
      out.write("\t\t\t\t\t\t<p>Marley tried to convince her but she was not interested.</p>\t\t\t\t\n");
      out.write("\t\t\t\t\t</figcaption>\t\t\t\n");
      out.write("\t\t\t\t</figure>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t<figure class=\"effect-marley\">\n");
      out.write("\t\t\t\t\t<img src=\"img/11.jpg\" alt=\"\" class=\"img-responsive\"/>\n");
      out.write("\t\t\t\t\t<figcaption>\n");
      out.write("\t\t\t\t\t\t<h4>sweet marley</h4>\n");
      out.write("\t\t\t\t\t\t<p>Marley tried to convince her but she was not interested.</p>\t\t\t\t\n");
      out.write("\t\t\t\t\t</figcaption>\t\t\t\n");
      out.write("\t\t\t\t</figure>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t<figure class=\"effect-marley\">\n");
      out.write("\t\t\t\t\t<img src=\"img/12.jpg\" alt=\"\" class=\"img-responsive\"/>\n");
      out.write("\t\t\t\t\t<figcaption>\n");
      out.write("\t\t\t\t\t\t<h4>sweet marley</h4>\n");
      out.write("\t\t\t\t\t\t<p>Marley tried to convince her but she was not interested.</p>\t\t\t\t\n");
      out.write("\t\t\t\t\t</figcaption>\t\t\t\n");
      out.write("\t\t\t\t</figure>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t<figure class=\"effect-marley\">\n");
      out.write("\t\t\t\t\t<img src=\"img/13.jpg\" alt=\"\" class=\"img-responsive\"/>\n");
      out.write("\t\t\t\t\t<figcaption>\n");
      out.write("\t\t\t\t\t\t<h4>sweet marley</h4>\n");
      out.write("\t\t\t\t\t\t<p>Marley tried to convince her but she was not interested.</p>\t\t\t\t\n");
      out.write("\t\t\t\t\t</figcaption>\t\t\t\n");
      out.write("\t\t\t\t</figure>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>-->\n");
      out.write("\t\t\n");
      out.write("\t<footer>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("<!--\t\t\t<div class=\"col-md-4 wow fadeInDown\" data-wow-duration=\"1000ms\" data-wow-delay=\"300ms\">\n");
      out.write("\t\t\t\t<h4>About Us</h4>\n");
      out.write("\t\t\t\t<p>Day is tellus ac cursus commodo, mauesris condime ntum nibh, ut fermentum mas justo sitters.</p>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"contact-info\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><i class=\"fa fa-home fa\"></i>Suite 54 Elizebth Street, Victoria State Newyork, USA </li>\n");
      out.write("\t\t\t\t\t\t<li><i class=\"fa fa-phone fa\"></i> +38 000 129900</li>\n");
      out.write("\t\t\t\t\t\t<li><i class=\"fa fa-envelope fa\"></i> info@domain.net</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>-->\n");
      out.write("\t\t\t\n");
      out.write("<!--\t\t\t<div class=\"col-md-4 wow fadeInDown\" data-wow-duration=\"1000ms\" data-wow-delay=\"600ms\">\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"text-center\">\n");
      out.write("\t\t\t\t\t<h4>Photo Gallery</h4>\n");
      out.write("\t\t\t\t\t<ul class=\"sidebar-gallery\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><img src=\"img/gallery1.png\" alt=\"\" /></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><img src=\"img/gallery2.png\" alt=\"\" /></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><img src=\"img/gallery3.png\" alt=\"\" /></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><img src=\"img/gallery4.png\" alt=\"\" /></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><img src=\"img/gallery5.png\" alt=\"\" /></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><img src=\"img/gallery6.png\" alt=\"\" /></a></li>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>-->\n");
      out.write("\t\t\t\n");
      out.write("<!--\t\t\t<div class=\"col-md-4 wow fadeInDown\" data-wow-duration=\"1000ms\" data-wow-delay=\"900ms\">\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t\t<h4>Newsletter Registration</h4>\n");
      out.write("\t\t\t\t\t<p>Subscribe today to receive the latest Day news via email. You may unsubscribe from this service at any time</p>\n");
      out.write("\t\t\t\t\t<div class=\"btn-gamp\">\t\t\n");
      out.write("\t\t\t\t\t\t<input type=\"email\" class=\"form-control\" id=\"exampleInputEmail3\" placeholder=\"Enter Email\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"btn-gamp\">\n");
      out.write("\t\t\t\t\t\t<a type=\"submit\" class=\"btn btn-default\">Subscribe</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\t-->\n");
      out.write("\t</footer>\n");
      out.write("\t\n");
      out.write("\t<div class=\"sub-footer\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"social-icon\">\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t<ul class=\"social-network\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"fb tool-tip\" title=\"Facebook\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"twitter tool-tip\" title=\"Twitter\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"gplus tool-tip\" title=\"Google Plus\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"linkedin tool-tip\" title=\"Linkedin\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"ytube tool-tip\" title=\"You Tube\"><i class=\"fa fa-youtube-play\"></i></a></li>\n");
      out.write("\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"col-md-4 col-md-offset-4\">\n");
      out.write("\t\t\t\t<div class=\"copyright\">\n");
      out.write("\t\t\t\t\t&copy; Day 2015 by <a target=\"_blank\" href=\"http://bootstraptaste.com/\" title=\"Free Twitter Bootstrap WordPress Themes and HTML templates\">Bootstrap Themes</a>.All Rights Reserved.\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                <!-- \n");
      out.write("                    All links in the footer should remain intact. \n");
      out.write("                    Licenseing information is available at: http://bootstraptaste.com/license/\n");
      out.write("                    You can buy this theme without footer links online at: http://bootstraptaste.com/buy/?theme=Day\n");
      out.write("                -->\n");
      out.write("\t\t\t</div>\t\t\t\t\t\t\n");
      out.write("\t\t</div>\t\t\t\t\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("    <script src=\"js/jquery.js\"></script>\t\t\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\t\n");
      out.write("\t<script src=\"js/wow.min.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\twow = new WOW(\n");
      out.write("\t {\n");
      out.write("\t\n");
      out.write("\t\t}\t) \n");
      out.write("\t\t.init();\n");
      out.write("\t</script>\t\n");
      out.write("  </body>\n");
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
