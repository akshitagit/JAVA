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
    final static char curlyOpen = '{';
    final static char curlyClose = '}';
    final static char bracketOpen = '[';
    final static char bracketClose = ']';
    final static char parenthesesOpen = '(';
    final static char parenthesesClose = ')';

    public static void balanceParentheses(String brackets) {

        String result = "";
        ArrayList<String> balanceList = new ArrayList<String>();

        for (int i = 0; i <= lastIndexOf(brackets.length()); i++) {

            char c = brackets.charAt(i);
            if (isOpen(c)) { // if c is an open character, add it to the balanceList
                balanceList.add(String.valueOf(c));
            } else { // if c is a closed character and a match for the last character in balanceList, remove it
                if (isBalanced(balanceList, c)) {
                    int last = lastIndexOf(balanceList.size());
                    balanceList.remove(last);
                } else { // irrevocably unbalanced, c is a close character without a preceding open character
                    balanceList.add(String.valueOf(c));
                }
            }
        }

        if (balanceList.isEmpty()) {
            result = yes();
        } else {
            result = no();
        }

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

    public static Boolean isBalanced(ArrayList<String> balanceList, char c) {

        int last = lastIndexOf(balanceList.size());
        if (last >= 0) {
            String endOfBalanceList = balanceList.get(last);

            String match = String.valueOf(matchOf(c));

            if (endOfBalanceList.compareTo(match) == 0) {
                return true;
            }
        }

        return false;

    }

    public static char matchOf(char c) {
        switch(c) {
            case curlyClose:
                return curlyOpen;
            case bracketClose:
                return bracketOpen;
            case parenthesesClose:
                return parenthesesOpen;
            default:
                return c;
        }
    }

    public static int lastIndexOf(int size) {
        return size-1;
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