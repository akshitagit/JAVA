import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public static void main(String[] args) {
		long number=45;
		String factors=split2PrimeFactors(number);
		
		System.out.println(String.format("Prime factors rep. of %d are: %s",number,factors));
	}
	
	private static String split2PrimeFactors(long num) {
		
		String splitNum="";//String representation of number
		List<Integer> multiples=new ArrayList<Integer>();//List representation
		int primeFactor=2;
		
		while(num!=1) {
			if(num%primeFactor==0) {
				
				if(splitNum.length()==0)
					splitNum=String.valueOf(primeFactor);
				else
					splitNum+="*"+String.valueOf(primeFactor);
				
				multiples.add(primeFactor);
				num/=primeFactor;
			}else {
				primeFactor=getNextPrime(primeFactor);
			}
		}

		return splitNum;
	}
	
	private static int getNextPrime(int factor) {
		int temp=factor+1;
		while(!isPrime(temp)) {
			temp+=1;
		}
		return temp;
	}
	
	private static boolean isPrime(int num) {
		
		if(num==2||num==3) {
			return true;
		}
		
		int increment=1;
		if(num%2==1) {//if number is odd, it can never have an even factor
			increment=2;
		}
		double srt=Math.sqrt(num);
		
		for(int i=2;i<srt;i+=increment) {
			if(num%i==0)
				return false;
		}
		
		return true;
	}
}
