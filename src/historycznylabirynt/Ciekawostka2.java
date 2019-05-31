package historycznylabirynt;

import javax.swing.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/* ze względu na 3 podobne klasy (Ciekawostka1,Ciekawostka2 oraz Ciekawostka3) komentarze umieszczę tylko w piereszej klasie(Ciekawostka1). Klasy różnią się nazwami metod, oraz inną zawartością
pola tekst*/ 

public class Ciekawostka2 extends JDialog 
{ 
    
    private JTextArea tekst;
    private JScrollPane suwak;
    
    public Ciekawostka2(){
        setTitle("Bitwa pod Maratonem");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
        setSize(800,600);
        setModal(true);
        setLocationRelativeTo(null);
        setResizable(false);
        
        tekst= new JTextArea("Bitwa pod Maratonem – najważniejsza bitwa pierwszej wielkiej inwazji perskiej na Grecję, która miała miejsce w roku 490 p.n.e. \n"
                + "Maraton to mała miejscowość we wschodniej Attyce. Po upadku powstania jońskiego (499-494) król Persji Dariusz I postanowił podbić Grecję,\n"
                + " którą zamierzał ukarać za opowiedzenie się po stronie powstańców. W 492 p.n.e. r. wysłał do Grecji armię pod dowództwem Mardoniusza. \n"
                + "\nPersowie ponieśli w Tracji klęskę. Dalsze próby podbicia kraju skończyły się niepowodzeniem, gdyż sztorm zniszczył większą część \n"
                + "floty perskiej, zmuszając Mardoniusza do odwrotu. Dariusz planował poprzez kolejne ataki podporządkować sobie całą Grecję,\n "
                + "korzystając z faktu, iż część polis, w obawie przed stratami, odmówiła udziału w wojnie. Król wysłał kolejną armię pod wodzą Datisa \n"
                + "i Artafernesa, która wylądowała na Eubei, gdzie spacyfikowała Karystos i Eretrię, a następnie w Attyce wschodniej, w okolicach Maratonu,\n"
                + " skąd zamierzała uderzyć na Ateny. Armia ta liczyła najprawdopodobniej około 25 tys. piechoty i - być może - kilkaset jazdy.\n "
                + "\nAteńczycy ruszyli spiesznym marszem naprzeciw, zostawiając siły lekkie, a jednocześnie wysłali posłańca do Sparty.\n "
                + "Ten osiągnął cel 9 września. Spartanie przyrzekli pomoc, jednak dopiero po zakończeniu świąt Apollina Karnejskiego (20 września).\n"
                + " Uczestnictwo w wojnie w trakcie świąt religijnych było w tamtych czasach świętokradztwem. Schodząca ze stoków Pentelikonu armia ateńska\n "
                + "(10 tys. ludzi) pod wodzą 10 strategów, reprezentujących 10 ateńskich fyl (po drodze dołączyło do niej jeszcze około tysiąca Platejczyków), \n"
                + "ujrzała flotę nieprzyjacielską przy brzegu i rozłożone obozem wojska. W polu pokazywali się konni, a falanga najbardziej obawiała się oskrzydlenia.\n"
                + " Dlatego Grecy zatrzymali się w Gaju Heraklesa i czekali. Tymczasem wśród dowodzących strategów nie było jedności, pięciu chciało\n "
                + "wracać do Aten i bronić się zza murów, pięciu, z Miltiadesem na czele, chciało się bić. Wezwano archonta-polemarcha Kallimacha i\n"
                + " zdano się na jego werdykt. Kalimach, przekonany wcześniej przez Miltiadesa (świetnie znającego Persów) poparł partię walki w polu,\n"
                + " która zdała dowodzenie w ręce Miltiadesa. W ten sposób mógł on dowodzić przez 5 dni, a więc przeprowadzić swój plan bitewny.\n "
                + "\n12 września obie armie stanęły naprzeciwko siebie. Grecy czekali za zasiekami z pni drzew oliwnych, gdy w nocy podczołgali się \n"
                + "do nich jacyś żołnierze jońscy, siłą wcieleni do armii perskiej i przekazali krótką wiadomość \"Konnicy nie ma!\" Na to właśnie czekał Miltiades.\n"
                + " Poderwał śpiących w szyku żołnierzy, którzy ruszyli na nieprzyjaciela przeformowując szyk tak, by skrzydła były dwukrotnie mocniejsze niż centrum.\n"
                + " Będąc w odległości 200-150 metrów od Persów ruszyli biegiem, uniemożliwiając im skorzystanie z ich najgroźniejszej broni - łuków.\n"
                + " Grecy uderzyli najmocniej na skrzydła i tam odnieśli od razu sukces, a centrum zostało nieco w tyle, tworząc półkole, \n"
                + "i w ten sposób oskrzydlając wojska Dariusza. Persowie dostali się w kleszcze atakujących z powodzeniem na skrzydłach hoplitów \n"
                + "i w panice rozpoczęli ucieczkę w kierunku własnych okrętów. Persowie wycofali się, pozostawiając na placu boju pod Maratonem 6400 poległych.\n"
                + " Grecy stracili tylko 192 ludzi. Wtedy wysłano do Aten Filippidesa, żeby ogłosił zwycięstwo Grecji. Przebiegł on około 40 km, ogłosił,\n "
                + "że Grecja zwyciężyła, przekazał informację o zbliżających się Persach i - według legendy - zmarł z wycieńczenia. W kilka dni później pojawili \n"
                + "się Spartanie, którzy policzywszy zabitych pogratulowali zwycięzcom i wrócili do domu. Nie walczyli, gdyż zatrzymać ich miały misteria religijne.\n"
                + " Tracąc 6 okrętów Persowie odpłynęli do Faleronu, licząc na zajęcie Aten z zaskoczenia, jednak dzięki informacji przekazanej\n"
                + " przez Fillipidesa Ateńczycy byli na to przygotowani. Przebrali zwykłych ludzi w zbroje, ustawili na murach, przez co Persowie z Datisem\n"
                + " na czele wycofali się, widząc uzbrojone miasto. Zapisy historyków tamtej doby są nadzwyczaj lakoniczne i sprzeczne, więc pozostawiają wiele \n"
                + "wątpliwości. Pierwsze pytanie dotyczy informacji o braku konnicy. Oddaliła się z jakimś zadaniem, a może w ogóle jej nie było.\n "
                + "\nMożna przyjąć, że jeśli w armii Datisa i Artafernesa byli konni, to zapewne było ich niewielu, pełnili oni tylko rolę zwiadowców.\n"
                + " Pytanie drugie dotyczy tego, kto pierwszy zaatakował. Możliwe, że Grecy przeszli 1,4 km, a resztę przebiegli, by nadać impet uderzeniu.\n"
                + " Nie obawiali się łuczników, gdyż mieli duże tarcze (hoplon) i mogli się skutecznie osłonić. Jest jeszcze druga teoria, w myśl której wydaje\n "
                + "się wielce prawdopodobne, że greckim hoplitom w owym czasie nikt nie mógł dorównać.\n");
        JScrollPane suwak = new JScrollPane(tekst);
        suwak.setBounds(0,0,800,600);
        
        add(suwak);
               
        setVisible(true);
    }
       
}