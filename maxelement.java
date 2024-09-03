import java.util.Arrays;
import java.util.Scanner;

public class maxelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int temp[] = new int[n];
        temp = arr;

        Arrays.sort(temp);
        System.out.println(temp[n - 1]);
        for (int i = 0; i < n; i++) {
            if (temp[n - 1] == arr[i]) {
                System.out.println(i);
            }
        }

    }
}
