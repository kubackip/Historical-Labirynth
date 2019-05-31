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

/*analogicznie w pozostałych klasach(mapa2 i mapa3)*/

public class mapa1 extends JDialog { 
    
    
    public mapa1(){
        setTitle("Mapa Poziomu 1");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
        setSize(730,760);
        setModal(true);
        setLocationRelativeTo(null);
        setResizable(false);
        ImageIcon mapa1 = new ImageIcon("Obrazki/mapaPoziom1.png");
        JLabel wyswietlObrazek = new JLabel(mapa1);
        wyswietlObrazek.setBounds(0, 0, 717, 740);
        wyswietlObrazek.setVisible(true);
        add(wyswietlObrazek);               
        setVisible(true);
        /*wyświetlenie mapy labiryntu*/
    }

}