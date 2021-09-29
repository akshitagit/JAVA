public class Main {
    public static int[] runningSum(int[] nums) {
        int[] sum=new int[nums.length];
        if(nums.length==0)
            return sum;
        sum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            sum[i]=sum[i-1]+nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums={1,4,6,3,8,4,2,9};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}