package historycznylabirynt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Menu 
{

    JFrame Menu = new JFrame("Historyczny Labirynt");   
    JButton WyborPoziomu = new JButton("Wybór Poziomu");
    JButton Wyjscie = new JButton("Wyjście");
    JButton Instrukcja = new JButton("Instrukcja");
    ImageIcon labirynt = new ImageIcon("Obrazki/labirynt.jpg");
    JLabel obrazeklogo = new JLabel(labirynt);
    int menuSzerokosc = 140; 
    int menuWysokosc = 40;
    int menuY = 445; 
    int SZEROKOSC = 490;
    int WYSOKOSC = 530;     /*deklaruję tutaj odpowiednie warotści które będę wykorzystywał do umieszczania tekstów, przycisków, deklarowania szerokości i wysokości stron itp*/
    
            
	public Menu() 
        {
    	playSound(new File("Dzwieki//menu_song.wav"));   /*odtworzenie dźwięku*/ 	
        Menu.setResizable(false);
        Menu.setSize(SZEROKOSC, WYSOKOSC);
        Menu.setLayout(null);
        Menu.setLocationRelativeTo(null);
        Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*wszystko co się tyczy wyskakującego okna menu*/
        
        WyborPoziomu.setSize(menuSzerokosc,menuWysokosc);
        WyborPoziomu.setLocation(20, menuY);
        Menu.add(WyborPoziomu);
        WyborPoziomu.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) 
                        {
                                WyborPoziomu wyborpoziomu = new WyborPoziomu();
				/*konstruktor do wyskakującego okna z wyborem poziomów*/
			}
        	
        }); /*	przycisk wyboru poziomu i jego obsługa*/

        
        Wyjscie.setSize(menuSzerokosc,menuWysokosc);
        Wyjscie.setLocation(320,menuY);
        Menu.add(Wyjscie);
        Wyjscie.addActionListener(new ActionListener()
        {

			@Override
			public void actionPerformed(ActionEvent e) 
                        {
                            System.exit(0); /*kończy działanie programu*/
			}
        });
        /*	przycisk wyjścia i jego obsługa*/
        
                
        Instrukcja.setSize(menuSzerokosc,menuWysokosc);
        Instrukcja.setLocation(170,menuY);
        Menu.add(Instrukcja);
        Instrukcja.addActionListener(new ActionListener()
        {

			@Override
			public void actionPerformed(ActionEvent e) 
                        {
                            Instrukcja instrukcja = new Instrukcja();                            
			}
        });
        /*	przycisk instrukcji i jego obsługa wraz z konstruktorem*/
        
        
        obrazeklogo.setBounds((SZEROKOSC-412)/2, 25, 412, 335);
        obrazeklogo.setVisible(true);
        Menu.add(obrazeklogo);
        Menu.setVisible(true);
        /*wyświetlenie obrazka w menu programu*/
    }
        
public static synchronized void playSound(final File f) 
    {
        new Thread(new Runnable() {
          @Override
          public void run() {
            try {
              Clip clip = AudioSystem.getClip();
              AudioInputStream inputStream = AudioSystem.getAudioInputStream(f);
              clip.open(inputStream);
              clip.start(); 
            } catch (Exception e) 
            {
              System.err.println(e.getMessage());
            }
          }
        }).start();
    }/*cały ten fragment kodu jest potrzebny do wczytania dźwięku(pliku dźwiękowego) */

}