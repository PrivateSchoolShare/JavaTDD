package at.itkolleg.ase.tdd.kino;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class TestKinoSaal {

    @Mock
    private KinoSaal kinosaal;

    @BeforeEach
    void setup(){
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 10);
        map.put('B', 13);
        map.put('C', 15);
        map.put('D', 22);
        kinosaal = new KinoSaal("Kinosaal 1" ,map);
    }

    @Test
    void getName(){
        assertEquals("Kinosaal 1", kinosaal.getName());
    }

    @Test
    void testPlaetze(){
        assertFalse(kinosaal.pruefePlatz('A', 13));
        assertTrue(kinosaal.pruefePlatz('B', 13));
    }

}
