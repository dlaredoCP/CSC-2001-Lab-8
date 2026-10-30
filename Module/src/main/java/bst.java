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
    // TODO: delete method
    public static <T extends Comparable<T>> bst<T> delete(bst<T> tree, T val){
        Node<String> path = searchPath(tree, val);
        for ()
    }

    public static <T extends Comparable<T>> Node<String> searchPath(bst<T> tree, T val){
        switch (tree){
            case null:
                return null;
            case bst(T v, bst<T> l, bst<T> r):
                if (v.compareTo(val)>0){
                    return new Node<>("left", searchPath(tree.left, val));
                } else
                if (v.compareTo(val)<0){
                    return new Node<>("right", searchPath(tree.right, val));
                } else {
                    return null;
                }
        }
    }
}
