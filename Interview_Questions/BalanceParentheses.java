import java.util.ArrayList;

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

    // Characters
    static char curlyOpen = '{';
    static char curlyClose = '}';
    static char bracketOpen = '[';
    static char bracketClose = ']';
    static char parenthesesOpen = '(';
    static char parenthesesClose = ')';

    public static void balanceParentheses(String brackets) {

        String result = "";
        String balanceString = "";

        for (int i = 0; i <= brackets.length()-1; i++) {
            // if bracket is an open character, add it to the balanceList
            char c = brackets.charAt(i);
            if (isOpen(c)) {
                balanceString += c;
            }

            //if a char is a close character and it is match for the last character in the balanceList, pop the open character.

            //else result = "No"
        }

        //if balanceList is empty, result = "Yes";

        // else, result = "No";

		System.out.println("result: " + result);
    }

    public static Boolean isOpen(char c) {
        if (c == curlyOpen || c == bracketOpen || c == parenthesesOpen) {
            return true;
        }
        else {
            return false;
        }
    }

    public static String yes() {
        return "Yes";
    }

    public static String no() {
        return "No";
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