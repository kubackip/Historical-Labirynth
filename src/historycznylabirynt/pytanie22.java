package historycznylabirynt;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class pytanie22 extends JDialog { 
    
    private final JLabel tekst;
    private static JButton odp1,odp2,odp3,odp4;
    public static int zmienna5 = 0;
    
    
    public pytanie22(){
        
        setTitle("Pytanie 2");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLayout(null);
        setSize(380,260);
        setModal(true);
        setLocationRelativeTo(null);
        setResizable(false);
        
        
       
        tekst= new JLabel("<html> Jak nazywał się dowódca sił greckich w tej bitwie </html>");
        tekst.setBounds(20,10,360,70);        
        
        odp1 = new JButton("Dariusz I");
        odp1.setBounds(20, 80, 150, 50);
        odp1.setFocusable(false);
        odp1.setMargin(new Insets(1,1,1,1));
        odp1.addActionListener(new ODP1 ());
        
        odp2 = new JButton("Miltiades");
        odp2.setBounds(20, 160, 150, 50);
        odp2.setFocusable(false);
        odp2.setMargin(new Insets(1,1,1,1));
        odp2.addActionListener(new ODP2 ());
        
        odp3 = new JButton("Kallimach");
        odp3.setBounds(200, 80, 150, 50);
        odp3.setFocusable(false);
        odp3.setMargin(new Insets(1,1,1,1));
        odp3.addActionListener(new ODP3 ());
        
        odp4 = new JButton("Mardoniusz");
        odp4.setBounds(200, 160, 150, 50);
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
        
            zmienna5 = 1;
            dispose();
            
        }
       
    }
    
        public class ODP2 implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e){
        
            zmienna5 = 0;
            dispose();
            
        }
       
    }
        
        public class ODP3 implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e){
        
            zmienna5 = 1;
            dispose();
            
        }
       
    }
            
         public class ODP4 implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e){
        
            zmienna5 = 1;
            dispose();
            
        }
       
    }
}