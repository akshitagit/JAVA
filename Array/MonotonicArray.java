public class MonotonicArray {

    /**
     * An array is monotonic if it is either monotone increasing or monotone decreasing.
     */
    public static boolean isMonotonic(int[] A) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        for(int i = 1; i<A.length; i++){
            if(A[i-1]>A[i]){
                isIncreasing = false;
            }
            
            if(A[i-1]<A[i]){
                isDecreasing = false;
            }
        }
        return isIncreasing || isDecreasing;
    }
    public static void main(String[] args) {
        int[] A = new int[]{8,6,5,4,4};
        System.out.println(isMonotonic(A));
    }
}
