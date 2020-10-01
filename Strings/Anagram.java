import java.util.*; 
public class Anagram 
{ 
    public boolean checkAnagram(String stringOne , String stringTwo){
        char[] first = stringOne.toLowerCase().toCharArray(); 
        char[] second = stringTwo.toLowerCase().toCharArray();
        // if length of strings is not same 
        if (first.length != second.length)
            return false;
        int[] counts = new int[26]; 
        for (int i = 0; i < first.length; i++){
            counts[first[i]-97]++;  
            counts[second[i]-97]--;   
        }
        for (int i = 0; i<26; i++)
            if (counts[i] != 0)
                return false;
        return true;
    }
    
    public static void main(String args[]) 
    { 
        Scanner input=new Scanner(System.in); 

        System.out.print("Enter first String: ");
        String str1 = input.nextLine();
        System.out.print("Enter second String: ");
        String str2 = input.nextLine();

      if(checkAnagram(str1,str2))
        System.out.println(str1 + " and " + str2 + " are anagram.); 
      else
        System.out.println(str1 + " and " + str2 + " are not anagram.);
    } 
} 
