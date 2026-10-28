import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpotTest {
    @Test
    void randomSpot(){
        assertNotEquals(null, Spot.randomSpot());
    }
}