import java.util.*;

/**
 * fibonacci
 */
public class fibonacci {

    public static int fib(int n)
    {
        int a=0;
        int b=1;
        if(n==0)
        {
            return a;
        }
        else if(n==1)
        {
            return b;
        }
        int c=0;
        for(int i=2;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
    @SuppressWarnings("resource")
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(fib(n));

       
    }

}
