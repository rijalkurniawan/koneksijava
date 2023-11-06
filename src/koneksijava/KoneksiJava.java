/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package koneksijava;
import Koneksi.Koneksi;
import com.mysql.jdbc.Connection;

/**
 *
 * @author user
 */
public class KoneksiJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conn = Koneksi.ConnectionDB();
    }
    
}
