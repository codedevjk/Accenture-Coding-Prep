import java.util.Scanner;

public class stocks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        System.out.println(helper(arr,n));

    }

    static int helper(int arr[],int n)
    {
        int count=0,a=1;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                count++;
            }
            a++;
        }
        if(count>0)
            return count;
        else
            return -1;
        
    }
}
