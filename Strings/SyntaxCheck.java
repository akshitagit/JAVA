import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class SyntaxCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        scan.nextLine(); 
        while (testCases-- > 0) {
           String pattern = scan.nextLine();
           try {
               Pattern.compile(pattern);
               System.out.println("Valid");
           } catch (PatternSyntaxException exception) {
               System.out.println("Invalid");
           }
        }
        scan.close();
    }
}
