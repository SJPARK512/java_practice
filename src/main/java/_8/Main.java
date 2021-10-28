package _8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        int result = 1;

        for (; input >0; input--) {

            result *= input;
            System.out.println(input);
        }
        System.out.println(result);
    }
}
