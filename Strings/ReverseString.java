
import java.util.*;
public class reversestring {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);	
	System.out.print("Enter the string:");
String s=sc.nextLine();
	
	String s1="";
	for(int i=s.length()-1;i>=0;i--)
	{
		char ch=s.charAt(i);
		while(i>=0&&s.charAt(i)==' ')
			i--;
		int j=i;
		if(i<0)
			break;
		while(i>=0&&s.charAt(i)!=' ')
			i--;
		if(s1.isEmpty()) {
			s1=s1.concat(s.substring(i+1,j+1));
		}
		else
			s1=s1.concat(" "+s.substring(i+1,j+1));
			}
	System.out.print("The reversed string is:");
	System.out.print(s1);

}}
