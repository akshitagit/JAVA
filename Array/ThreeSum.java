/**
* The ThreeSum program implements an application that -
* Given an array of integers nums and an integer target, return indices of the three numbers such that they add up to target.
*
* @author  Tirtharaj Ghosh
* @version 1.0
* @since   2020-10-23
*/

import java.util.*;

class ThreeSum {

    public static List<List<Integer>> findThreeSum(int[] nums, int target){
        List<List<Integer> > res = new ArrayList<List<Integer> >();
        for(int i = 0; i<nums.length; i++){
            // System.out.println("Entry");
            HashSet<Integer> s = new HashSet<Integer>(); 
            int curr_sum = target - nums[i]; 
            for (int j = i + 1; j < nums.length; j++) { 
                if (s.contains(curr_sum - nums[j])) {  
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]); 
                    temp.add(nums[j]); 
                    temp.add(curr_sum - nums[j]); 
                    res.add(temp);
                } 
                s.add(nums[j]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { -1,0,1,2,-1,-4 };
        int target = 0;
        System.out.println(findThreeSum(nums, target));
    }
}
