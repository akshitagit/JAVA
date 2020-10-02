
/*Spirally traversing a matrix
Traversing an array is an elementary operation on an array, in which each element will be processed 
for some operation. Printing elements is one example operation.

So, complete the below function, which given a two dimensional array, print the array 
in spiral form rotating clockwise.



Input Format

Each test-case will begin with two number m and n where m = no. of rows and
 n = no. of columns. m rows will follow with n integers in each row separated
  by a space. Constraint : 1<=m<=50 and 1<=n<=50.

Output Format

For each test case, print the elements of 2-d array in spiral form starting
 from index (0,0) or upper-left corner in clockwise direction.*/
import java.util.*;
public class SpiralMatrix
{
  public static void main(String[] args)
  {
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
int c=sc.nextInt();
 int arr[][]=new int[r][c];
 for(int i=0;i<r;i++)
 {
	 for(int j=0;j<c;j++)
	 {
		 arr[i][j]=sc.nextInt();
	 }
 }
    int r1=0,c1=0;
    while(r1<r&&c1<c)
    {
      for(int i=c1;i<c;i++)
      {
        System.out.println(arr[r1][i]);
      }
     r1++;
      for(int i=r1;i<r;i++)
      {
        System.out.println(arr[i][c-1]);
      }
      c--;
      if(r1<r)
      {
        for(int i=c-1;i>=c1;i--)
        {
          System.out.println(arr[r-1][i]);
        }
        r--;
      }
      if(c1<c)
      {
        for(int i=r-1;i>=r1;i--)
        {
          System.out.println(arr[i][c1]);
        }
        c1++;
      }
    }
  }
}
