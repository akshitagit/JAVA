public class AnagramStrings {
    public boolean checkAnagram(final String first, final String second) {

        int count = 0;

        if (first.length() == second.length()) {

            for (int index = 0; index < first.length(); index++) {
                if (second.contains(String.valueOf(first.charAt(index)))) {
                    count++;
                }
            }
        }
        return count == first.length();
    }

    public static void main(String[] args) {
        AnagramStrings anagramStrings = new AnagramStrings();
        System.out.println(anagramStrings.checkAnagram("hello", "elhlo"));

    }
}
