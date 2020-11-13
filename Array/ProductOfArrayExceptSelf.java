package hacktober;

import java.util.Scanner;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of element to be in array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements to the array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		arr = getProduct(arr);
        System.out.println("**************");
        for(int i: arr){
               System.out.println(i);
        }

	}
	
	static int[] getProduct(int[] input){
	       int N = input.length;
	       int[] prod = new int[N];
	       int product = 1;
	       prod[0] = product;
	       for(int i=1; i<N ; i++){
	              product *= input[i-1];
	              prod[i] = product;
	        }

	       product = 1;
	       for(int i=N-2;i>=0;i--){
	              product *= input[i+1];
	              prod[i] *= product;
	       }
	       return prod;
	    }

}
