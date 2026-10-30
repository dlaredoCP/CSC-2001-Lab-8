import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpotTest {
    @Test
    void randomSpot(){
        assertNotEquals(null, Spot.randomSpot());
    }

    @Test
    void compareTo(){
        Spot ex1 = new Spot("duck", 8.4, 9.4);
        Spot ex2 = new Spot("dogs", 10.33, -1.78);
        assertEquals(-1, ex1.compareTo(ex2));
    }
}