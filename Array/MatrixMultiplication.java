
import java.util.Scanner;
//Other imports go here, Do NOT change the class name
class MatrixMultiplication
{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 int x=sc.nextInt();
 while(x>0)
 {
   int r1,c1,r2,c2,i,j;
   r1=sc.nextInt();
   c1=sc.nextInt();
   int arr[][]=new int[r1][c1];
   
   for(i=0;i<r1;i++)
   {
     for(j=0;j<c1;j++)
     {
       arr[i][j]=sc.nextInt();
     }
   }
   r2=sc.nextInt();
   c2=sc.nextInt();
   int b[][]=new int[r2][c2];
   int res[][]=new int[r1][c2];
   for(i=0;i<r2;i++)
   {
     for(j=0;j<c2;j++)
     {
       b[i][j]=sc.nextInt();
     }
   }
   
   for(i=0;i<r1;i++)
   {
     for(j=0;j<c2;j++)
     {
       int sum=0;
       for(int k=0;k<r2;k++)
       {
         sum+=arr[i][k]*b[k][j];
       }
       res[i][j]=sum;
     }
   }
   for(int r=0;r<r1;r++)
   {
     for(int y=0;y<c2;y++)
       System.out.print(res[r][y]+" ");
     System.out.println();
   }
   x--;
 }
 sc.close();
}
}