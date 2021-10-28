package _2;


// 피보나치 수열
public class Main {

    public static void main(String[] args){
        int []arr = new int[100];

        arr[1] = 1;
        arr[2] = 1;

        // 1번째 방법
        for (int i = 3; i<100; i++){
            arr[i] = arr[i-1] + arr[i-2];

        }

        //2번째 방법
        int preNum = 1;
        int prePreNum = 1;

        System.out.println("Pre : "+preNum);
        System.out.println("PrePre :"+prePreNum);

        for(int i = 3; i<=10; i++){
            int mNum = preNum + prePreNum;
            System.out.println("mNum : "+ mNum);

            prePreNum = preNum;
            preNum = mNum;
        }
    }
}
