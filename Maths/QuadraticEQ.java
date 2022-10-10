import java.util.*;
class QuadraticEQ
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        double a,b,c,r1,r2,d;
        System.out.println("Enter a, b and c");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=b*b-4*a*c;
        if(d>=0)
        {
            r1=(-b+Math.sqrt(d))/(2*a);
            r2=(-b-Math.sqrt(d))/(2*a);
            System.out.print("The roots are "+String.format("%.1f",r1)+","+String.format("%.1f",r2));
        }
        else
        {
            r1=(-b)/(2*a);
            d=Math.sqrt(-d)/(2*a);
            System.out.print("The roots are "+String.format("%.1f",r1)+"+"+String.format("%.1f",d)+"i,"+String.format("%.1f",r1)+"-"+String.format("%.1f",d)+"i");
        }
    }
}

