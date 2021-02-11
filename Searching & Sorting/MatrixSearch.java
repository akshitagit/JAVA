import java.util.Scanner;

/*
Problem Statement:
        Given an N x M matrix, where every row and column is sorted in increasing order, and a number x .
        Find if element x is present in the matrix or not.

        Input Format:

        First line consists of two space separated integers N and M, denoting the number of element in a
        row and column respectively. Second line of each test case consists of N*M space separated integers
        denoting the elements in the matrix in row major order. Third line of each test case contains a
        single integer x, the element to be searched.

        Constraints : 1 <= N,M <= 30 0 <= A[i] <= 100000

        Output Format

        Print 1 if the element is present in the matrix, else 0.

        Sample Input 1

        3 3
        3 30 38
        44 52 54
        57 60 69
        62

        Sample Output 1

        0

        Sample Input 2

        4 4
        10 20 30 40
        15 25 35 45
        27 29 37 48
        32 33 39 50
        39

        Sample Output 2

        1
*/

public class MatrixSearch {
    private static void search(int[][] mat, int n, int m, int x) {
        int i = 0, j = m-1; // set indexes for top right element

        while (i < n && j >= 0) {
            if (mat[i][j] == x) {
                System.out.print("1");
                return;
            }
            if (mat[i][j] > x)
                j--;
            else
                i++;
        }

        System.out.print("0");
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        sc.close();

        search(arr, n, m , x);
    }
}
