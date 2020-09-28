
// Print the Fibonacci series for n=20

public class Fibonacci {

    public static void main(String[] args) {

        int n = 20, t1 = 0, t2 = 1;
        
        while (t1 <= n) {
            System.out.print(t1 + "   ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
