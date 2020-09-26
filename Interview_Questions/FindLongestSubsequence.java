/*
Find the length of the longest subsequence in a given array A of integers such that all elements of the subsequence are sorted in strictly ascending order.
Input Format

The first line contains a single integer n.
Next line contains n space separated numbers denoting the elements of the array.
Constraints

0 < n< 105
0 < Ai < 105
Output Format

Print a single line containing a single integer denoting the length of the longest increasing subsequence.
Sample Input

6
50 3 10 7 40 80

Sample Output
4
*/
import java.util.Scanner;
class FindLongestSubsequence{
    public static int FLS(int[] seq){
        int min = seq[0];
        int count =0;
        int last=0;
        for(int i=0;i<seq.length;i++){
            int pointer = seq[i];
            if(min>pointer){
                min=pointer;
                last=pointer;
                count=1;
                continue;
            }
            if(pointer>last){
                count++;
                last = pointer;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int length = sc.nextInt();
        int sequence[] = new int[length];
        for(int i =0;i<length;i++){
           sequence[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(FLS(sequence));
    }
}