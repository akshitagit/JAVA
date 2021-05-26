
import java.util.Scanner;
public class StringReverse {

public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	String temp=new String();
	  char s[]=str.toCharArray();
	  for(int i=0;i<s.length;i++)
	  {
	    temp+=s[s.length-1-i];
	  }
	  System.out.println(temp);
  sc.close();
}
}