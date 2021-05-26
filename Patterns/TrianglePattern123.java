import java.util.Scanner;

public class Pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=0;
		if(sc.hasNext()) {
		n = sc.nextInt();
		}
		
		int nsp=n-1;
		int nst=1;
		int val;
		
		int row=1;
		while(row<=n) {
			//			spaces
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print("\t");
			}
			
//			stars
			val=row;
			for(int cst = 1;cst<=nst;cst++) {
				System.out.print(val +"\t");
//				work
				if(cst<=nst/2) {
					val++;
				}else {
					val--;
				}
			}
			
//			prep
			System.out.println();
			nsp--;
			nst+=2;			
			row++;
		}
	}

}
