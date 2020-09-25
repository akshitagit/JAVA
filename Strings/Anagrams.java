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
        public static void main(String args[]){

        	String str1 = "test"; 
      	  	String str2 = "test"; 
      	  	Anagrams a = new Anagrams();
      	 	if (a.anagrams(str1, str2)) 
      	     System.out.println("Yes"); 
    	    else
            System.out.println("No"); 
    } 
}
