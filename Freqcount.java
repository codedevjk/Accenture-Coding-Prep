import java.util.HashMap;
import java.util.Scanner;

public class Freqcount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> e = new HashMap<>();

        for (char ch : str.toCharArray()) {
            e.put(ch, e.getOrDefault(ch, 0) + 1);
        }

        System.out.println(e); 
    }
}
