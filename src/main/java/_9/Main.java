package _9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        int length = (int) (Math.log10(input) + 1);
        int tool = 0;
        int result = 0;

        for (; 0 < length; length--) {
            tool = (int) Math.pow(10, length - 1);

            result += (input / tool);
            input = (input % tool);

        }

        System.out.println(result);
    }
}
