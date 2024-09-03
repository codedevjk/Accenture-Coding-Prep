import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();

        int binary = 0;
        int power = 1;
        int n;

        while (decimal > 0) {
            n = decimal % 2;
            binary = (n * power) + binary;
            decimal = decimal / 2;
            power = power * 10;

        }

        System.out.println(binary);
    }

}

/*
 * 1.first divide and find the remainder of the decimal digit
 * 2.multiply the remainder with the digit place value and add it to the binary answer
 * 3.increase the digit place in the multiple of 10 to move from one digit place to another 
 */
