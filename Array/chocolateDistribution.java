import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * This is from a array based problem in GeeksForGeeks.
 *
 * Given an array A of positive integers of size N, where each value represents number of chocolates in a packet.
 * Each packet can have variable number of chocolates. There are M students, the task is to distribute chocolate packets such that :
 * 1. Each student gets one packet.
 * 2. The difference between the number of chocolates given to the students having packet with maximum chocolates and student having packet with minimum chocolates is minimum.
 *
 * @author Jetty53
 */

class chocolateDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int m = sc.nextInt();
        int res = minDiff(arr, m);
        System.out.println(res);

    }

    static int minDiff(int[] arr, int m) {
        int min = arr[m - 1] - arr[0];
        int i = 1, j = m;
        while (j <= arr.length - 1) {

            if ((arr[j] - arr[i]) < min) {
                min = arr[j] - arr[i];
            }
            i++;
            j++;
        }
        return min;
    }
}
