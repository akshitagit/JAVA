/*
This code prints Pyramid Pattern,

Enter any number to generate Pattern.


*/

import java.util.*;

public class PyramidPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for printing Pyramid Pattern:");
        int size = sc.nextInt();
        for (int i = 1; i <= size - 1; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        sc.close();
    }
}
