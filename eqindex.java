import java.util.Scanner;

public class eqindex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(efficient(arr, n));

    }

    // static int eq(int arr[], int n) {
    // for (int i = 0; i < n; i++) {
    // int leftsum = 0, rightsum = 0;
    // for (int j = 0; j < i; j++) {
    // leftsum += arr[j];
    // }
    // for (int j = i + 1; j < n; j++) {
    // rightsum += arr[j];
    // }
    // if (leftsum == rightsum) {
    // return i;
    // }
    // }
    // return -1;
    // }

    static int efficient(int arr[], int n) {
        int totalsum = 0;

        for (int i = 0; i < n; i++) {
            totalsum += arr[i];
        }
        int leftsum = 0;

        for (int i = 0; i < n; i++) {
            totalsum -= arr[i];
            if (totalsum == leftsum) {
                return i;
            }
            leftsum += arr[i];
        }
        return -1;

    }
}