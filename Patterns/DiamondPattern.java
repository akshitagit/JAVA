import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for printing Diamond Pattern:");
        int size = sc.nextInt();
        
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <=  2*(size - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int i = 1; i <= size - 1; i++) {
            for (int j = 1; j <= 2*i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*(size - i) - 1; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

}
}
