/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koneksi;
import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
/**
 *
 * @author user
 */
public class Koneksi {
        private static Connection connectionmysql;
        public static Connection ConnectionDB () {
        if (connectionmysql == null) {
        try{
        String DB = "jdbc:mysql://localhost:3306/java_kehadiran";
        String user = "root";
        String password = "";
        DriverManager.registerDriver (new com.mysql.jdbc.Driver());
        connectionmysql = (Connection) DriverManager.getConnection (DB,user,password);
        JOptionPane.showMessageDialog(null, "Connection Sukses");
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Connection Failed");
        }
    }
    return connectionmysql;
    }
}
