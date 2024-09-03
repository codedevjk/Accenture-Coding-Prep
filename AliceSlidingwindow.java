import java.util.Scanner;

public class AliceSlidingwindow {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int p = sc.nextInt();

        int max = 0;
        int curr = 0;

        for (int i = 0; i < p; i++) {
            if (str.charAt(i) == 'a') {
                curr++;
            }
        }

        max = curr;

        for (int i = p; i < str.length(); i++) {
            if (str.charAt(i - p) == 'a') {
                curr--;
            }
            if (str.charAt(i) == 'a') {
                curr++;
            }
            max = Math.max(max, curr);
        }
        System.out.println(max);
    }
}
