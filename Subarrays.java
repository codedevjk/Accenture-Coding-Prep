import java.util.Scanner;

public class Subarrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {
                int sum = 0;
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    System.out.print(arr[k] + (k < n ? "," : " "));
                }
                System.out.print("]");
                System.out.println("Sum is:" + sum);
            }
        }

    }
}
