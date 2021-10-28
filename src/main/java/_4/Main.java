package _4;

import java.util.Scanner;

//10진수 -> 2진수 변환
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputInt = 0;
        int bin[] = new int[100];
        int mok = 0;
        int i = 0;

        inputInt = scan.nextInt();
        mok = inputInt;

        while (mok > 0) {

            bin[i] = mok % 2;
            mok = mok / 2;
            i++;
        }

        System.out.println("intPut : " + inputInt + "");

        i--;
        for (; i >= 0; i--) {
            System.out.print(" " + bin[i] + " ");
        }

    }
}
