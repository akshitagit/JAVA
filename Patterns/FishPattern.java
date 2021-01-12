
/*
This code prints the Fish Pattern,

Enter any number to generate Fish Pattern.


*/
import java.util.Scanner;

public class FishPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for printing Fish Pattern:");
        int size = sc.nextInt();

        for (int i = 1; i <= size; i++) {
            if (i == size)
                break;
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= size - i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= 2 * (size - i) + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
