package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate_an_array_to_the_left_by_3_position {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of element to be in array");
		int n = 0;
		do {
			 n = sc.nextInt();
			 if(n < 3) {
				 System.out.println("Please enter number of element to be greater than 3");
				 
			 }
		}while(n<3);
		
		int[] arr = new int[n];
		System.out.println("Enter elements to the array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		rotateby3(arr,3);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void rotateby3(int[] arr, int k) {
		int n = arr.length;
		rotate(arr,0,k-1);
		rotate(arr,k,n-1);
		rotate(arr,0,n-1);
		
	}
	
	public static void rotate(int[] arr, int start, int end) {
		while(start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
