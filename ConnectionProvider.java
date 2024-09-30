/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym;

import java.sql.*;


/**
 *
 * @author yadav
 */
public class ConnectionProvider {
    private static Connection con;
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jymmanagement", "root", "satish@2001");
            return con;
        }
        catch(Exception e){
         return null;
        }
    }
    
}
