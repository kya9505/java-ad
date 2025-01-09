package day02;

import java.util.Scanner;

public class addSum {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
         /* 정수형 변수 value 선언
        value 변수에 10을 할당
        value 변수에 사용자에게 숫자를 입력받아 해당 숫자를 더한 후 result변수에 저장
        result 출력하는 addSum클래스를 작성하여 결과를 확인하세요.
         */
        int Val1 = 10;
        int sum = 0;
        sum += Val1;
        addSum(sum);
    }

    public static void addSum(int sum){
        int Val2 =  S.nextInt();
        sum += Val2;
        System.out.println(sum);
    }
}
