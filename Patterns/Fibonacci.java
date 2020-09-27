public class Fibonacci
{
    static void printSeries()
    {
        int a = 0,b = 1,c = 1;
        System.out.print(a+" ");
        for (int i = 1; i < 20; i++)
        {
            System.out.print(c+" ");
            c = a + b;
            a = b;
            b = c;
        }
    }
    
    public static void main(String a[])
    {
        printSeries();
    }
}