import java.util.*;
import java.io.*; 
  
class right_rotate
{ 
  
//function to rotate the array to the right by k positions
static void rightRotate(int a[], int n, int k) 
    { 
        //Finding the starting point of rotated array
        int p = k % n;p=p+1; 
      
        // Print the rotated array
        System.out.print("The rotated array is: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[(i + p) % n]+ " ");
        }
        System.out.println(); 
    } 
    
    
// Main function
public static void main (String[] args)throws IOException
{
    BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the number of elements in the array: ");
    int n=Integer.parseInt(b.readLine());
    int a[] = new int[n];int k=0;
    
    //Input the array elements from user
    System.out.println("Enter the elements of the array:- ");
    for(int i=0;i<n;i++)
    {
        System.out.print("Enter the elements at position "+(i+1)+" : ");
        a[i]=Integer.parseInt(b.readLine());
    }
    System.out.println(">>>>End of Input>>>>");
    System.out.print("\nDo you want to rotate the array to the right by 3 positions ? \npress 1 to confirm, press 0 to decline : ");
    int c=Integer.parseInt(b.readLine());
    if(c==1)
    {
        k = 3;
        rightRotate(a, n, k-1);
    }
    else if(c==0)
    {
        System.out.print("\nEnter the number of positions by which you want to right rotate the array: ");
        k=Integer.parseInt(b.readLine());
        rightRotate(a, n, k-1);
    }
    else
        System.out.println(">>>>Invalid Input>>>>");
}
}