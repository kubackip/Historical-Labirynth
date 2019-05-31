package historycznylabirynt;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Instrukcja extends JDialog { 
    
    private JLabel tekst; /*zadeklarowanie pola tekstu wyświetlanego w oknie*/
    private JButton ok; /* zadeklarowanie przycisku*/
    
    public Instrukcja(){
        setTitle("Instrukcja gry");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
        setSize(380,260);
        setLocationRelativeTo(null);
        setResizable(false);
        
       
        tekst= new JLabel("<html>Aby rozpocząć grę, należy wybrać odpowiedni poziom z listy poziomów w menu głównym, a następnie wcisnąć przycisk Start. Gracz steruje ludzikiem za pomocą strzałek. Zadaniem gracza jest doprowadzenie ludzika do końca labiryntu, po drodze odpowiadając na pytania. Gracz może wejść na pole z ciekawostką historyczną, z której będą zadawane pytania. Gracz może również wejść na pole z mapą gry, na której będzie wydoczna droga labiryntu. Jeżeli gracz wejdzie w ścianę/przeszkodę to zaczyna od początku. To samo dzieje się również gdy błędnie odpowie na pytanie. </html>");
        tekst.setBounds(10,10,360,180);
        /*stworzenie tekstu oraz zadeklarowanie odpowiednich rozmiarów tego tekstu i jego umiejscowienia*/
        
        ok = new JButton("OK");
        ok.setBounds(160, 190, 50, 30);
        ok.setFocusable(false);
        ok.setMargin(new Insets(1,1,1,1));
        ok.addActionListener(new OK ());
        /*stworznie przycisku oraz dodanie action listenera i zadeklarowanie rozmiarów przycisku i jego położenia*/
               
        add(ok);
        add(tekst);               
        setVisible(true);
    }
    
    public class OK implements ActionListener
    {
        /*klasa odpowiadająca za stworzenie reakcji na kliknięcie w przycisk*/
        @Override
        public void actionPerformed(ActionEvent e)
        {        
            dispose();
        }
       
    }
}