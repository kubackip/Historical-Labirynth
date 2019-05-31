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

public class mapa3 extends JDialog { 
    
    
    public mapa3(){
        setTitle("Mapa Poziomu 3");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
        setSize(725,760);
        setModal(true);
        setLocationRelativeTo(null);
        setResizable(false);
        ImageIcon mapa3 = new ImageIcon("Obrazki/mapaPoziom3.png");
        JLabel wyswietlObrazek3 = new JLabel(mapa3);
        wyswietlObrazek3.setBounds(0, 0, 717, 740);
        wyswietlObrazek3.setVisible(true);
        add(wyswietlObrazek3);               
        setVisible(true);
    }

}