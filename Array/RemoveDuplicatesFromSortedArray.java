package ArrayProblems;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int j = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums [j] != nums [i]){
                nums[++j] = nums[i];
            }

        }
        System.out.println(j+1); //return j+1
    }
}
