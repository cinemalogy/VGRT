<%-- 
    Document   : csp_mail
    Created on : May 20, 2016, 5:33:38 PM
    Author     : java4
--%>
<%@page import="network.mail"%>
<%@page import="java.security.SecureRandom"%>
<%@page import="network.mail"%>
<%@page import="java.util.Random"%>
<%@ page import ="java.sql.*" %>
<%
{
   String url = "jdbc:mysql://localhost:3306/data_security";
        String user = "root";
        String password = "root";
        int id=Integer.parseInt(request.getQueryString());
        System.out.println("id get successfully"+id);
            Connection conn = DriverManager.getConnection(url, user, password);
           
            
            String sql = "Select *  from reg where id = '" + id + "' ";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            if(result.next()) {
                
                  Random RANDOM = new SecureRandom();
                     int PASSWORD_LENGTH = 5;
                     String letters = "0124595612345678909876543210";
                     String key = "";
                    
                     for (int i=0; i<PASSWORD_LENGTH; i++)
                 {
                int index = (int)(RANDOM.nextDouble()*letters.length());
                key += letters.substring(index, index+1);
                 }
             String name =result.getString("UserName");
             session.setAttribute( "ssName", name );  
            String email =result.getString("Email");
            session.setAttribute( "ssEmail", email );  
//             String msg ="Key : "+key ;
              String msg ="User Name: "+name+ "\nPassword :" + key;
             session.setAttribute( "ssKey", key );  
                      System.out.println("uour randome string"+msg);
            mail m = new mail();
            m.secretMail(msg, name, email);
           
           response.sendRedirect("csp_update_m.jsp");
     }else{
           response.sendRedirect("a_s_details.jsp");
     }
     }
%>

