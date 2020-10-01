
import java.util.Arrays;

// to check the string is anagram or not simple

public class Anagrams {

    public String sortString(String value) {
        char tempArray[] = value.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    public boolean anagramOutput(String s1, String s2) {
        boolean result = false;

        if (sortString(s1).equals(sortString(s2))) {
            result = true;
        }

        return result;

    }
}

class AnagramsDemo {
    public static void main(String args[]) {
        String s1 = "test";
        String s2 = "test";
        Anagrams a = new Anagrams();
        boolean result = a.anagramOutput(s1, s2);
        System.out.println("Anagram = " + result);

    }
}