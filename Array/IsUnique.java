import java.util.HashMap;
/*
    Given a string check if it has all unique characters
 */
public class IsUnique {

    private static String example = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String args[]) {
        withHashMapImpl();
    }

    public static void withHashMapImpl() {
        HashMap<Character,Integer> charOccurence = new HashMap<>();
        // Iterate every Character of the String
        for(char w:example.toCharArray()) {
            // If Hashmap doesn't contain character put it inside
            if(!charOccurence.containsKey(w)) {
                charOccurence.put(w,0);
            } else {
                // If it already contains the character print and return
                System.out.println("Contains more than one same char.");
                return;
            }
        }
        // Print the result
        System.out.println("Unique characters only");
    }
}


