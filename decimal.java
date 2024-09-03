import java.util.Scanner;

/**
 * decimal
 */
public class decimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();

        int ans = 0;
        int power = 1;

        while (binary > 0) {
            int unit = binary % 10;
            ans = ans + (unit * power);
            binary = binary / 10;
            power = power * 2;

        }

        System.out.println(ans);
    }
}