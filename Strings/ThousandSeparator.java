//   Given an integer n, add a dot (".") as the thousands separator
//   and return it in string format.
class ThousandSeparator {
    public String thousandSeparator(int n) {
        
        StringBuilder s = new StringBuilder();
        String ret = Integer.toString(n);
        
        int end = ret.length()-1;
        
        if((end+1)<=3)
            return ret;
        
        for(int i = 0;i<=end;i++) {
            
            
            if((end-i)%3==0 && i!=end) {
                s.append(ret.charAt(i));
                s.append(".");
            } else {
                s.append(ret.charAt(i));
            }
        }
        
        return s.toString();
    }
}
