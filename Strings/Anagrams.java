import java.util.*;

class Anagrams {
	Boolean anagrams(String a, String b){
        
        char[] str1 = a.toCharArray(); 
        char[] str2 = b.toCharArray(); 
        int n1 = str1.length;
        int n2 = str2.length;

        if(n1 != n2){
        	return false;
        }

        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < n1; i++) 
            if (str1[i] != str2[i]) 
                return false; 
  
        return true; 
	}
	
	// approach 2: optimized solution

	static void isAnagram(String a, String b) {
		int al[] = new int[256]; // create an int array with 256 capacity
		boolean isAnagram = true;
		for (char c : a.toCharArray()) {
			int index = (int) c; // find the ASCII value of each individual character in the first string and
									// store in index.
			al[index]++; // increase the value by 1 in the int array at the corresponding index of each
							// character
		}
		for (char c : b.toCharArray()) {
			int index = (int) c; // find the ASCII value of each individual character in the 2nd string and store
									// in index.
			al[index]--; // decrease the value by 1 in the int array at the corresponding index of each
							// character
		}

		// if two given strings were anagrams then each index of the int Array would
		// eventually contain zero.
		for (int i = 0; i < 256; i++) {
			if (al[i] != 0) {
				isAnagram = false;
				break;
			}
		}
		if (isAnagram) {
			System.out.println("Anagram");
		} else
			System.out.println("not an Anagram");
	}
	

	
	
        public static void main(String args[]){

        	String str1 = "test"; 
      	  	String str2 = "test"; 
      	  	Anagrams a = new Anagrams();
      	 	if (a.anagrams(str1, str2)) 
      	     System.out.println("Yes"); 
    	    else
            System.out.println("No");
		
	    isAnagram(str1, str2);
    } 
}
