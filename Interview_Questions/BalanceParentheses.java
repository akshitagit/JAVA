/*
https://github.com/akshitagit/JAVA/issues/46
You are given a string of brackets i.e. '{', '}' , '(' , ')', '[' , ']' .
You have to check whether the sequence of parenthesis is balanced or not.
For example, "(())", "(())()" are balanced and "())(", "(()))" are not.
Input Format

A string of '(' , ')' , '{' , '}' and '[' , ']' .
Constraints

1<=|S|<=10^5
Output Format

Print "Yes" if the brackets are balanced and "No" if not balanced.
Sample Input

(())

Sample Output

Yes
*/

public class BalanceParentheses {

    public static void balanceParentheses(String brackets) {

        // Characters
        String curlyOpen = "{";
        String curlyClose = "}";
        String bracketOpen = "[";
        String bracketClose = "]";
        String parenthesesOpen = "(";
        String parentheseClose = ")";

        String result = "";

        // @TODO - determine if brackets is balanced

		System.out.println("result: " + result);
    }

	public static void main(String[] args) {
	    balanceParentheses("(())");             // Yes
        balanceParentheses("(())");             // Yes
        balanceParentheses("(())()");           // Yes
        balanceParentheses("())(");             // No
        balanceParentheses("(()))");            // No
        balanceParentheses("[()]{}{[()()]()}"); // Yes
        balanceParentheses("{[(])");            // No

	}

}