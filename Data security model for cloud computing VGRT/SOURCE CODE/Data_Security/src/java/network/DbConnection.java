/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package network;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author java4
 */
public class DbConnection {
    public static Connection getConnection()
    {
        Connection con = null;
        try{
             Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data_security", "root", "root");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }
}
