public class PowerOfTwo {
    static boolean PowerOfTwo(int n){
        if (n<=0)
            return false;
        //Fact : If the integer is Power of two, It'll have only one st bit
        return ((n&(n-1))==0); //unset the right most set bit
    }
    // Driver function
    public static void main(String[] args) {
        int n =11;
        System.out.println(PowerOfTwo(n));
    }
}