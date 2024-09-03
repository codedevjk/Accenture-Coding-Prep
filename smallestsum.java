import java.util.Scanner;

public class smallestsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int smallest = arr[1];
        int largest = arr[n - 1];

        for (int i = 0; i < n; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }

        System.out.println(largest + smallest + "(" + smallest + "+" + largest + ")");
    }
}
