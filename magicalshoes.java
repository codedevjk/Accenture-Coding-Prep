import java.util.Scanner;

public class magicalshoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println(helper(arr, n));

    }

    static int helper(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0) {
                count++;
            }
        }
        if (count > 0)
            return count;
        else
            return 0;
    }
}
