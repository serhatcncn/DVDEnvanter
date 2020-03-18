
public class Node {
    
    public DVD data;
    public Node previous;
    public Node next;

    public Node(DVD data, Node previous, Node next) {
        this.data = data;
        this.previous = previous;
        this.next = next;
    }

    public Node(DVD data ) {
        this.data = data;
    }
 
}


