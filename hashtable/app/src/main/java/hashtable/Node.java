package hashtable;


public class Node <T>{
    T value;
    T key;
    Node<T> next;


    public Node(T value, T key) {
        this.value = value;
        this.key = key;
    }

    public Node(){

    }


}