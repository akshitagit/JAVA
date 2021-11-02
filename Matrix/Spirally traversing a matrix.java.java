// { Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
         ArrayList<Integer> al = new ArrayList<>();
         int t =0 ;
         int R=c;
         int b=r;
         int l=0;
         while(t<=b&&l<=r){
             for(int i=l;i<R;i++){
                 al.add(matrix[t][i]);
             }
             t++;
             
              for(int i=t;i<b;i++){
                 al.add(matrix[i][R-1]);
             }
             R--;
             if(t<=b){
              for(int i=R-1;i>=l;i--){
                 al.add(matrix[b-1][i]);
             }
             b--;
             }
             if(l <= R){
              for(int i=b-1;i>=t;i--){
                 al.add(matrix[i][l]);
             }
             l++;  
             }
         }
         return al;
             
         }
    
}