import java.util.Scanner;
public class ComputeXORfrom1ton{
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        if (n % 4 == 0) 
            System.out.println(n);
        if (n % 4 == 1)
            System.out.println(1);
        if (n % 4 == 2) 
            System.out.println(n+1);
        else
            System.out.println(0);
    }
}
    