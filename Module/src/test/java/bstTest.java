import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bstTest {
    @Test
    void insert(){
        bst <Integer> ex = new bst<Integer>(3,null, null);
        ex = bst.insert(ex,4);
        assertEquals(4, ex.right().value());
    }

    @Test
    void delete(){
        bst <Integer> ex = new bst<Integer>(3,null, null);
        ex = bst.insert(ex,4);
        ex = bst.insert(ex,6);
        ex = bst.insert(ex,1);
        ex = bst.insert(ex,7);
        ex = bst.insert(ex,2);
        ex = bst.insert(ex,5);
        ex = bst.delete(ex,4);
        assertEquals(6, ex.right().value());
    }

    @Test
    void searchPath(){
        bst <Integer> ex = new bst<Integer>(3,null, null);
        ex = bst.insert(ex,4);
        ex = bst.insert(ex,6);
        ex = bst.insert(ex,1);
        ex = bst.insert(ex,7);
        ex = bst.insert(ex,2);
        ex = bst.insert(ex,5);
        IO.println(ex.toString());
        assertEquals("right", bst.searchPath(ex, 5).getValue());
    }
}