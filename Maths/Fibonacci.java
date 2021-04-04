
// Print the Fibonacci series for n=20
import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any positive number:");
        int n=sc.nextInt();

        int t1 = 0, t2 = 1;
        
        while (t1 <= n) {
            System.out.print(t1 + "   ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
