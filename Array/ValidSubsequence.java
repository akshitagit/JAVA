/**
* The ValidSubsequence program implements an application that -
* Given two strings ( s and t ), return boolean result of if s is subsequence of t.
*
* @author  Tirtharaj Ghosh
* @version 1.0
* @since   2020-10-23
*/

class ValidSubsequence {

    /**
     * isSubsequence method - Brute-force method
     * Time complexity: O(n)
     * Space complexity: O(1)
     * @param s
     * @param t
     * @return
     */
    public static boolean isSubsequence(String s, String t) {
        int pos = -1;
        for(int i=0; i<s.length(); i++){
            pos = t.indexOf(s.charAt(i), pos+1);
            if(pos == -1){
                return false;
            }
        }
        return true;
    }

    /**
     * This is the main method which drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        boolean res = isSubsequence(s,t);
        System.out.println(res);
    }
}
