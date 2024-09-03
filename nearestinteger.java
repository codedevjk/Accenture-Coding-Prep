import java.util.Scanner;

public class nearestinteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int lans = 0, upans = 0;
        for (int i = m - 1; i > 0; i--) {
            if (i % n == 0) {
                lans = i;
                break;
            }

        }
        for (int i = m + 1; i < Integer.MAX_VALUE; i++) {
            if (i % n == 0) {
                upans = i;
                break;
            }

        }
        if ((upans - m) > (m - lans)) {
            System.out.println(lans);
        } else {
            System.out.println(upans);
        }

    }

}
