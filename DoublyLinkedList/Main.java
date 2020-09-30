import java.util.scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println ("DoublyLinkedList");
        Scanner sc = new Scanner ( System.in );
                System.out.println ("DoublyLinked list");
                DoublyLinkedList dl = new DoublyLinkedList ();
                dl.InsertFirst ( 22 );
                dl.InsertFirst ( 44 );
                dl.InsertFirst ( 66 );

                dl.InsertLast ( 11 );
                dl.InsertLast ( 33 );
                dl.InsertLast ( 55 );

                dl.DisplayForward ();
                dl.DisplayBackward ();

                dl.DeleteFirst ();
                dl.DeleteLast ();
                dl.deleteKey ( 11 );

                dl.DisplayForward ();
            }
        }
