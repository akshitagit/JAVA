
public class NumOfFactors {

	
	public static void main(String[] args) {
			
			long number=10;
			int factors=getNumOfFactors(number);
			
			System.out.println(String.format("Total factors of %d are: %d",number,factors));
	}
	
	private static int getNumOfFactors(long num) {
		
		int totalFactors=1;//accounts for the number itself
		int increment=1;
		if(num%2==1) {//if number is odd, it can never have an even factor
			increment=2;
		}
		
		for(long numFac=1; numFac<num ; numFac+=increment) {
			if(num%numFac==0) {
				totalFactors+=1;
			}
		}
		return totalFactors;
	}
}
