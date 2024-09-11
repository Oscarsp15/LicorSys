
package clases;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    public Connection cadena_cnx() {
    
        Connection cnx = null;
        String b = "licoreria", u = "root", p= "", url = "jdbc:mysql://localhost:3306/";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cnx = DriverManager.getConnection(url+b,u,p);
           } catch (Exception e){
           
           System.err.println("Error: "+ e.getMessage());
           }
        return cnx;
    }
     
}