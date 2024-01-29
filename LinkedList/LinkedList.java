package LinkedList;

public class LinkedList<T>{
    
    private Node<T> root;
    private int size = 0;

    public LinkedList(T value){
        root.val = value;
        size++;
    }


    public void add(T value){

        Node<T> actual = root;

        while (actual != null) {
            
            if(actual.next == null)
                actual.next = new Node<T>(value);
            
            actual = actual.next;
        }

    }

    public void remove(T value){

        Node<T> actual = root;

        while (actual != null) {
            
            if(actual.next.val == value){
                actual.next = actual.next.next;
                break;
            }
                
            
            actual = actual.next;
        }

}

    public T get(){
        throw new UnsupportedOperationException("Get is not working yet");
    }

    //Get All

}
