/**
* The TwoSum program implements an application that -
* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
*
* @author  Tirtharaj Ghosh
* @version 1.0
* @since   2020-10-22
*/

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

class TwoSum {
    
    /**
     * findTwoSum method - using One-pass Hash Table.
     * @see https://leetcode.com/problems/two-sum/ <br>
     * Time complexity: O(n) <br>
     * Space complexity: O(n)
     * @param nums The nums array.
     * @param target The target value
     * @return int[] This returns indices of the two numbers
     */
    private static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};
    }

    /**
     * This is the main method which drives the program.
     * @param args Unused.
     * @return void.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        sc.close();

        int[] indices = findTwoSum(nums, target);

        if (indices.length == 2) {
            System.out.println(indices[0] + " , " + indices[1]);
        } else {
            System.out.println("No solution found!");
        }
    }
}
