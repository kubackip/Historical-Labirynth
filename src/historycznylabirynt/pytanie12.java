package historycznylabirynt;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class pytanie12 extends JDialog { 
    
    private final JLabel tekst;
    private static JButton odp1,odp2,odp3,odp4;
    public static int zmienna2 = 0;
    
    
    public pytanie12(){
        
        setTitle("Pytanie 2");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLayout(null);
        setSize(460,340);
        setModal(true);
        setLocationRelativeTo(null);
        setResizable(false);
        
        
       
        tekst= new JLabel("<html> Które ze stref przeszły do historii jako 'Bloody Omaha'? </html>");
        tekst.setBounds(20,10,460,70);        
        
        odp1 = new JButton("Fox Green oraz Dog Green");
        odp1.setBounds(20, 100, 180, 60);
        odp1.setFocusable(false);
        odp1.setMargin(new Insets(1,1,1,1));
        odp1.addActionListener(new ODP1 ());
        
        odp2 = new JButton("Fox Green oraz Easy Green");
        odp2.setBounds(20, 220, 180, 60);
        odp2.setFocusable(false);
        odp2.setMargin(new Insets(1,1,1,1));
        odp2.addActionListener(new ODP2 ());
        
        odp3 = new JButton("Dog White oraz Dog Red");
        odp3.setBounds(250, 100, 180, 60);
        odp3.setFocusable(false);
        odp3.setMargin(new Insets(1,1,1,1));
        odp3.addActionListener(new ODP3 ());
        
        odp4 = new JButton("Fox Red oraz Charlie");
        odp4.setBounds(250, 220, 180, 60);
        odp4.setFocusable(false);
        odp4.setMargin(new Insets(1,1,1,1));
        odp4.addActionListener(new ODP4 ());
               
        add(odp1);        add(odp2);        add(odp3);        add(odp4);
        add(tekst);
               
        setVisible(true);
    }

    public class ODP1 implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e){
        
            zmienna2 = 0;
            dispose();
            
        }
       
    }
    
        public class ODP2 implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e){
        
            zmienna2 = 1;
            dispose();
            
        }
       
    }
        
        public class ODP3 implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e){
        
            zmienna2 = 1;
            dispose();
            
        }
       
    }
            
         public class ODP4 implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e){
        
            zmienna2 = 1;
            dispose();
            
        }
       
    }
}
