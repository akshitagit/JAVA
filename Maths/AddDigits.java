/**
*   Given a non-negative integer num, repeatedly add all its digits until 
*   the result has only one digit.
**/
class AddDigits {
    public int addDigits(int num) {
        
        int ret = num;
        while(num/10!=0) {
            
            int digitSum = 0;
            while(num!=0) {
                digitSum += num%10;
                num/=10;
            }
            num = digitSum;
            ret = num;
        }
        return ret;
    }
}
