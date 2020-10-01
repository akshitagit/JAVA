import java.util.*;

class Anagrams {
	Boolean anagrams(String a, String b){
  
		   
     

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
		
		    char[] strch1 = a.toCharArray(); 
                    char[] strch2 = b.toCharArray(); 
      	  	
		if(strch1.length!=strch2.length)
		{
			System.out.println("No");
		}
		else
		{
			int flag=1;
		      for(int i=0;i<strch1.length;i++)
		      {
			      if(strch1[i]==strch2[i])
			      {
				      continue;
			      }
			      else
			      {
				      flag=0;
			      }
		      }
			if(flag=1)
			{
				System.out.println("Yes");
			}
			else
			{
				
				System.out.println("No");
			}	
		}
    } 
}
