/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricky Hr
 */
public class koneksi {
public Connection koneksi;
    public Connection getkoneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String usr = "root";
            String pas = "rikiharya21";
            koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/latihan", usr, pas);
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException x){
            JOptionPane.showMessageDialog(null, x,"koneksi Error",JOptionPane.ERROR_MESSAGE);
        }
        
        return koneksi;
}
}
