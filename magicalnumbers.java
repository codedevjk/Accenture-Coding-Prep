import java.util.Scanner;

public class magicalnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int x = helper(i);
            if (x == 1) {
                count++;
            }
        }
        System.out.println(count);
    }

    static int binary(int n) {
        int binary = 0;
        int pow = 1;

        while (n > 0) {
            int x = n % 2;
            binary = (x * pow) + binary;
            n = n / 2;
            pow = pow * 10;

        }
        return binary;

    }

    static String replace(int n) {
        String s = String.valueOf(n);
        StringBuilder str = new StringBuilder(s);

        int l = s.length();

        for (int i = 0; i < l; i++) {
            if (s.charAt(i) == '0') {
                str.setCharAt(i, '1');
            } else if (s.charAt(i) == '1') {
                str.setCharAt(i, '2');
            }
        }
        return str.toString();

    }

    static int helper(int n) {
        int binary = binary(n);
        String str = replace(binary);
        Integer x = Integer.valueOf(str);

        int sum = 0;
        while (x > 0) {
            int a = x % 10;
            sum += a;
            x /= 10;
        }
        if (sum % 2 != 0) {
            return 1;
        } else {
            return 0;
        }

    }
}
