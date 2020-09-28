// Java Program to implement BogoSort.
//WORST SORTING ALGORITHM that uses concept of permutation.
//also known as stupid sort, slow sort or monkey sort.
public class BogoSort { 
    void bogoSort(int[] arr) 
    { 
        // if array is not sorted then shuffle the 
        // array again 
        while (isSorted(arr) == false) 
            shuffle(arr); 
    } 

    // generating permuatation of the array 
    void shuffle(int[] arr) 
    { 
        // Math.random() returns a positive number with double data type 
        // value greater than or equal to 0.0 and less than 1.0. 
        for (int i = 0; i < arr.length; i++) {
            int j = (int)(Math.random()*i);
            //swapping two elements
            int temp = arr[i]; 
            arr[i] = arr[j]; 
            arr[j] = temp;
          }            
        } 
    // To check if array is sorted or not 
    boolean isSorted(int[] arr) 
    { 
        for (int i = 1; i < arr.length; i++) 
            if (arr[i] < arr[i - 1]) 
                return false; 
        return true; 
    } 

    // Prints the array 
    void printArray(int[] arr) 
    { 
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 

    public static void main(String[] args) 
    { 
        // Enter array to be sorted here 
        int[] arr = { 3, 2, 5, 1, 0, 4 }; 
        BogoSort ob = new BogoSort();
        ob.bogoSort(arr); 
        System.out.print("Sorted array: "); 
        ob.printArray(arr); 
    } 
} 
