public record bst <T extends Comparable<T>>(T value, bst<T> left, bst<T> right){

    /** Accepts a binary search tree and a new value, inserting the value into the given tree */
    public static <T extends Comparable<T>> bst<T> insert(bst<T> tree, T newVal){
        if (tree==null){
            return new bst<>(newVal, null, null);
        } else {
            int cmp = tree.value.compareTo(newVal);
            if (cmp < 0 || tree.value.compareTo(newVal) == 0) {
                return new bst<>(tree.value, tree.left, insert(tree.right, newVal));
            } else if (cmp > 0) {
                return new bst<>(tree.value, insert(tree.left, newVal), tree.right);
            }
            return tree;
        }
    }

    /** Accepts a binary search tree and a new value. If the given value is in the tree, it returns the binary search tree without it */
    public static <T extends Comparable<T>> bst<T> delete(bst<T> tree, T val){
        if (tree == null) {
            return null;
        }
        int cmp = val.compareTo(tree.value());
        if (cmp < 0) {
            return new bst<>(tree.value(), delete(tree.left(), val), tree.right());
        }
        if (cmp > 0) {
            return new bst<>(tree.value(), tree.left(), delete(tree.right(), val));
        }
        if (tree.left() == null) {
            return tree.right();
        }
        if (tree.right() == null) {
            return tree.left();
        }
        bst<T> successor = tree.right();
        while (successor.left() != null) {
            successor = successor.left();
        }
        return new bst<>(successor.value(), tree.left(), delete(tree.right(), successor.value()));
    }

    /** Accepts a bst and a value, and returns true if the value exists within the bst, false otherwise */
    public static <T extends Comparable<T>> boolean search(bst<T> tree, T val){
        switch (tree){
            case null:
                return false;
            case bst(T v, bst<T> l, bst<T> r):
                if (v.compareTo(val)<0){
                    return search(r, val);
                } else
                if (v.compareTo(val)>0){
                    return search(l, val);
                } else{
                    return true;
                }
        }
    }

}
