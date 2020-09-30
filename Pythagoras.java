public class Pythagoras {
   public static void main(String[] args) {
      double a = Double.parseDouble(args[0]);
      double b = Double.parseDouble(args[1]);
      double result = 0.0;

      if (Math.abs(a) > Math.abs(b)) {
         result = b / a;
         result = Math.abs(a) * Math.sqrt(1 + result*result);
      }
      else if (b != 0) {
         result = a / b;
         result = Math.abs(b) * Math.sqrt(1 + result*result);
      }

     System.out.print("result is "+result);
   }

}
