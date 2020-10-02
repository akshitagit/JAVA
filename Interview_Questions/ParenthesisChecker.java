
/*Given an expression string exp. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
For example, the program should print 'balanced' for exp = “[()]{}{[()()]()}” and 'not balanced' for exp = “[(])”

Input:
The first line of input contains an integer T denoting the number of test cases.  Each test case consists of a string of expression, in a separate line.

Output:
Print 'balanced' without quotes if the pair of parenthesis is balanced else print 'not balanced' in a separate line.

Constraints:
1 ≤ T ≤ 100
1 ≤ |s| ≤ 105

Example:
Input:
3
{([])}
()
([]

Output:
balanced
balanced
not balanced*/

import java.util.*;
import java.io.*;

class ParenthesisChecker {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  sc.nextLine();
	  while(n-->0)
	  {
	      boolean flag=true;
	      String str=sc.nextLine();
	      Stack<Character> stk=new Stack<>();
	      for(int i=0;i<str.length();i++)
	      {
	          if(str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='[')
	          {
	              stk.push(str.charAt(i));
	          }
	          else if(stk.empty()&&(str.charAt(i)==')'||str.charAt(i)=='}'||str.charAt(i)==']'))
	          {
	              flag=false;
	              break;
	          }
	          else if(!stk.empty()&&str.charAt(i)==')')
	          {
	              if(stk.peek()=='(')
	              stk.pop();
	              else
	              {
	                  flag=false;
	                  break; 
	              }
	          }
	          else if(!stk.empty()&&str.charAt(i)==']')
	          {
	              if(stk.peek()=='[')
	              stk.pop();
	              else
	              {
	                  flag=false;
	                  break; 
	              }
	          }
	          else if(!stk.empty()&&str.charAt(i)=='}')
	          {
	              if(stk.peek()=='{')
	              stk.pop();
	              else
	              {
	                  flag=false;
	                  break; 
	              }
	          }
	      }
	      if(flag==true&&stk.empty())
	      {
	          System.out.println("balanced");
	      }
	      else
	      {
	        System.out.println("not balanced");   
	      }
	  }
	  
	}
}