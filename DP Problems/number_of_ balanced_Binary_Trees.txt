public class Balanced_BTs {
public static int balancedTreesOfHeightH(int height){
	     int MOD = 1000000007; 
		int[] dp = new int[height + 1]; 
     
   // base cases 
   dp[0] = 1; 
   dp[1] = 1; 
     
   for(int i = 2; i <= height; i++){  
       long x = (long)dp[i-1]*dp[i-1];
       long y = (long)dp[i-1]*dp[i-2]*2;
       x = x%MOD;
       y = y%MOD;
       dp[i] = (int)(x+y)%MOD;
	}
         
       return dp[height]; 

}
	
    public static void main(String[] args) {
    	int h=3;	
    	int ans= balancedTreesOfHeightH(h);
		System.out.println(ans);
	}
}
