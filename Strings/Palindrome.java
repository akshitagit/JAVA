package Strings;

import java.lang.String;
import java.io.*;
import java.util.*;

class Palindrome {
    public static void main(String args[]) {
        String inputString;
        Scanner in = new Scanner(System.in);

        System.out.println("Input a string");
        inputString = in.nextLine();

        for (int i=0,j=inputString.length()-1;i<=j;i++,j--) {
            if(inputString.charAt(i)!=inputString.charAt(j)) {
                System.out.println("It is not palindrome");
                return;
            }
        }
        System.out.println("It is palindrome");

    }
}