package Array;

import java.util.Scanner;
import java.util.Stack;

public class TrapRainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter each array element, separated by whitespace.");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        printArray(arr);

        // Dynamic Programming Approach
        System.out.println(trapDP(arr));
        // Stack Based Approach
        System.out.println(trapStack(arr));
        // Two Pointer Approach
        System.out.println(trapTwoPointer(arr));
    }

    private static void printArray(int[] arr){
        System.out.println("=========== Input Array ==========");
        for(int i : arr) System.out.print(i + " ");
        System.out.println("\n=================================");
    }

    /**
     * Dynamic Programming Approach to Solving Problem
     * Time Complexity: O(3n) = O(n)
     * Space Complexity = O(2n) = O(n)
     */
    private static int trapDP(int[] height) {
        if (height == null) {
            return 0;
        }

        int result = 0;
        int n = height.length;

        // Keep track of "max element so far at index" reading from the left and right, respectively.
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Base cases
        leftMax[0] = height[0];
        rightMax[n-1] = height[n-1];

        // Fill arrays
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        for (int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // At any given point, what limits rain water trapped is the smallest of the left wall and right wall,
        // hence we compute the min and subtract the current height.
        // n.b. Think about edge cases here - what happens if we have a peak at a given point?
        for (int i = 1; i < n - 1; i++) {
            result += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return result;
    }

    /**
     * Stack Approach to Solving Problem
     * Time Complexity: O(2n) = O(n)
     * Space Complexity = O(n)
     */
    private static int trapStack(int[] height) {
        int result = 0;
        int i = 0;
        Stack<Integer> boundingWalls = new Stack<>();

        // Iterate through array
        while (i < height.length) {
            // Find bounding wall
            while (!boundingWalls.isEmpty() && height[i] > height[boundingWalls.peek()]) {
                int top = boundingWalls.pop();
                if (boundingWalls.empty())
                    break;

                // Compute distance and height to bounded wall and thus rain water trapped.
                int distance = i - boundingWalls.peek() - 1;
                int boundedHeight = Math.min(height[i], height[boundingWalls.peek()]) - height[top];
                result += distance * boundedHeight;
            }
            boundingWalls.push(i++);
        }
        return result;
    }

    /**
     * Two Pointer approach to Solving Problem
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    private static int trapTwoPointer(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int ans = 0;
        int leftMax = 0, rightMax = 0;

        // Shrink pointers together
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    ans += leftMax - height[left];
                }
                ++left;
            }
            else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    ans += rightMax - height[right];
                }
                --right;
            }
        }
        return ans;
    }


}

