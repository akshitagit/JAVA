/**
* Given an integer n, return true if it is a power of three. Otherwise, return false.
**/
class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        
        if(n<1)
            return false;
        
        while(n%3==0) {
            n/=3;
        }
        
        return n==1;
        
    }
}
