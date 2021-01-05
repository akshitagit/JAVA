class LemonadeChange {
    
    /**
    *   You have a lemonade stand where each lemonade costs 5 dollars, customers come with 5,10,20 dollars bills
    *   Return true if and only if you can provide every customer with correct change. 
    *   Ex : [5,5,5,10,20] should return true
    **/
    
    public boolean lemonadeChange(int[] bills) {
        int fiveBills = 0;
        int tenBills = 0;
        
        int lemonadePrice = 5;
        
        for(int i:bills) {
            
            if(i==lemonadePrice) {
                fiveBills++;
            } else if (i-lemonadePrice==5 && fiveBills>0) {
                fiveBills--;
                tenBills++;
            } else if (i-lemonadePrice==15 && fiveBills>0 && tenBills>0) {
                fiveBills--;
                tenBills--;
            } else if (i-lemonadePrice==15 && fiveBills>=3){
                fiveBills-=3;
            } else {
                return false;
            }         
        }
        return true;
    }
}
