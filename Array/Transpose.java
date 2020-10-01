import java.util.*;
public class Transpose{
    public  static void  main(String[] args) {
        Scanner name= new Scanner(System.in);
        int a[][]=new int[100][100];
        int b[][]=new int[100][100];
       
        int m,n;
        System.out.println("Enter the number of rows of the matrix A ");
        m=name.nextInt();
        System.out.println("Enter the number of columns of the matrix A");
        n=name.nextInt();
        System.out.println("Enter the elements of matrix A one by one");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            a[i][j]=name.nextInt();
        }
        System.out.println("Displaying the original matrix A");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.printf("%d ",a[i][j]);
            }
            System.out.printf("\n");
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                b[j][i]=a[i][j];
            }
           
        }
        System.out.println("Displaying the transpose of  matrix A");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.printf("%d ",b[i][j]);
            }
            System.out.printf("\n");
        }

        
    }
}

      
       
      
        
    
