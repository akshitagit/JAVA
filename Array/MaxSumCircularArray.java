package hacktober;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSumCircularArray {

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

		System.out.println(maxSumCircular(arr));
	}
		private static int maxSumCircular(int[] A) {
			// TODO Auto-generated method stub
			int curMax = 0;
			int max = Integer.MIN_VALUE;
			int curMin = 0;
			int min = Integer.MAX_VALUE;
			int sum = 0;
			for (int i : A) {
				sum += i;
				curMin = Math.min(curMin + i, i);
				min = Math.min(curMin, min);
				curMax = Math.max(curMax + i, i);
				max = Math.max(curMax, max);
			}
			if (sum == min) {
				return max;
			}
			return Math.max(max, sum - min);
	
		}

}