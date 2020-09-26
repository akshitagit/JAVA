import java.util.Scanner;

public class PascalsTriangle{     
     public static void main (String args[]){       
         System.out.println("Please! Enter a Number");
         Scanner numberInput = new Scanner(System.in);
         int number = numberInput.nextInt();
         int spaces = number;
         int numberNew = 1;

         if (number <= 10){
            for(int i=0; i < number; i++){
               for(int s=1 ; s<=spaces; s++){
                  System.out.print(" ");
               }

               numberNew = 1;
               for(int j=0 ; j <= i ; j++){
                  System.out.print(numberNew + " ");
                  numberNew = numberNew * (i-j)/(j+1);
               }
               spaces--;
               System.out.println();
            }
         }
         else{
            System.out.println("Please, Enter a Valid No., Less than or Equal to 10");
         }
     }

}