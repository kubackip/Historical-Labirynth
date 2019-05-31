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

/*opis w klasie Poziom1. w tej klasie wszystko jest analogiczne, inny jest labirynt, inne nazwy obrazków itp*/

public class Poziom2 extends JFrame implements KeyListener
{
   private int[][]plansza=new int[10][10];
   
   private Image przeszkoda2,ludzik2,tlo2,ludzik2dead,koniec2,pytanie4,pytanie5,pytanie6,mapa2,opis2;
   
   //int gra = 0; //zmienna gra informuje nas czy gra się rozpoczęła
   
   public int x=1;//miejsce gdzie fizycznie znajduje się nasz ludzik
   public int y=1;

       public Poziom2()
    {
        setSize(703,736);
        setLayout(null);
        setResizable(false);
        addKeyListener(this);
        utworzPlansze();       
        
        System.out.println("sss");
        
       try 
       {
           przeszkoda2= ImageIO.read(new File("Obrazki/przeszkoda2.png"));
           ludzik2= ImageIO.read(new File("Obrazki/ludzik2.png"));
           tlo2= ImageIO.read(new File("Obrazki/tlo2.png"));
           ludzik2dead = ImageIO.read(new File("Obrazki/ludzik2dead.png"));
           koniec2 = ImageIO.read(new File("Obrazki/koniec2.png"));
           pytanie4 = ImageIO.read(new File("Obrazki/pytanie21.png"));
           pytanie5 = ImageIO.read(new File("Obrazki/pytanie22.png"));
           pytanie6 = ImageIO.read(new File("Obrazki/pytanie23.png"));
           mapa2 = ImageIO.read(new File("Obrazki/mapa2.png"));
           opis2 = ImageIO.read(new File("Obrazki/opis2.png"));

           
       } catch (IOException exception) {
           System.out.println("Nie wczytano obrazków" +exception);
       }

    }
    
    private void utworzPlansze()
    {

       char [][]plansza2={{1,9,1,1,1,1,1,1,1,1},
                          {3,0,0,0,1,1,5,0,0,1},
                          {1,1,1,0,1,0,1,1,8,1},
                          {1,0,6,0,0,0,1,0,0,1},
                          {1,0,1,1,1,1,1,0,1,1},
                          {1,0,0,0,1,0,0,0,0,1},
                          {1,1,1,0,1,1,1,0,1,1},
                          {1,0,0,0,1,0,0,0,1,1},
                          {1,0,1,7,0,0,1,0,0,1},
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
        Graphics2D g2=(Graphics2D)img.getGraphics();
        
        for(int i=0; i<10;i++)
        {
            for(int j=0; j<10; j++)
            {
                int pole=plansza[i][j];                
                
                switch(pole)
                {
                    case 0:
                       
                        g2.drawImage(tlo2, 70*j, 32+70*i, this);
                        break;
                    
                    case 1:
                       
                        g2.drawImage(tlo2, 70*j, 32+70*i, this);
                        break;
                    
                    case 2:
                       
                        g2.drawImage(ludzik2, 70*j, 32+70*i, this);
                        break;
                        
                    case 3:
                        
                        g2.drawImage(opis2,70*j, 32+70*i,this);
                        break;
                        
                    case 4:
                        
                        g2.drawImage(ludzik2dead, 70*j, 32+70*i, this);
                        break;
                        
                    case 5:
                    
                        g2.drawImage(koniec2, 70*j,32+70*i, this);
                        break;
                        
                    case 6:
                    
                        g2.drawImage(pytanie4, 70*j,32+70*i, this);
                        break;                        
                                      
                    case 7:
                    
                        g2.drawImage(pytanie5, 70*j,32+70*i, this);
                        break;
                    
                    case 8:
                    
                        g2.drawImage(pytanie6, 70*j,32+70*i, this);
                        break; 
                     
                    case 9:
                        g2.drawImage(mapa2, 70*j,32+70*i, this);
                        break;
                     
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
        switch(ruch)
        {
            //ruch w lewo
            case 37:
                if(plansza[x][y-1]==0)
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
                    Ciekawostka2 ciekawostka2 = new Ciekawostka2();                            
                    //JOptionPane.showMessageDialog(this, "Ciekowostka");
                    plansza[1][1]=2;
                    plansza[1][0]=3;
                    x=1;
                    y=1;
                }
                
                else if (plansza[x][y-1]==5)
                {
                    y--;
                    plansza[x][y]=5;
                    plansza[x][y+1]=0;
//                    JOptionPane.showMessageDialog(this, "GRATULACJE, UKOŃCZYŁEŚ POZIOM.");
//                    dispose();
                }
                
                else if (plansza[x][y-1]==6)
                {
                    pytanie21 pytanie21 = new pytanie21();
                        if(pytanie21.zmienna4==0)
                        {
                            y--;
                            plansza[x][y]=2;
                            plansza[x][y+1]=0;                            
                        }
                        else if(pytanie21.zmienna4==1)
                        {
                            y--;
                            plansza[x][y+1]=0;
                            plansza[x][y]=6;
                            plansza[1][1]=2;
                            x=1;
                            y=1;
                        }
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
                              
               else if(plansza[x-1][y]==7)
               {
                x--;
                plansza[x][y]=7;
                plansza[x+1][y]=0;
               }
               
               else if(plansza[x-1][y]==8)
                {
                pytanie23 pytanie23 = new pytanie23();  
                    if(pytanie23.zmienna6==0)
                {
                    x--;
                    plansza[x][y]=2;
                    plansza[x+1][y]=0;
                }
                else if(pytanie23.zmienna6==1)
                {
                    x--;
                    plansza[x][y]=8;
                    plansza[x+1][y]=0;
                    plansza[1][1]=2;
                    x=1;
                    y=1;
                }                
                }
               
               else if(plansza[x-1][y]==9)
               {
                   x--;
                   plansza[x][y]=2;
                   plansza[x+1][y]=0;
                   mapa2 mapa2 = new mapa2();
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
                                
                else if(plansza[x+1][y]==7)
                {
                pytanie22 pytanie22 = new pytanie22();  
                    if(pytanie22.zmienna5==0)
                    {
                        x++;
                        plansza[x][y]=2;
                        plansza[x-1][y]=0;
                    }
                    else if(pytanie22.zmienna5==1)
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
            JOptionPane.showMessageDialog( this, "Źle zapamiętałeś labirynt!");
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