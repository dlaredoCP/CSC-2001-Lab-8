import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bstTest {

    @Test
    void measurement(){
        for (long x=1000; x<Math.pow(100,5)*1000; x*=100){
            long startTime = System.nanoTime();
            bst<Spot> tree = new bst<>(Spot.randomSpot(), null, null);
            for (long i=0; i<x; i++){
                tree = bst.insert(tree, Spot.randomSpot());
            }
            long endTime = System.nanoTime();
            double t = (double) (endTime - startTime) / 1000000000;
            IO.println("It took " + t + " seconds to make a binary search tree with " + x + " elements!");
        }

    }

    @Test
    void insert(){
        bst <Integer> ex = new bst<Integer>(3,null, null);
        ex = bst.insert(ex,4);
        assertEquals(4, ex.right().value());
    }

    @Test
    void delete(){
        bst <Integer> ex = new bst<Integer>(12,null, null);
        ex = bst.insert(ex,18);
        ex = bst.insert(ex,7);
        ex = bst.insert(ex,14);
        ex = bst.insert(ex,23);
        ex = bst.insert(ex,2);
        ex = bst.insert(ex,10);
        ex = bst.insert(ex,16);
        ex = bst.insert(ex,15);
        ex = bst.insert(ex,17);
        ex = bst.insert(ex,9);
        ex = bst.delete(ex, 12);
        assertEquals(16, ex.right().left().value());
    }

    @Test
    void search(){
        bst <Integer> ex = new bst<Integer>(3,null, null);
        ex = bst.insert(ex,4);
        ex = bst.insert(ex,6);
        ex = bst.insert(ex,1);
        ex = bst.insert(ex,7);
        ex = bst.insert(ex,2);
        ex = bst.insert(ex,5);
        assertEquals(true, bst.search(ex, 5));
    }
}