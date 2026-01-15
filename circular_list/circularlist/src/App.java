public class App {
    public static void main(String[] args) throws Exception {

        ListaNodi lista = new ListaNodi();
        
        Node n1 = new Node(67);
        Node n2 = new Node(68);
        Node n3 = new Node(69);

        lista.add(n1);
        lista.add(n2);
        lista.add(n3);

        lista.stampa();
    }
}
