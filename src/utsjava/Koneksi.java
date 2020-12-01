/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsjava;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

/**
 *
 * @author ASUS
 */
public class Koneksi {
    
    private static Connection mysqlconfig;
    
    public static Connection configDB() throws SQLException {
        
        try {
            String url = "jdbc:mysql://localhost:3306/uts_java";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig = (Connection) DriverManager.getConnection(url, user, pass);
        } catch(Exception e) {
            System.err.println("Koneksi gagal " + e.getMessage());
        }
        return mysqlconfig;
    }
    
}
