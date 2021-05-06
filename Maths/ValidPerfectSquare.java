/**
*   Given a positive integer num, write a function which returns True if num is a perfect 
*   square else False.
**/
class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        
        long start = 1;
        long end = num;
        long mid = 0;
        
        while(start<=end) {
            mid = start + (end-start)/2;
            if((int)mid*mid == num)
                return true;
            if(mid*mid<num)
                start = mid+1;
            else if(mid*mid>num)
                end = mid -1; 
        }
        return false;
    }
}
