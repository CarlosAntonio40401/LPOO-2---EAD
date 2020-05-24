package Lista_Lista;

public class Node {
    
    Object valor;
    Node next;
    Node prev;

    public Node(Object valor, Node next) {
        this.valor = valor;
        this.next = next;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
    
}
