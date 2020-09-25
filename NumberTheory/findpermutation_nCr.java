public class findpermutation_nCr {
    static long compute(long kmax,long lim,long omin)
    {
        long prod=1;
        kmax++;
        for(long i=kmax;i<=lim;i++)
        prod*=i;
        //System.out.println(prod+" "+factorial(omin));
        return ((long)(prod/factorial(omin)));
    }
   static long factorial(long n) {
      long fact = 1;
      long i = 1;
      while(i <= n) {
         fact *= i;
         i++;
      }
      return fact;
   }
   public static void main(String args[]) {

      long n =100, x = 3, comb, per;
      long kmax=Math.max(x,n-x);
      long omin=Math.min(x,n-x);
      //System.out.println(kmax+" "+omin);
      System.out.println(compute(kmax,n,omin));
     
   }
}