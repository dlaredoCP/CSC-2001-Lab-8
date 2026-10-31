import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bstTest {
    @Test
    void insert(){
        bst <Integer> ex = new bst<Integer>(3,null, null);
        ex = bst.insert(ex,4);
        assertEquals(4, ex.right().value());
    }

    //TODO: delete test

    //TODO: deleteSimpleSwap test

    //TODO: deleteHardSwap test


    @Test
    void deleteLeaf(){
        bst <Integer> ex = new bst<Integer>(3,null, null);
        ex = bst.insert(ex,4);
        ex = bst.insert(ex,6);
        ex = bst.insert(ex,1);
        ex = bst.insert(ex,7);
        ex = bst.insert(ex,2);
        ex = bst.insert(ex,5);
        ex = bst.deleteLeaf(ex,7);
        assertEquals(null, ex.right().right().right());
    }

    @Test
    void searchCheck(){
        bst <Integer> ex = new bst<Integer>(3,null, null);
        ex = bst.insert(ex,4);
        ex = bst.insert(ex,6);
        ex = bst.insert(ex,1);
        ex = bst.insert(ex,7);
        ex = bst.insert(ex,2);
        ex = bst.insert(ex,5);
        assertEquals(1, bst.searchCheck(ex, 5));
    }
}