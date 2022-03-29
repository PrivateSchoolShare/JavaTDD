package at.itkolleg.ase.tdd.kino;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TestVorstellung {

    @Mock
    private KinoSaal kinoSaal;
    private Vorstellung vorstellung;

    @BeforeEach
    void setup(){
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 10);
        map.put('B', 13);
        map.put('C', 15);
        map.put('D', 22);
        kinoSaal = new KinoSaal("Kinosaal 1" ,map);
        vorstellung = new Vorstellung(kinoSaal, Zeitfenster.ABEND ,LocalDate.of(2022, 3, 28), "The Avengers", 20f);
    }

    @Test
    void getFilm(){
        assertEquals("The Avengers", vorstellung.getFilm());
    }

    @Test
    void getSaal(){
        assertEquals(kinoSaal, vorstellung.getSaal());
    }

    @Test
    void getZeitfenster(){
        assertEquals(Zeitfenster.ABEND, vorstellung.getZeitfenster());
    }

    @Test
    void getDatum(){
        assertEquals(0, vorstellung.getDatum().compareTo(LocalDate.of(2022, 3, 28)));
    }

    @Test
    void kaufeTicket(){
        Ticket ticket = vorstellung.kaufeTicket('D', 22, 20f);
        assertEquals(kinoSaal.getName(), ticket.getSaal());
        assertEquals(22, ticket.getPlatz());
        assertEquals('D', ticket.getReihe());
        assertEquals(Zeitfenster.ABEND, ticket.getZeitfenster());
    }

}
