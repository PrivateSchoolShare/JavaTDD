package at.itkolleg.ase.tdd.kino;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * Dieses Beispiel stammt aus https://training.cherriz.de/cherriz-training/1.0.0/testen/junit5.html
 */
public class App 
{
    public static void main( String[] args )
    {
//        //Saal anlegen
//        Map<Character,Integer> map = new HashMap<>();
//        map.put('A',10);
//        map.put('B',10);
//        map.put('C',15);
//        System.out.println("New Kinosaal");
//        KinoSaal ks = new KinoSaal("LadyX",map);
//
//        //Platz prüfen
//        System.out.println(ks.pruefePlatz('A',11));
//        System.out.println(ks.pruefePlatz('A',10));
//        System.out.println(ks.pruefePlatz('B',10));
//        System.out.println(ks.pruefePlatz('C',14));
//
//        //...
        Map<Character, Integer> map = new HashMap<>();
        map.put('A',10);
        map.put('B',10);
        map.put('C',15);
        KinoSaal kinoSaal = new KinoSaal("Ultra Kinosaal", map);
//        LocalDate localDate = LocalDate.of(2022, 3, 24);
        Vorstellung vorstellung = new Vorstellung(kinoSaal, Zeitfenster.ABEND, LocalDate.of(2022, 3, 24), "The Avengers", 17.32f);

        KinoVerwaltung kinoVerwaltung = new KinoVerwaltung();
        kinoVerwaltung.einplanenVorstellung(vorstellung);

        kinoVerwaltung.kaufeTicket(vorstellung, 'C', 15, 17.32f);

        System.out.println(kinoVerwaltung.getVorstellungen());

    }
}
