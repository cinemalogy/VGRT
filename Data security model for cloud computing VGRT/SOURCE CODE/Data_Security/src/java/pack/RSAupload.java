/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import com.oreilly.servlet.MultipartRequest;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import network.DbConnection;
import pack.Ftpcon;
import Algorithms.TrippleDES;
import Algorithms.algo;
import Algorithms.encryption;
import java.sql.PreparedStatement;
import java.util.Random;

/**
 *
 * @author java4
 */
public class RSAupload extends HttpServlet {
File file;
final String filepath="D:/";
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           HttpSession session = request.getSession(true);
             MultipartRequest m=new MultipartRequest(request,filepath);
           File file=m.getFile("file");           
           String filename=file.getName().toLowerCase();
           
            Connection con= DbConnection.getConnection();
            Statement st3=con.createStatement();
            ResultSet rt3=st3.executeQuery("select * from uploads where filename='"+filename+"'");
            if(rt3.next()){
                response.sendRedirect("other.jsp?fail='yes'");
            }
            else{
            
            BufferedReader br=new BufferedReader(new FileReader(filepath+filename));
            StringBuffer sb=new StringBuffer();
            String temp=null;
            System.out.println();
            while(( temp=br.readLine())!=null){
               sb.append(temp);              
           }           
        
        
             KeyGenerator keyGen = KeyGenerator.getInstance("AES");
	keyGen.init(128);
	SecretKey secretKey = keyGen.generateKey();
        System.out.println("secret key:"+secretKey);
        
            encryption e=new encryption();
           String RSA=e.encrypt(sb.toString(),secretKey);
           //storing encrypted file
            FileWriter fw=new FileWriter(file);
            fw.write(RSA);
            fw.close();
  byte[] b=secretKey.getEncoded();//encoding secretkey
            String skey=Base64.encode(b);
            System.out.println("converted secretkey to string:"+skey);
            HttpSession user=request.getSession(true);
            String Client=user.getAttribute("ssname").toString();
            PreparedStatement pstm1 = null;
             DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	   //get current date time with Date()
	     Date date = new Date();
	     System.out.println(dateFormat.format(date));
             String time=dateFormat.format(date); 
             session.setAttribute( "Session_Time", time );
	   //get current date time with Calendar()
	    Calendar cal = Calendar.getInstance();
	    System.out.println(dateFormat.format(cal.getTime()));
            
            String len=file.length()+"bytes";
            
            //uploading file
            boolean status=new Ftpcon().upload(file);
            System.out.println("file upload to cloud==>>><<<"+status);
            if(status){
                //Connection con= Dbconnection.getConn();
                Statement st=con.createStatement();

                String sq2 = "insert into uploads (fileid,filename,filedata,date,cname,algo,secretkey) values (?,?,?,?,?,?,?) ";

        System.out.println("jjj");

        pstm1 = con.prepareStatement(sq2);
        pstm1.setInt(1, 0);
        pstm1.setString(2, file.getName());

//        Random r = new Random();
//        int getKey = r.nextInt() + 5000;
//        String key = "" + getKey;
//        
        pstm1.setString(3, RSA);
        pstm1.setString(4, time);
        pstm1.setString(5, Client);
         pstm1.setString(6, "RSA");
        pstm1.setString(7, skey);
        
        

        boolean sd = pstm1.execute();
        
        System.out.println(sd);
          if (sd = false) {
                   // out.println("success");
                    response.sendRedirect("file_upload.jsp?msg=File_upload_to_cloud");
                    
                }
                else{
                      response.sendRedirect("file_up.jsp?msg=File_upload_to_cloud_Successfully");
                }
//                 out.println("file stored");
//                 out.println(file.length());
            }
            else{
              
            }
            }
        }
        catch(Exception e){
            out.println(e);
        }
        finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
