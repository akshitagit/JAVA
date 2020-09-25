/*
You are given an array of integers A.
You need to tell whether you can choose three numbers such that a+b>=c.

Input Format
First line consists of number of integers N. next line consists of N space separated integers.

Constraints
1 <= N <= 10^5

Output Format
YES or NO

Sample Input
5
1 2 3 4 9
Sample Output
YES
Explanation
you can choose 1+3 >= 4
 */




import java.io.*;

public class Choose
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine());
        int a[]=new int[n],i;
        String s[]=bu.readLine().split(" ");
        for(i=0;i<n;i++)
            a[i]=Integer.parseInt(s[i]);

        if(n<3) {System.out.print("NO"); return;}

        int max,max2,maxp,max2p;
        if(a[0]>a[1])
        {
            max=a[0];
            max2=a[1];
            maxp=0;
            max2p=1;
        }
        else
        {
            max=a[1];
            max2=a[0];
            maxp=1;
            max2p=0;
        }

        for(i=2;i<n;i++)    //finding max and 2nd max of the array
        if(a[i]>max)
        {
            max2=max;
            max2p=maxp;
            max=a[i];
            maxp=i;
        }
        else if(a[i]>max2)
        {
            max2=a[i];
            max2p=i;
        }

        int min=Integer.MAX_VALUE;
        for(i=0;i<n;i++)    //finding min of array
        if(!(i==maxp || i==max2p))
        min=Math.min(a[i],min);

        if(max+max2>=min) System.out.print("YES");    //simplest possible triplet of a,b,c
        else System.out.print("NO");
    }
}



/*
eg cases-
4
2 2 4 4
YES
3
3 1 3
YES
5
1 2 3 4 5
YES
2
2 1
NO
 */
