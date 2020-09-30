
public class Link {
    public int data;
    public Link next;
    public Link prev;

    public Link(int data) {
        this.data = data;
    }

    public void displayNode() {
        System.out.print ( this.data + " " );
    }
}
