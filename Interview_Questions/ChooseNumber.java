
public class ChooseNumber {

	public static void main(String[] args) {		
		int [] A = {1, 3, 4, 5, 6, 9};

		System.out.println("result: " + chooseNumbers(A));
	}

	public static String chooseNumbers(int [] A) {
		if (A.length < 3) return "NO";

		int index = getMinIndex(A);
		int minVal = A[index];

		index = getMaxIndex(A);
		int maxVal1 = A[index];
		A[index] = Integer.MIN_VALUE;

		index = getMaxIndex(A);
		int maxVal2 = A[index];
		return ((maxVal1 + maxVal2) >= minVal)? "YES" : "NO";
	}

	private static int getMinIndex(int[] a) {
		int minIndex = 0;
                for (int i = 0; i < a.length; i++) {
                        if (a[minIndex] > a[i]) {
                        	minIndex = i;
                        }
                }
                return minIndex;
	}

	private static int getMaxIndex(int[] a) {
		int maxIndex = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[maxIndex] < a[i]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}
}


