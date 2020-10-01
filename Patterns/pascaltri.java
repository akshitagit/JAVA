import java.util.*;
class pascaltri
{
	static int factorial(int n)
	{
		int f=1;
		for(int i=1; i<=n; i++)
			f=f*i;
		return(f);
	}
	static int ncr(int x, int y)
	{
		return(factorial(x)/(factorial(x-y)*factorial(y)));
	}
	public static void main(String[] args)
	{
		int i,j,rows;
		Scanner sc=new Scanner(System.in);
		rows=sc.nextInt();
		for(i=0; i<rows; i++)
		{
			for(j = 0; j < rows-i; j++){
			System.out.print(" ");
		}
			for(j=0; j<=i; j++)
				System.out.print(ncr(i,j)+" ");
			System.out.println();
		}
	}
}