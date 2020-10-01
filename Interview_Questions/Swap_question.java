*/A question frequently asked in interview*/
  package testing;
import java.util.Scanner;
/**
 * Java program to check if the number is palindrome or not.
 * A number is called palindrome if the number and its reverse is equal
 * This Java program can also be used to reverse a number in Java
 */
public class NoClassDefFoundErrorDueToStaticInitFailure {

    public static void main(String args[]){
       
        System.out.println("Please Enter a number : ");
        int palindrome = new Scanner(System.in).nextInt();
       
        if(isPalindrome(palindrome)){
            System.out.println("Number : " + palindrome + " is a palindrome");
        }else{
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }      
       
    }
 
    /*
     * Java method to check if a number is palindrome or not
     */
    public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;
    }

}

Output:
Please Enter a number :
123
Number : 123 is not a palindrome
Please Enter a number :
121
Number : 123 is a palindrome
1
