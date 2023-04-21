package pirkovic.andrea;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*Regularni izraz sluzi da pronadjemo ili uparimo jedan niz karaktera sa drugim nizom ili skupom nizova karaktera, 
 koristeći specijalizovanu sintaksu za pretrazivanje sablona . Mogu se koristiti za pretragu,
 uređivanje ili manipulaciju tekstom i podacima.
Paket java.util.regex se sastoji od tri klase −
Klasa Pattern – Objekat klase Pattern je kompajlirani prikaz regularnog izraza.  Da bi se kreirao sablon za pretragu, prvo mora da 
se pozove jednu od njegovih javnih statičkih metoda compile(), koja će zatim vratiti objekat Pattern. Ove metode prihvataju regularni izraz 
kao prvi argument.
Matcher Class – Matcher objekat  tumači sablon i izvodi operacije podudaranja sa ulaznim nizom karaktera. 
 Matcher objekat se kreira pozivanjem metode matcher().
PatternSintaxException – PatternSintakEkception je neproveren izuzetak koji ukazuje na sintaksnu grešku u sablonu regularnog izraza.*/
public class Main {

   public static void main( String args[] ) {
      Scanner sc= new Scanner(System.in);
      
      
      String line = "Zelim da nadjem neku od ovih reci";// Ulazni String koji zelimo da pretrazimo, tj u kojem cemo traziti podudaranje.
      System.out.println("Unesite rec za pretragu ");
      String pattern = sc.nextLine(); // String ili sablon karaktera koji zelimo da nadjemo, unosimo preko konzole npr
      
      // Kreiranje Pattern objekta i prosledjivanje stringa koji zelimo da nadjemo
      Pattern p = Pattern.compile(pattern);

      // Kreiranje matcher objekta i poredjenje sablona sa ulaznim stringom.
      Matcher m = p.matcher(line);
      if (m.find( )) {
         System.out.println("Pronadjeno podudaranje");
         
      }else {
         System.out.println("Nema podudaranja");
      }
   }
}