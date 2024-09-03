import java.util.Scanner;

public class Indexreverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.println(helper(arr));

    }

    static int helper(int[] arr) {
        int rev[] = new int[arr.length];
        int a = 0, sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            rev[a] = arr[i];
            a++;
        }
        for (int i = 0; i < rev.length; i = i + 2) {
            sum = sum + rev[i];
        }
        return sum;
    }
}
