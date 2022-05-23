package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shindi_ap & ririn_yed
 */
public class Koneksi {
    Connection koneksi;
    
    private static final String DATABASE_NAME = "pesan_elektronik";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String URL = "jdbc:mysql://localhost:3306/" + DATABASE_NAME;
    
    public static Connection Koneksi() {
        try {
            Connection koneksi = DriverManager.getConnection(URL, USER, PASSWORD);
            return koneksi;
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
