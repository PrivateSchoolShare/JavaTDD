package at.itkolleg.ase.tdd.kino;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class TestKinoverwaltung {


    private KinoSaal kinoSaal;
    private Vorstellung vorstellung;
    private KinoVerwaltung kinoVerwaltung;



    @BeforeEach
    void setup(){
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 10);
        map.put('B', 13);
        map.put('C', 15);
        map.put('D', 22);
        kinoSaal = new KinoSaal("Kinosaal 1" ,map);
        vorstellung = new Vorstellung(kinoSaal, Zeitfenster.ABEND , LocalDate.now(), "The Avengers", 20f);
        kinoVerwaltung = new KinoVerwaltung(); // fragen wegen test constructor

    }

    @Test
    void kinoVerwaltungConstructor(){
        boolean thrown = false;
        try{
            KinoVerwaltung k = new KinoVerwaltung();
        }catch(Exception e){
            thrown = true;
        }
        assertFalse(thrown);
    }

    @Test
    void getVorstellung(){
        kinoVerwaltung.einplanenVorstellung(vorstellung);
        assertTrue(kinoVerwaltung.getVorstellungen() instanceof java.util.LinkedList);
    }

    @Test
    void kaufeTicket(){
        assertTrue(kinoVerwaltung.kaufeTicket(vorstellung, 'D', 22, 20f) instanceof Ticket);
    }

    @Test
    void einplanenVorstellung(){
        boolean thrown = false;

        try{
            kinoVerwaltung.einplanenVorstellung(vorstellung);
        }catch (Exception e){
            thrown = true;
        }

        assertFalse(thrown);

        // mehrere Vorstellungen einplanen
        Vorstellung v1 = new Vorstellung(kinoSaal, Zeitfenster.ABEND , LocalDate.of(2022, 12, 1), "The Avengers", 20f);
        Vorstellung v2 = new Vorstellung(kinoSaal, Zeitfenster.ABEND , LocalDate.of(2022, 12, 2), "The Avengers", 20f);
        Vorstellung v3 = new Vorstellung(kinoSaal, Zeitfenster.ABEND , LocalDate.of(2022, 12, 3), "The Avengers", 20f);
        Vorstellung v4 = new Vorstellung(kinoSaal, Zeitfenster.ABEND , LocalDate.of(2022, 12, 4), "The Avengers", 20f);
        try{
            kinoVerwaltung.einplanenVorstellung(v1);
            kinoVerwaltung.einplanenVorstellung(v2);
            kinoVerwaltung.einplanenVorstellung(v3);
            kinoVerwaltung.einplanenVorstellung(v4);
        }catch (Exception e){
            thrown = true;
        }

        assertFalse(thrown);

    }

    @Test
    void einplanenVorstellungCrash(){
        boolean thrown = false;

        try{
            kinoVerwaltung.einplanenVorstellung(vorstellung);
            kinoVerwaltung.einplanenVorstellung(vorstellung);
        }catch (Exception e){
            thrown = true;
        }

        assertTrue(thrown);

    }

}
