/*
Professor wanted to teach his students few new concepts regarding programming. He came up with an idea to define his own new function : SUM(P, Q) which implies, operation sum applied P times: the first time to Q, and each subsequent time to the result of the previous operation.

For example: if P = 2 and Q = 3, SUM(2,3) equals to sum(sum(3)) = sum(1+2+3) = sum(6) = 1+2+3+4+5+6 = 21

INPUT:
The first line contains a single integer T, the number of test cases. Each test case is described by a single line containing two integers P and Q.

OUTPUT:
For each test case, output one integer on a separate line.
 */

import java.io.*;

public class SumSoup
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine());
        while(t-->0)
        {
            String s[]=bu.readLine().split(" ");
            int p=Integer.parseInt(s[0]),q=Integer.parseInt(s[1]);
            int ans=soup(p,q);
            sb.append(ans+"\n");
        }
        System.out.print(sb);
    }

    static int soup(int p,int q)
    {
        if(p==1) return q*(q+1)/2;
        return soup(p-1,q*(q+1)/2);
    }
}

/*
i/p-
3
2 3
1 5
2 4

o/p-
27
15
65
 */
