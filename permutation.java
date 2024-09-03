import java.util.Scanner;

public class permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(helper(str));

    }

    static int helper(String str) {
        int n = str.length();
        char ch[] = str.toCharArray();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (ch[i] != 'A' && ch[i] != 'E' && ch[i] != 'I' && ch[i] != 'O' && ch[i] != 'U') {
                count++;
            }
        }
        if (count == 0) {
            return 0;
        } else {
            return (factorial(count));
        }
    }

    static int factorial(int n) {
        int ans = 1;
        if (n == 1)
            return 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i;

        }
        return ans;

    }
}
