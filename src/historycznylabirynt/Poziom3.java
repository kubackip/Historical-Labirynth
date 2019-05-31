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

public class Poziom3 extends JFrame implements KeyListener
{
   private int[][]plansza=new int[10][10];
   
   private Image przeszkoda3,ludzik3,tlo3,ludzik3dead,koniec3,pytanie7,pytanie8,pytanie9,mapa3,opis3;
   
   //int gra = 0; //zmienna gra informuje nas czy gra się rozpoczęła
   
   public int x=4;//miejsce gdzie fizycznie znajduje się nasz ludzik
   public int y=1;

       public Poziom3()
    {
        setSize(703,736);
        setLayout(null);
        setResizable(false);
        addKeyListener(this);
        utworzPlansze();       
        
        
        
       try 
       {
           przeszkoda3= ImageIO.read(new File("Obrazki/przeszkoda3.png"));
           ludzik3= ImageIO.read(new File("Obrazki/ludzik3.png"));
           tlo3= ImageIO.read(new File("Obrazki/tlo3.png"));
           ludzik3dead = ImageIO.read(new File("Obrazki/ludzik3dead.png"));
           koniec3 = ImageIO.read(new File("Obrazki/koniec3.png"));
           pytanie7 = ImageIO.read(new File("Obrazki/pytanie31.png"));
           pytanie8 = ImageIO.read(new File("Obrazki/pytanie32.png"));
           pytanie9 = ImageIO.read(new File("Obrazki/pytanie33.png"));
           mapa3 = ImageIO.read(new File("Obrazki/mapa3.png"));
           opis3 = ImageIO.read(new File("Obrazki/opis3.png"));

           
       } catch (IOException exception) {
           System.out.println("Nie wczytano obrazków" +exception);
       }

    }
    
    private void utworzPlansze()
    {

       char [][]plansza2={{1,1,1,1,1,1,1,1,1,1},
                         {1,0,0,0,0,1,0,0,0,1},
                         {1,5,1,1,0,0,0,1,0,1},
                         {1,1,1,0,0,1,1,0,8,1},
                         {3,0,0,1,0,1,0,0,1,1},
                         {1,9,0,1,0,0,1,0,0,1},
                         {1,0,0,0,1,1,0,1,0,1},
                         {1,0,1,1,0,0,0,1,0,1},
                         {1,6,0,0,0,1,7,0,0,1},
                         {1,1,1,1,1,1,1,1,1,1}};
        
        for(int i=0; i<10;i++)
        {
            for(int j=0; j<10;j++)
            {
                if(i==4&& j==1)//dokładne miejsce gdzie wczytuje się jedynie obrazek naszego ludzika
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
                       
                        g2.drawImage(tlo3, 70*j, 32+70*i, this);
                        break;
                    
                    case 1:
                       
                        g2.drawImage(tlo3, 70*j, 32+70*i, this);
                        break;
                    
                    case 2:
                       
                        g2.drawImage(ludzik3, 70*j, 32+70*i, this);
                        break;
                        
                    case 3:
                        
                        g2.drawImage(opis3,70*j, 32+70*i,this);
                        break;
                        
                    case 4:
                        
                        g2.drawImage(ludzik3dead, 70*j, 32+70*i, this);
                        break;
                        
                    case 5:
                    
                        g2.drawImage(koniec3, 70*j,32+70*i, this);
                        break;
                        
                    case 6:
                    
                        g2.drawImage(pytanie7, 70*j,32+70*i, this);
                        break;                        
                                      
                    case 7:
                    
                        g2.drawImage(pytanie8, 70*j,32+70*i, this);
                        break;
                    
                    case 8:
                    
                        g2.drawImage(pytanie9, 70*j,32+70*i, this);
                        break; 
                     
                    case 9:
                        g2.drawImage(mapa3, 70*j,32+70*i, this);
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
                    plansza[4][1]=2;
//                    x = 4;
//                    y = 1;
                }
                
                else if (plansza[x][y-1]==3)
                {
                    y--;
                    plansza[x][y]=2;
                    plansza[x][y+1]=0;
                    Ciekawostka3 ciekawostka3 = new Ciekawostka3();
                    //JOptionPane.showMessageDialog(this, "Ciekowostka");
                    plansza[4][1]=2;
                    plansza[4][0]=3;
                    x=4;
                    y=1;
                }

                else if (plansza[x][y-1]==8)
                {
                    y--;
                    plansza[x][y]=2;
                    plansza[x][y+1]=0;
                    
                }
                
                else if (plansza[x][y-1]==7)
                {
                    y--;
                    plansza[x][y]=7;
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
                plansza[4][1]=2;
//                x = 4;
//                y = 1;
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
                plansza[4][1]=2;
//                x = 4;
//                y = 1;
                }
                
                else if(plansza[x][y+1]==5)
                {
                y++;
                plansza[x][y]=5;
                plansza[x][y-1]=0;
                }
                
                else if(plansza[x][y+1]==8)
                {
                pytanie33 pytanie33 = new pytanie33();  
                if(pytanie33.zmienna9==0)
                {
                    y++;
                    plansza[x][y]=2;
                    plansza[x][y-1]=0;
                }
                else if(pytanie33.zmienna9==1)
                {
                    y++;
                    plansza[x][y]=8;
                    plansza[x][y-1]=0;
                    plansza[4][1]=2;
                    x=4;
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
                plansza[4][1]=2;
//                x = 4;
//                y = 1;
                }
                
                else if(plansza[x+1][y]==5)
                {
                x++;
                plansza[x][y]=5;
                plansza[x-1][y]=0;
                }
                
                else if(plansza[x+1][y]==9)
                {
                x++;
                plansza[x][y]=2;
                plansza[x-1][y]=0;
                mapa3 mapa3 = new mapa3();
                plansza[4][1]=2;
                plansza[5][1]=9;
                x=4;
                y=1;
                }
                
                else if(plansza[x+1][y]==6)
                {
                pytanie31 pytanie31 = new pytanie31();  
                    if(pytanie31.zmienna7==0)
                    {
                        x++;
                        plansza[x][y]=2;
                        plansza[x-1][y]=0;
                    }
                    else if(pytanie31.zmienna7==1)
                    {
                        x++;
                        plansza[x-1][y]=0;
                        plansza[x][y]=6;
                        plansza[4][1]=2;
                        x=4;
                        y=1;
                    }            
                }
                
                else if(plansza[x+1][y]==7)
                {
                pytanie32 pytanie32 = new pytanie32();  
                    if(pytanie32.zmienna8==0)
                    {
                        x++;
                        plansza[x][y]=2;
                        plansza[x-1][y]=0;
                    }
                    else if(pytanie32.zmienna8==1)
                    {
                        x++;
                        plansza[x-1][y]=0;
                        plansza[x][y]=7;
                        plansza[4][1]=2;
                        x=4;
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
            x=4;
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