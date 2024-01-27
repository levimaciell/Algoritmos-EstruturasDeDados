package LinkedList;

public class LinkedList<T>{
    
    private Node<T> root;
    private int size = 0;

    public LinkedList(T value){
        root.val = value;
        size++;
    }

    public void add(T value){
        throw new UnsupportedOperationException("Add is not working yet");
    }

    public void remove(T value){
        throw new UnsupportedOperationException("Remove is not working yet");
    }

    public T get(){
        throw new UnsupportedOperationException("Get is not working yet");
    }

}
