import java.util.*;

public class FlyodsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for printing Flyods Triangle:");
        int size = sc.nextInt();
        int num = 1;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num+++" ");
            }
            System.out.println();
        }

    }
}
