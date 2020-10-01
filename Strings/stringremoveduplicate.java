import java.util.*;
class stringremoveduplicate
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();str=str+" ";
		String st="";int i;
		for(i=0;i<str.length()-1;i++)  
			{
			if(str.charAt(i)!=str.charAt(i+1))
					st=st+str.charAt(i);
			}
		System.out.println(st);
	}
}