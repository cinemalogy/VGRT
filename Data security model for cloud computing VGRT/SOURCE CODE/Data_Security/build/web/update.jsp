<%-- 
    Document   : update
    Created on : May 21, 2016, 6:27:01 PM
    Author     : java4
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="network.DbConnection"%>
<%

                Connection con = DbConnection.getConnection();
                Statement st =con.createStatement();

         String Status = "Yes";

    int  id=(Integer)session.getAttribute("theSid");
     System.out.println("session id is geted"+id);
    int i = st.executeUpdate("update request set status='" + Status + "' where id = '" + id + "'");
    if (i != 0) {
        response.sendRedirect("file_re_show.jsp?msg = Secret_key_sent_to_Your_Email");
    } else {
        response.sendRedirect("file_re_show.jsp? msg = Error");
    }
%>
