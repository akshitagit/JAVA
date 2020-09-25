import java.util.*;
class HCF {
	int hcf(int a,int b){
		if(a == 0){
			return b;
		}
		return hcf(b%a, a);	
	}

	int findHCF(int arr[], int n){
		int result = 0;
		for(int i = 0; i < arr.length; i++){
			result = hcf(result, arr[i]);
			if (result == 1){
			return 1;
			}
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		HCF hcf = new HCF();
		int n = inp.nextInt();
		int[] arr = new int[n];
		int value ;
		for(int i = 0;i< n;i++){
			arr[i] = inp.nextInt();
		}

		System.out.print(hcf.findHCF(arr, n));
	}
}
