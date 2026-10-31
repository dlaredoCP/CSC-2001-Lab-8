public record bst <T extends Comparable<T>>(T value, bst<T> left, bst<T> right){

    /** Accepts a binary search tree and a new value, inserting the value into the given tree */
    public static <T extends Comparable<T>> bst<T> insert(bst<T> tree, T newVal){
        if (tree==null){
            return new bst<>(newVal, null, null);
        } else
        if (tree.value.compareTo(newVal)==-1 || tree.value.compareTo(newVal)==0){
            return new bst<>(tree.value, tree.left, insert(tree.right, newVal));
        } else
        if (tree.value.compareTo(newVal)==1){
            return new bst<>(tree.value, insert(tree.left, newVal), tree.right);
        }
        return tree;
    }

    public static <T extends Comparable<T>> bst<T> delete(bst<T> tree, T val){
        switch (searchCheck(tree, val)){
            case 1:
                return deleteLeaf(tree, val);
            case 0:

            case -1:
        }
        return null;
    }

    /** Accepts a bst and a value (a leaf that needs to be deleted) and returns the bst without that leaf */
    public static <T extends Comparable<T>> bst<T> deleteLeaf(bst<T> tree, T val){
        if (tree==null){
            return null;
        } else
        if (tree.value.compareTo(val)<0){
            return new bst<>(tree.value, tree.left, deleteLeaf(tree.right, val));
        } else
        if (tree.value.compareTo(val)>0){
            return new bst<>(tree.value, deleteLeaf(tree.left, val), tree.right);
        } else
        if (tree.value.compareTo(val)==0){
            return null;
        }
        return tree;
    }

    /** Accepts a bst and a value (a value with only one child) and returns the bst without that value, swapping the parent with its child */
    public static <T extends Comparable<T>> bst<T> deleteSimpleSwap(bst<T> tree, T val){
        //TODO write this code
    }

    public static <T extends Comparable<T>> int searchCheck(bst<T> tree, T val){
        switch (tree){
            case null:
                return 0;
            case bst(T v, bst<T> l, bst<T> r):
                if (v.compareTo(val)<0){
                    return searchCheck(r, val);
                } else
                if (v.compareTo(val)>0){
                    return searchCheck(l, val);
                } else{
                    if (l==null && r==null){
                        return 1;
                    }
                    if (l==null || r==null){
                        return 0;
                    } else {
                        return -1;
                    }
                }
        }
    }
}
