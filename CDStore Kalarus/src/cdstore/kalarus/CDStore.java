package cdstore.kalarus;

import cdstore.cds.CD;
import cdstore.cds.AudioCD;
import cdstore.cds.GameCD;
import cdstore.cds.MovieCD;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CDStore {

    /**
     * Tutaj testujemy napisany kod
     */
    public static void main(String[] args) {

/*
        //wartości ustawiamy w bloku try-catch, aby w sytuacji wyjątkowej (pusty tytuł)
        //nie został wykonany kod związany z tym obiektem, ale by wykonała się
        //pozostała (dalsza) część kodu. 
        AudioCD o2 = new AudioCD();
        try {
            o2.setTitle("");        // <- tu zostanie rzucony wyjątek
            o2.setArtist("ktoś");   //więc ani to...
            System.out.println(o2); //ani to się nie wykona
        } catch (IllegalArgumentException e) {
            System.out.println("Błąd: "+e.getMessage());
        } catch (Exception e) {
            System.out.println("Inny błąd");
        }
*/        
                
        //tworzymy obiekty za pomocą konstruktora wieloparametrowego
        AudioCD o4 = new AudioCD("muzyka", "artysta", 19);
        
        MovieCD o5 = new MovieCD("film", "reżyser", 39.90);

        GameCD o6 = new GameCD("gra", "PC", 59);
        
        //tworzymy kolekcję (listę) i dodajemy do niej trzy obiekty
        List<CD> list = new ArrayList<>();
        list.add(o4);
        list.add(o5);
        list.add(o6);
        
/*
        //to jest klasyczny sposób iterowania za pomocą iondeksu (jak w przypadku tablic)
        for (int i=0; i<=list.size(); i++) {
            System.out.println(i+": "+list.get(i));
        }
*/
        
/*      
        //tu korzystamy z pętli "for each"
        for (CD o : list) {
            System.out.println(o);
        }
*/
        
        //a tu używamy iteratora
        //zaczynamy od "wyciągnięcia" obiektu iteratora z listy
        Iterator<CD> it = list.iterator();
        //a później wykonujemy pętlę, w której warunek sprawdzamy za pomocą
        //metody hasNext()
        while (it.hasNext()) {
            //jeżeli jest kolejny element (hasNext() == true), możemy nad nim
            //przeskoczyć, równocześnie go pobierając
            CD o = it.next();
            
            System.out.println(o);
        }
        
    }
}
