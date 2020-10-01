import java.util.*;
class fibonacii
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		String str=sc.nextLine();
		String  st[]=str.split(" ");
		int max=0, hcf=1,c=1;
		int a[]=new int[st.length];
		for(int i=0;i<a.length;i++)
			a[i]=Integer.parseInt(st[i]);
		for(int i=0;i<a.length;i++)
			{
				if(a[i]>max)
					max=a[i];
			}
		for(int i=1;i<=max;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[j]%i==0)
					 c=1;
				else
				{
					c=0;
					break;
				}
			}
			if(c==1)
				hcf=i;
		}
		System.out.println(hcf);

	}
}