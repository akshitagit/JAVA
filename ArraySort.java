import java.io.*;
import java.util.*;
class ArraySort{
	public static void main(String args[]){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Before Sorting");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+"\t");
		}
		int temp;
		System.out.println("\nArray After Sorting");
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+"\t");
		}
	}
}

					