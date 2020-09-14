final class Node<T> {
    private T data;
    private Node<T> next=null;

    public Node(T param){
        this.data = param;
    }

    boolean insertFirst(T data){
        try {
            Node<T> first = new Node<T>(data); 
            first.next=this;
            return true;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }
    }

    boolean insertByPosition(T data, int position) {
        try {
            if(position<1){
                System.out.println("Did you mean insertFirst()?");
                return false;
            }
            Node<T> mid = new Node<T>(data);
            Node<T> runner = this;
            while(position-1>0 && runner.next!=null){
                runner=runner.next;
                --position;
            }
            if(runner.next==null)
                System.out.println("Position is out of bound. Inserting as last element. You can also try insertLast() for the same.");
            mid.next=runner.next;
            runner.next=mid;
            return true;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }
    }

    boolean insertLast(T data){
        try {
            Node<T> last = new Node<T>(data);
            Node<T> runner = this;
            while(runner.next!=null){
                runner=runner.next;
            }
            runner.next = last;
            return true;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }
    }

    boolean deleteFirst(){
        try {
            System.out.println("Deleted Item: "+this.data);
            this.data = this.next.data;
            this.next=this.next.next;
            return true;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }
    } 

    T deleteByPosition(int position){
        try {
            if(position<1){
                System.out.println("Did you mean deleteFirst()?");
                return null;
            }
            Node<T> runner = this;
            while(position-1>0 && runner.next!=null){
                runner=runner.next;
                --position;
            }
            if(runner.next!=null){
                T deletedData = runner.next.data;
                runner.next = runner.next.next;
                return deletedData;
            } else {
                System.out.println("Position is out of bound. Unable to delete.");
                return null;
            }
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    } 

    T deleteLast(){
        try {
            Node<T> last = this;
            while(last.next.next!=null){
                last=last.next;
            }
            T deletedData = last.data;
            last.next=null;
            return deletedData;
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    } 

    boolean deleteByContent(T content){
        try {
            Node<T> runner = this;
            if(runner.data == content){
                this.data = this.next.data;
                this.next=this.next.next;
                return true;
            }
            while(runner.next.next!=null && runner.next.data!=content){
                runner=runner.next;
            }
            if(runner.next.data==content){
                runner.next=runner.next.next;
                return true;
            } else {
                System.out.println("Match not found. Unable to delete.");
                return false;
            }
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }
    }

    T updateByPosition(int position, T newData){
        try {
            Node<T> runner = this;
            while(position>0 && runner.next!=null){
                runner=runner.next;
                --position;
            }
            if(runner.next==null && position>0){
                System.out.println("Position out of bound. Unable to update.");
                return null;
            }
            System.out.println("Data updated: "+runner.data+"->"+newData);
            runner.data = newData;
            return newData;
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }

    T updateByContent(T content, T newData){
        try {
            Node<T> runner = this;
            while(runner.data != content && runner.next!=null){
                runner=runner.next;
            }
            if(runner.data!=content){
                System.out.println("Match not found. Unable to update.");
                return null;
            }
            System.out.println("Data updated: "+runner.data+"->"+newData);
            runner.data = newData;
            return newData;
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }

    T getContent(int position){
        try {
            Node<T> runner = this;
            while(position>0 && runner.next!=null){
                runner=runner.next;
                --position;
            }
            return runner.data; 
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }

    void getContentAll(){
        try {
            Node<T> runner = this;
            System.out.print("[");
            while(runner!=null){
                System.out.print(runner.data);
                runner=runner.next;
                if(runner!=null)
                    System.out.print(",");
            }
            System.out.print("]");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        Node<Integer> a = new Node<Integer>(5);
        a.insertLast(4);
        a.insertLast(6);
        a.insertLast(8);
        a.deleteByPosition(3);
        a.updateByContent(4,3);
        a.updateByPosition(0, 4);
        a.getContentAll();
    }
}

