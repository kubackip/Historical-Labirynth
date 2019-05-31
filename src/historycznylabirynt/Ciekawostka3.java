package historycznylabirynt;

import javax.swing.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/* ze względu na 3 podobne klasy (Ciekawostka1,Ciekawostka2 oraz Ciekawostka3) komentarze umieszczę tylko w piereszej klasie(Ciekawostka1). Klasy różnią się nazwami metod, oraz inną zawartością
pola tekst*/ 

public class Ciekawostka3 extends JDialog 
{ 
    
    private JTextArea tekst;
    private JScrollPane suwak;
    
    public Ciekawostka3(){
        setTitle("Bitwa pod Chocimiem");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
        setSize(800,600);
        setModal(true);
        setLocationRelativeTo(null);
        setResizable(false);
        
        tekst= new JTextArea("Bitwa pod Chocimiem – bitwa stoczona w dniach 2 września – 9 października 1621 roku pomiędzy armią Rzeczypospolitej Jana\n "
                + "Karola Chodkiewicza a armią turecką pod dowództwem sułtana Osmana II. Zamknięte w warownym obozie siły polsko-litewsko-kozackie, \n"
                + "stanęły na drodze armii osmańskiej pod miejscowością Chocim. Oblężenie zakończyło się taktycznym zwycięstwem armii Rzeczypospolitej,\n"
                + " ukoronowanym podpisaniem traktatu potwierdzającego ustalenia traktatu w Buszy z 1617 roku.\n"
                + "W Rzeczypospolitej, w obliczu realnego zagrożenia umilkły swary i Sejm zarządził ogromne podatki mające zapewnić pobór 65 tys. żołnierzy. \n"
                + "Dowódcą całości sił został mianowany hetman wielki litewski Jan Karol Chodkiewicz, który miał przenieść działania poza granice \n"
                + "Polski i stoczyć rozstrzygającą bitwę z Turkami nad Dunajem. Wspierać go mieli: Stanisław Lubomirski oraz królewicz Władysław Waza.\n"
                + " Obronę kraju mieli wspomagać Kozacy zaporoscy pod dowództwem Piotra Konaszewicza-Sahajdacznego, którzy pod warunkiem przeniesienia\n"
                + " wojny na terytorium mołdawskie zgodzili się uczestniczyć w wyprawie.\n" 
                + "Trudno ocenić liczebność obu armii, bowiem większość autorów tekstów źródłowych, jak i historyków opracowujących przebieg tej bitwy,\n "
                + "różni się znacząco podając dane, przy czym potwierdza się tylko jedna informacja – armia turecka była znacznie liczniejsza \n"
                + "(dwu- lub trzykrotnie) od polskiej.\n" 
                + "Tak więc można przyjąć, że siły polsko-litewsko-kozackie liczyły od 35 tysięcy do 60 tysięcy żołnierzy, 40-70 dział oraz \n"
                + "liczną czeladź, która również wpłynęła na losy bitwy. Siły tureckie szacuje się na 100-150 tysięcy żołnierzy oraz ponad 100 dział\n "
                + "oraz ponad 100 tysięcy czeladzi.\n" 
                + "\n2 września koło południa armia sułtańska nadeszła pod Chocim. Zaraz zaczęto też rozbijanie namiotów celowo szeroko rozłożonego obozu.\n"
                + " Chciano Polakom ukazać wielkość armii sułtańskiej i osłabić ich wolę walki. Chodkiewicz nie lekceważył przeciwnika, ale dla \n"
                + "poprawienia nastrojów swych żołnierzy mówił, że ilu Turków naprawdę jest policzy się szablą. Pewnością siebie i niewzruszoną\n "
                + "postawą budził zaufanie wojska i wiarę w zwycięstwo.\n" 
                + "Obóz polski znajdował się pomiędzy urwistymi brzegami Dniestru, a pokrytymi lasem wzgórzami. Tyły zabezpieczał zamek i warowna \n"
                + "cerkiew silnie obsadzona piechotą. Obwarowano też oba przyczółki mostowe. Wojska rozstawiono następująco: Chodkiewicz zajął lewe skrzydło,\n"
                + " w centrum stanął królewicz Władysław, a na prawym skrzydle Lubomirski. Tabor kozacki znajdował się nieco na południe od polskiego lewego skrzydła.\n" 
                + "\n3 września. Wieczorem Turcy uderzyli na prawe skrzydło Lubomirskiego i cerkiew, którą uważali za najsłabszy punkt polskiej obrony. \n"
                + "Zostali odrzuceni, a polska piechota wyparła ich z lasu, gdzie mieli stanowiska. Po południu wielkie siły uderzyły na tabor kozacki. \n"
                + "Wywiązała się walka niezwykle zacięta, ale i tu – z pomocą czeladzi obozowej – Turcy zostali odparci, a Kozacy pognali za nimi aż w głąb\n"
                + " tureckiego obozu, skąd wrócili dopiero o zmroku, gdy zatrąbiono na odwrót, niosąc bogate łupy.\n" 
                + "\n4 września. Tego dnia szturm był jeszcze silniejszy. Turcy zdołali w nocy usypać szańce, skąd razili polskie stanowiska ogniem artylerii.\n"
                + " Atakowali wszystkie polskie pozycje na całej linii, ale pod koniec dnia Kozacy, lisowczycy, piechota i czeladź natarli na \n"
                + "nich tak gwałtownie, że zdobyli szańce i zagwoździli działa.\n" 
                + "\n7 września. Nastąpił kolejny szturm. Janczarzy, wykorzystując brak czujności na prawym polskim skrzydle, wdarli się na szańce i \n"
                + "wycięli ponad stu ludzi piechoty. Odparto ich wprawdzie, ale spodziewano się nowego ataku. \n"
                + "Taki rzeczywiście nastąpił, ale wtedy Chodkiewicz ruszył do kontrataku husarię, którą poprowadził osobiście. Turcy nie wytrzymali uderzenia. \n"
                + "Rzucili się do bezładnej ucieczki, a husarzy gonili ich aż do samego obozu.\n" 
                + "Tymczasem zaczął się głód i choroby w polskim obozie. Zaraza zabiła wiele koni. Królewicz Władysław leżał powalony tzw. \"gorączką mołdawską\".\n"
                + " Zrozumiano, że plan Chodkiewicza, by pokonać wroga w walnej bitwie był planem jedynym rozsądnym. I dlatego, gdy podczas narady 10 \n"
                + "września wódz zaproponował nocny atak. Przygotowano ją na noc z 12 na 13 września, ale tuż przed atakiem przyszła gwałtowna\n "
                + "ulewa i akcję trzeba było odwołać. \n" 
                + "\n15 września ruszyło wielkie natarcie. Tym razem Turcy uderzyli na centrum polskiej linii, ale nic nie wskórali. \n"
                + "Polskie armaty czyniły ogromne wyrwy w stłoczonej masie janczarów, co spowodowało nagłe zatrzymanie atakujących, \n"
                + "a po chwili ich gwałtowną ucieczkę. Znów polski kontratak zadał wrogom ogromne straty.\n" 
                + "W obozie polskim rosło niezadowolenie, zaczęły się dezercje. 18 września śmiertelnie już chory hetman zwołał \"koło generalne\" \n"
                + "(zaproszono nawet starszyznę kozacką), któremu słabym głosem przedstawił położenie. Mowa wywołała pożądany efekt. \n"
                + "Wszyscy zobowiązali się walczyć do upadłego. \n" 
                + "\n24 września zmarł hetman Jan Karol Chodkiewicz. Przed śmiercią oddał buławę Lubomirskiemu. Wieść o tej stracie szybko obiegła \n"
                + "cały obóz i przedostała się do Turków, którzy nazajutrz – sądząc, że wśród Polaków panuje ogólne zamieszanie – przypuścili kolejny, \n"
                + "znów krwawo odparty atak. Podobnie było 28 września, ale tym razem w oczy Polakom zajrzało widmo klęski – w całym obozie została \n"
                + "jeszcze tylko jedna beczka prochu. Jedyną drogą ocalenia były układy. Na szczęście w otoczeniu sułtana również przewagę osiągnęła \n"
                + "partia pokojowa, a sam Osman II miał już dość przegranych bitew. W dodatku zbliżała się zima, a przed armią turecką perspektywa marszu \n"
                + "przez zasypane już śniegiem bezdroża Bałkanów.\n" 
                + "Po kilkudniowych rokowaniach, które ze strony polskiej prowadzili Jakub Sobieski i Stanisław Żórawiński, kasztelan bełski, \n"
                + "a ze strony tureckiej wielki wezyr Dilaver Pasza, zawarto 9 października traktat pokojowy, honorowy dla obu stron. \n"
                + "Po uznaniu przez Polskę zwierzchności tureckiej nad Mołdawią, armia turecka opuściła 10 października swój obóz, \n"
                + "a 13 tego miesiąca odeszli za Dniestr Polacy i Kozacy. Polacy zobowiązywali się powstrzymać Kozaków od najazdów na Turcję,\n "
                + "a Turcy powstrzymywać Tatarów od najazdów na Polskę. Granicą Rzeczypospolitej pozostał Dniestr.\n" 
                +"Straty stron (według nieprecyzyjnych danych) wyniosły:\n" 
                +"•	około 8 tys. Polaków oraz 6,5 tys. Kozaków\n" 
                +"•	około 40 tys. Turków, Wołochów i Mołdawian oraz 2 tys. Tatarów.\n");
        JScrollPane suwak = new JScrollPane(tekst);
        suwak.setBounds(0,0,800,600);
        
        add(suwak);
               
        setVisible(true);
    }
       
}