import java.util.HashMap;

public class StringCompression{

    private static String example = "aaaaabbbbbeeeeeeee";

    public static void main(String args[]) {
        System.out.println(encoding());
    }

    private static String encoding() {

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c: example.toCharArray()) {
            if(!map.containsKey(c))
                map.put(c,0);
            map.put(c, map.get(c) + 1);
        }

        StringBuilder encodedString  = new StringBuilder();
        for(char c: map.keySet()) {
            encodedString.append(c + Integer.toString(map.get(c)));
        }

        if(encodedString.length() > example.length())
            return  example;
        return encodedString.toString();

    }
}

