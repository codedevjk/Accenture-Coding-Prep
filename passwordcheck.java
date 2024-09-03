import java.util.HashMap;
import java.util.Scanner;

public class passwordcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        if (hasUniqueFrequencies(arr)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    static boolean hasUniqueFrequencies(int[] arr) {
        HashMap<Integer, Integer> e = new HashMap<>();
        for (int i : arr) {
            e.put(i, e.getOrDefault(i, 0) + 1);
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int freq : hm.values()) {
            if (hm.containsKey(freq)) {
                return false;
            }
            hm.put(freq, 1);
        }
        return true;
    }
}
