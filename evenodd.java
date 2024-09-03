import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = 0;
        int temp[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                temp[k] = arr[i];
                k++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                temp[k] = arr[i];
                k++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }

    }
}
