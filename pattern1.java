import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < j; i++) {
                System.out.print(" ");
            }
            for (int k = n; k > j; k--) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
