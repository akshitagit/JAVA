import java.io.*; 
import java.util.*; 
  
class segmentTreeMinimumRange  
{ 
  
    static void construct_segment_tree(int[] segtree,  
                                        int[] a, int n) 
    { 
           
        for (int i = 0; i < n; i++) 
            segtree[n + i] = a[i]; 
        for (int i = n - 1; i >= 1; i--) 
            segtree[i] = Math.min(segtree[2 * i], segtree[2 * i + 1]); 
    } 
  
    static void update(int[] segtree, int pos, int value, int n) 
    { 
        pos += n; 
        segtree[pos] = value; 
  
        while (pos > 1)  
        { 
  
            pos >>= 1; 
  
            segtree[pos] = Math.min(segtree[2 * pos],  
                                segtree[2 * pos + 1]); 
        } 
    } 
  
    static int range_query(int[] segtree, int left,  
                           int right, int n)  
    { 
          
        left += n; 
        right += n; 
  
        int mi = (int) 1e9; 
  
        while (left < right)  
        { 
  
            if ((left & 1) == 1) 
            { 
                mi = Math.min(mi, segtree[left]); 
  
                left++; 
            } 
  
            if ((right & 1) == 1)  
            { 
  
                right--; 
  
                mi = Math.min(mi, segtree[right]); 
            } 
            left /= 2; 
            right /= 2; 
        } 
        return mi; 
    } 
   
    public static void main(String[] args) 
    { 
        int[] a = {2, 6, 10, 4, 7, 28, 9, 11, 6, 33}; 
        int n = a.length; 
  
        int[] segtree = new int[2 * n]; 
        construct_segment_tree(segtree, a, n); 
  
        int left = 0, right = 5; 
        System.out.printf("Minimum in range %d to %d is %d\n",  
                           left, right, range_query(segtree, 
                           left, right + 1, n)); 

        int index = 3, value = 1; 
          
        update(segtree, index, value, n); 
        left = 2; 
        right = 6; 
        System.out.printf("Minimum in range %d to %d is %d\n",  
                           left, right, range_query(segtree,  
                           left, right + 1, n)); 
    } 
} 