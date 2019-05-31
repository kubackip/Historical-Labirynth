package historycznylabirynt;

import javax.swing.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/* ze względu na 3 podobne klasy (Ciekawostka1,Ciekawostka2 oraz Ciekawostka3) komentarze umieszczę tylko w pierwszej klasie(Ciekawostka1). Klasy różnią się nazwami metod, oraz inną zawartością
pola tekst*/ 

public class Ciekawostka1 extends JDialog 
{ 
    
    private JTextArea tekst;
    /*tworzenie pola na którym będzie umieszczony opis wydarzenia historycznego*/
    private JScrollPane suwak;
    /*ze względu na sporą ilość tekstu byłem zmuszony dodać suwak, w przeciwnym wypadku tekst nie mieścił się w oknie o określonych rozmiarach(800x600)*/
    
    public Ciekawostka1(){
        setTitle("Lądowanie Aliantów na plaży Omaha");    /*tekst wypisany w ramce okienka*/
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); /*gdy wciskamy czerwony "x" z prawej strony u góry ekranu to okno się wyłącza*/
        setLayout(null);
        setSize(800,600);   /*wielkość okna*/
        setModal(true);
        setLocationRelativeTo(null);
        setResizable(false);
        
        tekst= new JTextArea("„Omaha” – kryptonim jednego z pięciu odcinków lądowania aliantów w Normandii 6 czerwca 1944. Był to jeden z dwóch\n "
                + "odcinków przydzielonych Amerykanom. Odcinki dzieliły się na sektory, z których niektóre były podzielone dodatkowo na podsektory \n"
                + "nazywane plażami i oznaczone nazwami kolorów. Odcinek „Omaha” położony jest w Normandii w północnej Francji i rozciąga się na 31,6 km.\n" 
                + "\nW akcji brała udział amerykańska 29 Dywizja Piechoty pod dowództwem gen. Charlesa Gerhardta, wspomagana przez 8 kompanii Rangerów,\n "
                + "oraz doświadczona w działaniach desantowych 1 Dywizja Piechoty, dowodzona przez gen. Clarence’a Huebnera. 29 Dywizja nacierała\n"
                + " w zachodniej części odcinka, a 1 Dywizja we wschodniej. Obrońcy zajmowali pozycje na stromych urwiskach i wzgórzach.\n "
                + "\nNiemcy dysponowali tutaj 60 działami różnego rodzaju, a także dużą ilością broni maszynowej. Szczególnie niebezpieczne dla atakujących \n"
                + "było działanie na skraju plaż umocnionych dodatkowo 6 metrami betonowej zapory.\n" 
                + "O godzinie 5:30 do plaż zbliżyły się pierwsze oddziały amerykańskie. W pierwszej fali ataku brało bezpośrednio udział 3 tys. żołnierzy.\n "
                + "\nByły to grupy bojowe z 1, 29, 4 dywizji oraz pododdziały wojsk lądowych i marynarki wojennej. Ich zadaniem było zniszczenie\n"
                + " przeszkód podwodnych. Każda z grup miała wyznaczoną strefę lądowania. Plaża była przydzielona po połowie 16 pułkowi 1 dywizji \n"
                + "generała Clarence’a Huebnera i 116 pułkowi 29 dywizji generała majora Charlesa Gerharda. Strefy te z kolei podzielono na sektory,\n"
                + " z których każdy otrzymał zakodowaną nazwę. Żołnierze 1 Dywizji mieli desantować na „Easy Green”, „Fox Green”, „Fox Red”, \n"
                + "zaś 29 Dywizja na „Charlie”, „Dog Green”, „Dog White\", „Dog Red” i „Easy Green”. Strefy „Fox Green” i „Dog Green” przeszły do \n"
                + "historii jako „Bloody Omaha”. Z 32 amerykańskich czołgów pływających typu Sherman DD, stanowiących wsparcie działań piechoty,\n "
                + "jedynie 4 dotarło do brzegu. Przygotowanie natarcia w postaci bombardowania z powietrza i ostrzału artyleryjskiego z morza nie \n"
                + "zniszczyło niemieckiej obrony. Wiatr, wysokie fale i prąd morski uniemożliwił jednostkom desantowym precyzyjne lądowanie w \n"
                + "wyznaczonych rejonach. Nacierająca piechota amerykańska znalazła się w krzyżowym ogniu niemieckich karabinów maszynowych i pod \n"
                + "ostrzałem moździerzy oraz dział 88 mm. Dodatkowym utrudnieniem dla nacierających była ograniczona widoczność spowodowana dymem \n"
                + "wybuchów wcześniejszego bombardowania i ostrzału. Żołnierze byli zmęczeni i cierpieli z powodu choroby morskiej. \n"
                + "\nEkwipunek, nasiąknięty wodą i wypełniony piaskiem, uniemożliwiał szybkie posuwanie się do przodu. W ciągu pierwszych godzin \n"
                + "desantu wszyscy dowódcy zostali albo ciężko ranni, albo zabici. Natarcie załamało się. Dowództwo rozważało przerwanie akcji\n "
                + "i skierowanie pozostałych sił na odcinek plaży „Utah”. W toku ciężkich walk atakującym udało się jednak dotrzeć do umocnień brzegowych.\n "
                + "\nDzięki podłużnym minom bangalore zniszczyli zasieki z drutu kolczastego i unieszkodliwili pola minowe, co pozwoliło na ominięcie bunkrów,\n"
                + " zajście ich od tyłu i zdobycie za pomocą miotaczy ognia. Alianckie niszczyciele, ryzykując wpadnięcie na mieliznę, \n"
                + "z bliska ostrzelały niemieckie pozycje obronne.\n" 
                + "\nPo prawie 10 godzinach boju plaża została zdobyta. Powodzenie natarcia zostało okupione ok. 3 tysiącami zabitych,\n"
                + " rannych i zaginionych alianckich żołnierzy. Po stronie 3 Rzeszy poległo około 1200 żołnierzy. \n");
        /*tekst który się wyświetli w oknie*/
        
        JScrollPane suwak = new JScrollPane(tekst);
        suwak.setBounds(0,0,800,600);         
        add(suwak);
        /*dodanie suwaka    */  
        
        setVisible(true);
        /*wszystko staje się widoczne*/
    }
       
}