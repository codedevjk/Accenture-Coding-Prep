import java.util.HashMap;
import java.util.Scanner;

public class Stringtransform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        HashMap<Character, Integer> e = new HashMap<>();

        for (char c : s1.toCharArray()) {
            e.put(c, e.getOrDefault(c, 0) + 1);
        }
        int cost = 0;

        for (char c : s2.toCharArray()) {
            if (e.containsKey(c) && e.get(c) > 0) {
                e.put(c, e.get(c) - 1);
            } else {
                cost++;
            }
        }
        System.out.println(cost);

    }
}
