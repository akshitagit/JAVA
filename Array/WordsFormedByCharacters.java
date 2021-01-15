/**
*   You are given an array of strings words and a string chars.
*   A string is good if it can be formed by characters from chars 
*   (each character can only be used once).
*   Return the sum of lengths of all good strings in words.
**/

class WordsFormedByCharacters {
    public int countCharacters(String[] words, String chars) {
        
        int [] arr = new int[26];
        for(char c:chars.toCharArray())
            arr[c-'a']++; 
        
        int ret = 0;
        for(String word:words) {
            
            int [] arr1 = Arrays.copyOf(arr,26);
            boolean canMake = true;
            
            for(int i=0;i<word.length();i++) {
                
                if(arr1[word.charAt(i)-'a']>0) {
                    arr1[word.charAt(i)-'a']--;
                } else {
                    canMake = false;
                }  
            }
            
            if(canMake)
                ret += word.length();
            
        }
        return ret;
    }
}
