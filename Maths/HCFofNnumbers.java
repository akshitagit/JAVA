import java.io.*;
import java.util.Scanner;

class Hcf
{
public static void main(String arg[])	
{	
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("HCF of how many numbers? (numbers<=10) - ");
    int N=sc.nextInt();
    long  input[]=new long[N];
    System.out.println("Enter "+ N+" numbers");
    for(int i=0;i<N;i++)
    {
	input[i]=sc.nextLong();     
 
    }
     long result = input[0];
     for(int i = 1; i < input.length; i++)
     {
     result= hcf(result, input[i]);
     }     
     System.out.println("HCF="+result);
  }
}
static long hcf(long a,long b)
  {
    while (b > 0)
    {
        long temp = b;
        b = a % b; 
        a = temp;
    }
    return a;
   }
}