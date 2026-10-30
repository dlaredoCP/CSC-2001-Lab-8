public class Node <T> {
    private T value;
    private Node <T> rest;

    public Node(T value, Node <T> rest){
        this.value=value;
        this.rest=rest;
    }

    public T getValue(){
        return value;
    }

    public Node<T> getRest(){
        return rest;
    }
}
