package Java.Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = { 5, 2, 4, 6, 1, 3 };
        int start = 0;
        int lenn = nums.length;
        mergeSort(nums, start, lenn - 1);
        for (int i = 0; i < nums.length; i++)
            System.out.println(nums[i]);
    }

    public static void mergeSort(int[] nums, int start, int end) {
        if (start < end) {
            int mid = (end + (start - 1)) / 2;
            mergeSort(nums, start, mid);
            mergeSort(nums, mid + 1, end);
            merge(nums, start, mid, end);
        }
    }

    public static void merge(int[] nums, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++)
            left[i] = nums[start + i];
        for (int j = 0; j < n2; j++)
            right[j] = nums[mid + j + 1];

        int i = 0, j = 0, k = start;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                nums[k] = left[i];
                i++;
            } else {
                nums[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            nums[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            nums[k] = right[j];
            j++;
            k++;
        }
    }
}