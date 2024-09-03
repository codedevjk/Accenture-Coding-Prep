import java.util.Scanner;

import javax.script.ScriptContext;

public class primesum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(helper(n));
    }

    static int helper(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                sum += i;
            }
        }
        return sum;

    }
}
