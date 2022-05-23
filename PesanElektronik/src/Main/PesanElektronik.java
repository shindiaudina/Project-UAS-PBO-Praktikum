/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.awt.Color;
import Views.DefaultView;

/**
 *
 * @author shindi_ap & ririn_yed
 */
public class PesanElektronik {
    public static void main(String args[]) {
        DefaultView MainMenu = new DefaultView();
        
        MainMenu.getContentPane().setBackground(Color.white);
        MainMenu.setVisible(true);
        MainMenu.setLocationRelativeTo(null);
    }
}
