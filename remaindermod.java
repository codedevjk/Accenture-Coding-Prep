import java.util.Scanner;

public class remaindermod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int n = Integer.parseInt(s);
        int x = 0;
        if (s.length() <= 1000) {
            x = n % 11;
            System.out.println(x);
        } else {
            System.out.println("-1");
        }

    }
}
