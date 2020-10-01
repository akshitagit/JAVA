import java.util.*;
public class Multiply{
    public  static void  main(String[] args) {
        Scanner name= new Scanner(System.in);
        int a[][]=new int[100][100];
        int b[][]=new int[100][100];
        int c[][]=new int[100][100];
        int m,n,p,q,k;
        System.out.println("Enter the number of rows of the first array");
        m=name.nextInt();
        System.out.println("Enter the number of columns of the first array");
        n=name.nextInt();
        System.out.println("Enter the elements of first array one by one");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            a[i][j]=name.nextInt();
        }
        System.out.println("Enter the number of rows of the second array");
        p=name.nextInt();
        System.out.println("Enter the number of columns of the second array");
        q=name.nextInt();
        System.out.println("Enter the elements of second array one by one");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++)
            b[i][j]=name.nextInt();
        }
       
        for(int i=0;i<m;i++){
            for(int j=0;j<q;j++){
                for(k=0;k<n;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }     
        }
        System.out.println("Displaying product of matrices");
        for(int i=0;i<m;i++){
            for(int j=0;j<q;j++){
                System.out.printf("%d ",c[i][j]);
            }
            System.out.printf("\n");
        }
        
    }
}
