/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historycznylabirynt;

import javax.swing.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class mapa2 extends JDialog { 
    
    
    public mapa2(){
        setTitle("Mapa Poziomu 2");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
        setSize(725,760);
        setModal(true);
        setLocationRelativeTo(null);
        setResizable(false);
        ImageIcon mapa2 = new ImageIcon("Obrazki/mapaPoziom2.png");
        JLabel wyswietlObrazek2 = new JLabel(mapa2);
        wyswietlObrazek2.setBounds(0, 0, 717, 740);
        wyswietlObrazek2.setVisible(true);
        add(wyswietlObrazek2);               
        setVisible(true);
    }

}