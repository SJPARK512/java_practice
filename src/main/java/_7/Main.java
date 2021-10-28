package _7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan  = new Scanner(System.in);
        int input = scan.nextInt();

        for(int i=2 ; i< input; i++){

            if (input%i==0){
                System.out.println("소수가 아닙니다.");
                break;
            }

        }
        System.out.println("소수가 입니다.");
    }
}

