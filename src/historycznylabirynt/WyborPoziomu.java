/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historycznylabirynt;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class WyborPoziomu extends JDialog { 
    
    private JButton wstecz,poziom1,poziom2,poziom3;/*deklaracja przycisków*/
    
    
    public WyborPoziomu(){
        setTitle("Wybór Poziomu");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
        setSize(380,260);
        setModal(true);
        setLocationRelativeTo(null);
        setResizable(false);
        
       
        
        wstecz = new JButton("Wstecz");
        wstecz.setBounds(135, 170, 100, 40);
        wstecz.setFocusable(false);
        wstecz.setMargin(new Insets(1,1,1,1));
        wstecz.addActionListener(new wstecz ());
        /*stworzenie przycisku i dodanie actionlistenera*/
        
        poziom1 = new JButton("Poziom 1");
        poziom1.setBounds(15, 20, 100, 40);
        poziom1.setFocusable(false);
        poziom1.setMargin(new Insets(1,1,1,1));
        poziom1.addActionListener(new poziom1 ());
        /*stworzenie przycisku i dodanie actionlistenera*/
        
        poziom2 = new JButton("Poziom 2");
        poziom2.setBounds(135, 20, 100, 40);
        poziom2.setFocusable(false);
        poziom2.setMargin(new Insets(1,1,1,1));
        poziom2.addActionListener(new poziom2 ());
        /*stworzenie przycisku i dodanie actionlistenera*/
        
        poziom3 = new JButton("Poziom 3");
        poziom3.setBounds(255, 20, 100, 40);
        poziom3.setFocusable(false);
        poziom3.setMargin(new Insets(1,1,1,1));
        poziom3.addActionListener(new poziom3 ());
        /*stworzenie przycisku i dodanie actionlistenera*/
               
        add(wstecz);
        add(poziom1);
        add(poziom2);
        add(poziom3);
               
        setVisible(true);
    }

    public class poziom1 implements ActionListener 
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            
            Poziom1 poziom1 = new Poziom1();
            poziom1.setVisible(true);
            dispose();
        }
    }
    
    public class poziom2 implements ActionListener 
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            
            Poziom2 poziom2 = new Poziom2();
            poziom2.setVisible(true);
            dispose();
        }
    }
    
    public class poziom3 implements ActionListener 
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            
            Poziom3 poziom3 = new Poziom3();
            poziom3.setVisible(true);
            dispose();
        }
    }
    
    public class wstecz implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
        
            dispose();
        }
       
    }
}