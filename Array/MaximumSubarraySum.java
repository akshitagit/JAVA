package p1;

import java.util.*;
public class MaximumSubarraySum {
    //code to find the maximum sum of a subarray in an array using the kadane's algorithm

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("enter the elements of the array");
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();

        System.out.println("subarray with maximum sum: "+ kadane(arr));
    }

    public static int kadane(int arr[]){
        if(arr==null)
            return 0;

        int sum=0;
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max=Math.max(max,sum);
            if(sum<0)
                sum=0;
        }

        return max;
    }
}

