import java.util.Scanner;

public class decrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < s1.length(); i += 2) {
            int freq = s1.charAt(i) - '0';
            sum += freq;
            if (sum >= n) {
                System.out.println(s1.charAt(i - 1));
                break;
            }
        }

    }
}
