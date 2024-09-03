import java.util.Scanner;

public class racekilometer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        while(n>0)
        {
            if(n%2==0)
            {
                sum+=n;
            }
            n--;

        }

        System.out.println(sum);
    }
}
