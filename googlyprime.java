import java.net.SocketPermission;
import java.util.Scanner;

public class googlyprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0)
        {
            int x=n%10;
            sum+=x;
            n=n/10;
        }
        if(prime(sum)==true)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    
    }
    static boolean prime(int n)
    {
        int count=0;
        for(int a=1;a<=n;a++)
        {
            if(n%a==0)
            {
                count++;
            }
        }
        if(count==2)
            return true;
        else
            return false;

    }
}
