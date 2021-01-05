// Java Program to compute sum of ranges for different range 
// queries. 
import java.util.*; 
   
// Class to represent a query range  
class Query{  
    int L;  
    int R;  
    Query(int L, int R){ 
        this.L = L; 
        this.R = R; 
    } 
}  
  
class GFG 
{ 
    // Prints sum of all query ranges. m is number of queries 
    // n is the size of the array. 
    static void printQuerySums(int a[], int n, ArrayList<Query> q, int m) 
    { 
        // One by one compute sum of all queries 
        for (int i=0; i<m; i++) 
        { 
            // Left and right boundaries of current range 
            int L = q.get(i).L, R = q.get(i).R; 
      
            // Compute sum of current query range 
            int sum = 0; 
            for (int j=L; j<=R; j++) 
                sum += a[j]; 
      
            // Print sum of current query range 
            System.out.println("Sum of [" + L + 
                           ", " + R + "] is "  + sum); 
        } 
    } 
      
    // Driver program 
    public static void main(String argv[]) 
    { 
        int a[] = {1, 1, 2, 1, 3, 4, 5, 2, 8}; 
        int n = a.length; 
          
        ArrayList<Query> q = new ArrayList<Query>(); 
        q.add(new Query(0,4)); 
        q.add(new Query(1,3)); 
        q.add(new Query(2,4)); 
          
        int m = q.size(); 
        printQuerySums(a, n, q, m); 
    } 
} 