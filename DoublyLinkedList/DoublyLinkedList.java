public class DoublyLinkedList {
    private Link Head;
    private Link Tail;

    public DoublyLinkedList() {
        Head = null;
        Tail = null;
    }

    public boolean isEmpty() {
        return Head == null;
    }

    public void InsertFirst(int data) {
        Link node = new Link ( data );
        if (isEmpty ()) {
            Tail = node;
        } else {
            Head.prev = node;
        }
        node.next = Head;
        Head = node;
    }

    public void InsertLast(int data) {
        Link node = new Link ( data );
        if (isEmpty ()) {
            InsertFirst ( data );
        } else {
            Tail.next = node;
            node.prev = Tail;
        }
        Tail = node;
    }

    public void InsertAfter(int index, int data) {
        Link node = new Link ( data );
        if (index == 0) {
            InsertFirst ( data );
        } else {
            Link n = Head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            node.prev = n;
            n.next = node;
            n.next.prev = node;
            Tail = node;
        }
    }

    public Link DeleteFirst() {
        Link temp = Head;
        if (Head.next == null)
            Tail = null;
        else
            Head.next.prev = null;
        Head = Head.next;
        return temp;
    }

    public Link DeleteLast() {
        Link temp = Tail;
        if (Head.next == null)
            Head = null;
        else
            Tail.prev.next = null;
        Tail = Tail.prev;
        return temp;
    }

    public Link deleteKey(int data) {
        Link n = Head;
        while (n.data != data) {
            n = n.next;
            if (n == null)
                return null;
        }
        if (n == Head) {
            Head = n.next;
        } else
            n.prev.next = n.next;
        if (n == Tail)
            Tail = n.prev;
        else
            n.next.prev = n.prev;
        return n;
    }

    public void DisplayForward() {
        System.out.print ( "List(first --> last): " );
        Link node = Head;
        while (node != null) {
            node.displayNode ();
            node = node.next;
        }
        System.out.println ();
    }

    public void DisplayBackward() {
        System.out.print ( "List(Last --> First): " );
        Link node = Tail;
        while (node != null) {
            node.displayNode ();
            node = node.prev;
        }
        System.out.println ();
    }
}
