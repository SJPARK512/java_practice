package _10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();
        int arr[][] = new int[input][input];

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                System.out.printf("%4d", (i * input) + j + 1);

            }
            System.out.println();

        }
        System.out.println("===================");

        for (int i = 0; i < input; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < input; j++) {
                    arr[i][j] = (i * input) + j + 1;

                }
            } else {
                for (int j = input-1; j >= 0; j--) {
                    arr[i][j] = (i * input) + input - j;
                }
            }
        }

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                System.out.printf("%4d", arr[i][j]);

            }
            System.out.println();

        }

        System.out.println("===================");

        int arr2[][] = new int[input][input];

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                System.out.printf("%4d", (i+1)*(j+1) );

            }
            System.out.println();

        }


    }
}
