import java.util.Scanner;

public class PascalsTriangle {
   static int factorial(int n) {
      int f;

      for(f = 1; n > 1; n--){
         f *= n;
      }
      return f;
   }
   static int nCr(int n,int r) {
      return factorial(n) / ( factorial(n-r) * factorial(r) );
   }
   public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      System.out.println();
      int n, i, j;
      System.out.print("Enter a number for printing pascals triangle: ");
      n = scan.nextInt();

      for(i = 0; i <= n; i++) {
         for(j = 0; j <= n-i; j++){
            System.out.print(" ");
         }
         for(j = 0; j <= i; j++){
            System.out.print(" "+nCr(i, j));
         }
         System.out.println();
      }
   }
}