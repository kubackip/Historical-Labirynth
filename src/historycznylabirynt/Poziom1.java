package historycznylabirynt;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Poziom1 extends JFrame implements KeyListener
{
   private int[][]plansza=new int[10][10];/*definicja tablicy na której poruszać się będzie nasz bohater*/
   
   private Image przeszkoda1,ludzik1,tlo1,ludzik1dead,koniec1,pytanie1,pytanie2,pytanie3,mapa1,opis1;
   /*definicje poszczególnych obrazków*/
        
   public int x=1;/*miejsce gdzie fizycznie znajduje się nasz ludzik*/
   public int y=1;
   

       public Poziom1()
    {
        setSize(703,736);
        setLayout(null);
        setResizable(false);
        addKeyListener(this);
        utworzPlansze();   
        
       try 
       {
           przeszkoda1= ImageIO.read(new File("Obrazki/przeszkoda1.png"));
           ludzik1= ImageIO.read(new File("Obrazki/ludzik1.png"));
           tlo1= ImageIO.read(new File("Obrazki/tlo1.png"));
           ludzik1dead = ImageIO.read(new File("Obrazki/ludzik1dead.png"));
           koniec1 = ImageIO.read(new File("Obrazki/koniec1.png"));
           pytanie1 = ImageIO.read(new File("Obrazki/pytanie11.png"));
           pytanie2 = ImageIO.read(new File("Obrazki/pytanie12.png"));
           pytanie3 = ImageIO.read(new File("Obrazki/pytanie13.png"));
           mapa1 = ImageIO.read(new File("Obrazki/mapa.png"));
           opis1 = ImageIO.read(new File("Obrazki/opis.png"));

           
       } catch (IOException exception) {
           System.out.println("Nie wczytano obrazków" +exception);
       }
        /*wczytanie poszczególnych obrazków */
    }
    
    private void utworzPlansze()
    {
        /*metoda tworząca planszę na której zostaną wyświetlone obrazki. Każdy obrazek jest przypisany do poszczególnej liczby. */
       int [][]plansza2={{1,9,1,1,1,1,1,1,1,1},
                         {3,0,0,0,0,1,0,1,0,1},
                         {1,0,1,1,6,1,0,0,0,1},
                         {1,0,1,0,0,0,0,1,0,1},
                         {1,0,1,1,1,0,1,1,1,1},
                         {1,0,0,0,1,7,1,0,0,5},
                         {1,1,1,0,1,0,1,0,1,1},
                         {1,0,0,0,1,0,1,0,0,1},
                         {1,0,1,1,0,0,0,8,1,1},
                         {1,1,1,1,1,1,1,1,1,1}};
        
        for(int i=0; i<10;i++)
        {
            for(int j=0; j<10;j++)
            {
                if(i==1&& j==1)//dokładne miejsce gdzie wczytuje się jedynie obrazek naszego ludzika
                {
                    plansza[i][j]=2;
                    //miejsce na planszy gdzie wczytuje się nasz ludzik
                }
                else
                plansza[i][j]=plansza2[i][j];
            }
        }  
        
    }

  
    public void rysujPlansze(Graphics g)
    {
        Image img=createImage(getSize().width, getSize().height);
        Graphics2D g2=(Graphics2D)img.getGraphics();/*kod za pomocą którego możliwe jest wczytanie plików obrazków*/
        
        for(int i=0; i<10;i++)
        {
            for(int j=0; j<10; j++)
            {
                int pole=plansza[i][j];/*tworzę zmienną potrzebną dla switcha*/                
                
                switch(pole)
                {
                    case 0:
                       
                        g2.drawImage(tlo1, 70*j, 32+70*i, this);
                        break;
                    
                    case 1:
                       
                        g2.drawImage(tlo1, 70*j, 32+70*i, this);
                        break;
                    
                    case 2:
                       
                        g2.drawImage(ludzik1, 70*j, 32+70*i, this);
                        break;
                        
                    case 3:
                        
                        g2.drawImage(opis1,70*j, 32+70*i,this);
                        break;
                        
                    case 4:
                        
                        g2.drawImage(ludzik1dead, 70*j, 32+70*i, this);
                        break;
                        
                    case 5:
                    
                        g2.drawImage(koniec1, 70*j,32+70*i, this);
                        break;
                        
                    case 6:
                    
                        g2.drawImage(pytanie1, 70*j,32+70*i, this);
                        break;                        
                                      
                    case 7:
                    
                        g2.drawImage(pytanie2, 70*j,32+70*i, this);
                        break;
                    
                    case 8:
                    
                        g2.drawImage(pytanie3, 70*j,32+70*i, this);
                        break; 
                     
                    case 9:
                        g2.drawImage(mapa1, 70*j,32+70*i, this);
                        break;
                     /*przypisanie każdemu obrazkowi swojej liczby, dzieki temu można je wczytać w tablicy i stworzyć ruch bohatera oraz rekacje między nimi*/
                }
            }
        }
        
        g.drawImage(img, 0, 0, this);
    }

    @Override
    public void paint(Graphics g)
    {
        rysujPlansze(g);
    }
    
    @Override
    public void keyTyped(KeyEvent e) 
    {
    }
    
    @Override
    public void keyPressed(KeyEvent e) 
    {        
        
        int ruch=e.getKeyCode();
        /*każdy z case'ów 37,38,39,40 odpowiada odpowiedniej strzałce na klawiaturze*/
        switch(ruch)
        {
            /*ruch w lewo*/
            case 37:
                if(plansza[x][y-1]==0)
                    /*sprawdzenie jaki obrazek jest z lewej strony - jeżeli jest odpowiedni to następuje zmiana wartości y, oraz zmienienie obrazków
                    co przekłada się na wyobrażenie ruchu naszego bohatera*/
                {
                y--;
                plansza[x][y]=2;
                plansza[x][y+1]=0;
                }
                
                else if (plansza[x][y-1]==1)
                {
                    y--;
                    plansza[x][y]=4;
                    plansza[x][y+1]=0;
                    plansza[1][1]=2;
                }
                
                else if (plansza[x][y-1]==3)
                {
                    y--;
                    plansza[x][y]=2;
                    plansza[x][y+1]=0;
                    Ciekawostka1 ciekawostka1 = new Ciekawostka1();/*Konstruktor danej ciekawostki*/
                    plansza[1][1]=2;
                    plansza[1][0]=3;
                    x=1;
                    y=1;
                }
                
                else if (plansza[x][y-1]==5)
                {
                    y--;
                    plansza[x][y]=6;
                    plansza[x][y+1]=0;

                }
                
                break;                
            
            //ruch w górę
            case 38:
               if(plansza[x-1][y]==0)
               {
                x--;
                plansza[x][y]=2;
                plansza[x+1][y]=0;
               }
               
               else if(plansza[x-1][y]==1)
               {
                x--;
                plansza[x][y]=4;
                plansza[x+1][y]=0;
                plansza[1][1]=2;
               }
               
               else if(plansza[x-1][y]==8)
               {
                x--;
                plansza[x][y]=2;
                plansza[x+1][y]=0;

               }
               
               else if(plansza[x-1][y]==7)
               {
                x--;
                plansza[x][y]=7;
                plansza[x+1][y]=0;

               }
               
               else if(plansza[x-1][y]==9)
               {
                   x--;
                   plansza[x][y]=2;
                   plansza[x+1][y]=0;
                   mapa1 mapa1 = new mapa1();
                   plansza[1][1]=2;
                   plansza[0][1]=9;
                   x=1;
                   y=1;
               }               
                break;
            
            //ruch w prawo
            case 39:
                if(plansza[x][y+1]==0)
                {
                y++;
                plansza[x][y]=2;
                plansza[x][y-1]=0;
                }

                else if(plansza[x][y+1]==1)
                {
                y++;
                plansza[x][y]=4;
                plansza[x][y-1]=0;
                plansza[1][1]=2;
                }
                
                else if(plansza[x][y+1]==5)
                {
                y++;
                plansza[x][y]=5;
                plansza[x][y-1]=0;
                }
                
                else if(plansza[x][y+1]==8)
                {
                pytanie13 pytanie13 = new pytanie13();  
                if(pytanie13.zmienna3==0)
                {
                    y++;
                    plansza[x][y]=2;
                    plansza[x][y-1]=0;
                }
                else if(pytanie13.zmienna3==1)
                {
                    y++;
                    plansza[x][y]=8;
                    plansza[x][y-1]=0;
                    plansza[1][1]=2;
                    x=1;
                    y=1;
                }
                else if(plansza[1][0]==2 )
                {
                    y++;
                    plansza[x][y]=2;
                    plansza[1][0]=3;
                    
                }
                }
                
                break;
            
            //ruch w dół
            case 40:
                if(plansza[x+1][y]==0)
                {
                x++;
                plansza[x][y]=2;
                plansza[x-1][y]=0;
                }

                else if(plansza[x+1][y]==1)
                {
                x++;
                plansza[x][y]=4;
                plansza[x-1][y]=0;
                plansza[1][1]=2;
                }
                
                else if(plansza[x+1][y]==5)
                {
                x++;
                plansza[x][y]=6;
                plansza[x-1][y]=0;
                }
                
                else if(plansza[x+1][y]==6)
                {
                pytanie11 pytanie11 = new pytanie11();  
                    if(pytanie11.zmienna1==0)
                    {
                        x++;
                        plansza[x][y]=2;
                        plansza[x-1][y]=0;
                    }
                    else if(pytanie11.zmienna1==1)
                    {
                        x++;
                        plansza[x-1][y]=0;
                        plansza[x][y]=6;
                        plansza[1][1]=2;
                        x=1;
                        y=1;
                    }            
                }
                
                else if(plansza[x+1][y]==7)
                {
                pytanie12 pytanie12 = new pytanie12();  
                    if(pytanie12.zmienna2==0)
                    {
                        x++;
                        plansza[x][y]=2;
                        plansza[x-1][y]=0;
                    }
                    else if(pytanie12.zmienna2==1)
                    {
                        x++;
                        plansza[x-1][y]=0;
                        plansza[x][y]=7;
                        plansza[1][1]=2;
                        x=1;
                        y=1;
                    }            
                }
                
                else if(plansza[x+1][y]==7)
                {
                x++;
                plansza[x][y]=7;
                plansza[x-1][y]=0;

                }
                
                break;
        }
        
        repaint();
      
        if(plansza[x][y]==4)
        {
            JOptionPane.showMessageDialog( this, "Źle zapamiętałeś labirynt!");/*wyświetlenie wiadomości*/
            x=1;
            y=1;
            
        }
        
        else if(plansza[x][y]==5)
        {
            JOptionPane.showMessageDialog(this, "Ukończyłeś pomyślnie poziom, gratulacje.");
            dispose();
                        
        }        
        
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
     
    }
    
}