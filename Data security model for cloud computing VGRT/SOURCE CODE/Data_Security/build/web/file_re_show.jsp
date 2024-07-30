<%-- 
    Document   : file_re_show
    Created on : May 21, 2016, 6:09:54 PM
    Author     : java4
--%>
<%@page import="network.DbConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>DATA SECURITY MODEL FOR CLOUD</title>
        <!-- Bootstrap Core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <!-- Custom CSS -->
        <link href="css/business-casual.css" rel="stylesheet">
        <!-- Fonts -->
        <link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css">
        <link href="http://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic" rel="stylesheet" type="text/css">
    </head>

    <body>
       <%
            if (request.getParameter("msg") != null) {
        %>
        <script>alert('Secret key sent to Your Email');</script>
        <%
            }
        %>
        <div class="brand">DATA SECURITY MODEL FOR CLOUD
COMPUTING<br>USING V -GRT
METHODOLOGY</div>
        <!-- Navigation -->
        <nav class="navbar navbar-default" role="navigation">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <!-- navbar-brand is hidden on larger screens, but visible when the menu is collapsed -->
                    <a class="navbar-brand" href="index.html">Business Casual</a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                     <ul class="nav navbar-nav">
                        <li>
                            <a href="ahome.jsp">Auditor Home</a>
                        </li>
                        <li>
                            <a href="csp_req.jsp">Clients</a>
                        </li>
                        <li>
                            <a href="file_re_show.jsp">Client Request</a>
                        </li>
                        <li>
                            <a href="index.jsp">Logout</a>
                        </li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </div>
            <!-- /.container -->
        </nav>

        <div class="container">
            <div class="row">
                <div class="box" style="height: 400px;">
                    <!--To do you work-->
                    <div style="border: 1px solid white;height: 350px;border-top-width: 20px;border-bottom-width: 10px">
                        <center><h3>Client file access Request Details</h3></center><br />
                        <table border="1" style="text-align: center;margin-left: 140px">
                            <tr>
                                <th style="text-align: center;width: 70px;">Client ID</th>
                                <th style="text-align: center;width: 100px;">Name</th>
                                <th style="text-align: center;width: 300px;">Email</th>
                                <th style="text-align: center;width: 100px;">State</th>
                                <th style="text-align: center;width: 100px;">Country</th>
                                <th style="text-align: center;width: 100px;">File Name</th>
                                 <th style="text-align: center;width: 100px;">Algorithm</th>
                                <th style="text-align: center">Secret Key</th>
                                 <!--<th style="text-align: center">Remove</th>-->
                            </tr>
                            <tr>
                                <%
                                    Connection con = null;
                                    Statement st = null;
                                    ResultSet rs = null;
                                    try {
                                        con = DbConnection.getConnection();
                                        st = con.createStatement();
                                        rs = st.executeQuery("select * from request where status='No'");
                                        while(rs.next())
                                            
                                        {%>
                                        <td><%=rs.getString("id")%></td>     
                                        <td><%=rs.getString("name")%></td>  
                                        <td><%=rs.getString("mail")%></td>     
                                        <td><%=rs.getString("state")%></td>     
                                        <td><%=rs.getString("country")%></td>     
                                        <td><%=rs.getString("fname")%></td>    
                                        <td><%=rs.getString("algo")%></td> 
                         <td> <a href="a_mail.jsp?<%=rs.getString("id")%>"><font style="color: green">Send</a></font> </td>
                        <!--<td> <a href="remove_c.jsp?<%=rs.getString("id")%>"><font style="color: red">Delete</a></font> </td>--> 
                            </tr>
                                        <%} 
                                    } catch (Exception ex) {
                                        ex.printStackTrace();
                                    }

                                %>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        <!-- /.container -->

<!--        <footer>
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 text-center">
                    </div>
                </div>
            </div>
        </footer>-->
    </body>
</html>


