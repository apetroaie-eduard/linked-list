public class ListaNodi {

    private Node head;
    private Node tail;

    public ListaNodi() {
        head = null;
        tail = null;
    }

    public ListaNodi(Node h, Node t) {
        this.head = h;
        this.tail = t;
        head.setNext(tail);
        tail.setNext(head);
    }

    public void add(Node nuovo) {
        if (tail != null && head != null) {
            tail.setNext(nuovo);
            this.tail = nuovo;
            tail.setNext(head);
        } else if (head == null && tail == null) {
            head = nuovo;
            tail = nuovo;
            tail.setNext(head);
        } else if (head == tail) {
            tail.setNext(nuovo);
            this.tail = nuovo;
            head.setNext(tail);
            nuovo.setNext(head);
        }
    }

    public void stampa() {
        Node cursore = head;
        do {
            System.out.println(cursore.toString());
            cursore = cursore.getNext();
        } while (cursore != head);
    }

    public boolean checkRing(Node cursore){
        
        if(head.getNext() != null && tail.getNext() != null){
            return true;
        } else{
            return false;
        }
    }

}