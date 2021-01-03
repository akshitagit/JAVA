import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1.
 * The linked list holds the binary representation of a number. Return the decimal value of the number in the linked list.
 * Ex: [1,0,1] the program should return 5
 * Solution: We first iterate the list to get the number and the size, and the iteratively we find the number
 */
public class getDecimalValue {

    public int getListValue(LinkedList head) {

        ArrayList<Integer> l = new ArrayList<>();

        while(head!=null) {
            l.add(head.value);
            head=head.next;
        }

        int power = l.size()-1;

        int count = 0;

        for(int i=0;i<l.size();i++) {
            count += l.get(i)*Math.pow(2,power);
            power--;
        }
        return count;
    }
}

