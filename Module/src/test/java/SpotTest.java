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
        assertEquals(1, ex1.compareTo(ex2));
    }

    @Test
    void greatestLowerBound(){
        Spot ex1 = new Spot("dnde", 4.4, -2.861);
        Spot ex2 = new Spot("dnde", 4.4, -39.433);
        Spot ex3 = new Spot("dnde", 4.4, 43.676);
        Spot ex4 = new Spot("dnde", 4.4, -66.329);
        Spot ex5 = new Spot("dnde", 4.4, -8.498);
        Spot ex6 = new Spot("dnde", 4.4, 35.778);
        Spot ex7 = new Spot("dnde", 4.4, 66.4334);

        bst<Spot> tree = new bst<>(ex1, null, null);
        tree = bst.insert(tree, ex2);
        tree = bst.insert(tree, ex3);
        tree = bst.insert(tree, ex4);
        tree = bst.insert(tree, ex5);
        tree = bst.insert(tree, ex6);

        assertEquals(43.676, Spot.greatestLowerBound(tree, 45.4).Longitude());
    }
}