/*
Problem Statement:

    Given a sorted array A of N distinct elements which is rotated at some point, and given an element K.
    The task is to find the index of the given element K in the array A.

    Input:
    There are three lines.
    First line contains an integer N denoting the size of the given array.
    Second line contains N space separated integers denoting the elements of the array A.
    Third line contains an integer K denoting the element to be searched for in the array.

    Output:
    The index of the concerned element in the array. If the element is not present, then output -1.

    Constraints:
    1 ≤ T ≤ 100
    1 ≤ N ≤ 10^7
    0 ≤ A[i] ≤ 10^8
    1 ≤ K ≤ 10^8

    Examples:

    Input 1:
    9
    5 6 7 8 9 10 1 2 3
    10
    Output 1:
    5

    Input 2:
    4
    3 5 1 2
    6
    Output 2:
    -1
*/


import java.util.Scanner;

//Implementation using Binary Search
class SearchInRotatedArray {

    // Returns index of key in arr[l..h] if key is present, otherwise returns -1
    static int search(int arr[], int l, int h, int key) {
        if (l > h)
            return -1;

        int mid = (l + h) / 2;
        if (arr[mid] == key)
            return mid;

        // Check if first subarray arr[l...mid] is sorted
        if (arr[l] <= arr[mid]) {

            //Key present in first subarray
            if (key >= arr[l] && key <= arr[mid])
                return search(arr, l, mid - 1, key);

            //Key present in second subarray
            return search(arr, mid + 1, h, key);
        }

        // If first subarray is not sorted, then the second subarray arr[mid... h] must be sorted

        //Key present in second subarray
        if (key >= arr[mid] && key <= arr[h])
            return search(arr, mid + 1, h, key);

        return search(arr, l, mid - 1, key);
    }

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        sc.close();

        System.out.println(search(arr, 0, n-1 , x));
    }

}
