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

    @Mock
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
        kinoVerwaltung = new KinoVerwaltung();

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
