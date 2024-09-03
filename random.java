import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int j = 0;
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            } else {
                continue;
            }
        }
        int m = temp.length;
        for (int i = j; i < n - m + 1; i++) {
            temp[i] = 0;

        }
        for (int k = 0; k < n; k++) {
            System.out.println(temp[k]);
        }

    }
}
