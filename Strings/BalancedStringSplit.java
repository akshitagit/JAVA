public class balancedStringSplit {

    /**
     * Given a balanced string s return the maximum amount of splitted balanced strings.
     * Ex : s = "RLRRLLRLRL"
     *      s can be split into "RL", "RRLL", "RL", "RL" so we return 4
     * To solve this we just count the number of R and L and when they are the same we increase the counter
     */

    public static int split(String s) {

        int countofL = 0;
        int countofR = 0;

        int count = 0;

        for(int i=0;i<s.length();i++) {

            char temp = s.charAt(i);

            if(temp=='L')
                countofL++;
            else
                countofR++;

            if(countofR==countofL) {
                count++;
            }
        }

        return count;
    }

    public static void main(String [] args) {
        String test = "RLRRRLLRLL";
        System.out.println(split(test));
    }
}

