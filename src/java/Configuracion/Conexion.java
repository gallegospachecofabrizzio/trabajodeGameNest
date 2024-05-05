/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Conexion {
    Connection con;
    String url= "jdbc:mysql://localhost:3307/bdcarritocompras?useTimeZone=true&"
                + "serverTimezone=UTC&autoReconnect=true";
    String user = "";
    String pass = "";
    
    String Driver = "com.mysql.cj.jdbc.Driver";
    public Connection getConection() throws SQLException{
     try {
            Class.forName(Driver);
            con = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return  con;
    }
    
    public static void main(String[] args) throws SQLException {
        Conexion cdb = new Conexion();
        Connection cnx = cdb.getConection();
        System.out.println(""+cnx.getCatalog());
    }
}
