import java.util.*;
class stringcompression
{
	public static void  main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch;int c=0;
		for(ch='a';ch<='z';ch++)
		{
			c=0;
			for(int i=0;i<str.length();i++)
			{
				if(ch==str.charAt(i))
					c++;
			}
			if(c!=0)
			System.out.print(ch+""+c);
		}
	}
}