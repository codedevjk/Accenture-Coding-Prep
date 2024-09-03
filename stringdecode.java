import java.util.Scanner;

public class stringdecode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(helper(s));

    }

    static String helper(String s) {
        int count = 0;
        String ans = " ";
        char[] ch = s.toCharArray();

        if (s.length() == 0) {
            return "";
        }
        for (int i = 0; i < s.length(); i++) {
            if (ch[i] == '1') {
                count++;
            } else {
                if (count > 0) {
                    ans += (char) (64 + count);
                    count = 0;
                }
            }
        }
        if (count > 0) {
            ans += (char) (64 + count);
        }
        return ans;

    }
}
