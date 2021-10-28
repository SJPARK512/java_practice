package _6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int bigNum = 0, smallNum = 0;
        int gcd=1;

        System.out.println("숫자 2개 입력");
        int input1 = scan.nextInt();
        int input2 = scan.nextInt();

        if (input1 > input2) {
            bigNum = input1;
            smallNum = input2;
        } else {
            bigNum = input2;
            smallNum = input1;
        }

        for (int i =1; i<=smallNum; i++){
            if (bigNum % i ==0 && smallNum % i == 0){
                gcd = i;
                System.out.println(gcd);
            }
        }



    }
}
