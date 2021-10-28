package _3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static  void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int []inputNum = new int[10];
        int modeNum = 0;
        int modeCnt = 0;

        for (int i=0; i<10; i++){
            inputNum[i] = scan.nextInt();
        }

        int []mode = new int [10];

        for (int i= 0;i<10;i++){
            mode[inputNum[i]]++;
        }

        for (int i= 0;i<10;i++){

            if(modeCnt < mode[i]){
                modeCnt = mode[i];
                modeNum = i;
            }
        }

        System.out.println("num max:"+modeNum +"  "+ modeCnt);

    }
}
