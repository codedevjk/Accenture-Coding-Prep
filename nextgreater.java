import java.util.Scanner;

public class nextgreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int largest = 0;
            largest = arr[i];
            for (int j = i + 1; j < n; j++) {

                if (arr[i] < arr[j]) {
                    largest = arr[j];
                    System.out.print(arr[j] + " ");
                    break;
                }

            }
            if (largest == arr[i]) {
                System.out.print("-1" + " ");
            }

        }
        // System.out.print("-1");
    }
}
