import java.util.Scanner;

public class HourGlassPattern {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println();
        int n, i, j;
        System.out.print("Enter a number: ");
        n = scan.nextInt();
        
        for(i=0; i<=n; i++){
            for(j=0; j<i;j++){
                System.out.print(" ");
                if(j>=1)
                System.out.print(" ");
            }
            for(j=n-i;j>=0;j--){
                System.out.print(j+" ");
            }
            for(j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
        for(i=n-1; i>=0; i--){
            for(j=0; j<i;j++){
                System.out.print(" ");
                if(j>=1)
                System.out.print(" ");
            }
            for(j=n-i;j>=0;j--){
                System.out.print(j+" ");
            }
            for(j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }

     }
}
