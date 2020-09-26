import java.util.Scanner;

public class TrianglePattern {
    
    static void Printpattern(int n)
    {
        int i,j,k;
        
        for(i = 1; i <= n; i++)
        {
            for(j = 0; j <= n-i; j++)
                System.out.print("  ");
            
            for(j = i,k = 0;k <= (2*i-1)/2; j++, k++)
                System.out.print(j+" ");
            
            j-=2;
            
            while(j >= i)
            {
                
                System.out.print(j+" ");
                j--;
            }
                
            System.out.println();
        }
        
    }
    
    public static void main(String args[]) {
      
      System.out.println("Enter number of rows for printing triangle pattern");
      Scanner sc=new Scanner(System.in);
      int rows=sc.nextInt();
      
      Printpattern(rows);
    }
}