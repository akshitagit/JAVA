import java.util.*;
import java.io.*;
 
class string_rotation 
{
         
    // method that rotates s towards left by d 
    static String leftrotate(String str, int d)
    {
            String ans = str.substring(d) + str.substring(0, d);
            return ans;
    }
 
    // method that rotates s towards right by d 
    static String rightrotate(String str, int d)
    {
            return leftrotate(str, str.length() - d);
    }
 
 
    public static void main(String args[])
    {
            String str1 = "HelloWorld"; 
            System.out.println(leftrotate(str1, 1));
 
            String str2 = "JavaIsLob"; 
            System.out.println(rightrotate(str2, 1)); 
    }
}
