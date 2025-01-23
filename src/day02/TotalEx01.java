package day02;

import java.util.Scanner;

public class TotalEx01 {
    //멤버변수 : 클래스에서 공통적으로 사용하는 변수
    static Scanner input = new Scanner(System.in); //in : 키보드로부터 입력값을 받음
    //메서드 : 사칙연산 fourArith method , operator method
    static void fourArithmetic(){
        int a = input.nextInt();
        int b = input.nextInt();
        int result = 0;
        result = a + b;
        System.out.printf("a+b=%d%n",result);
        result = a - b;
        System.out.printf("a-b=%d%n",result);
        result = a * b;
        System.out.printf("a*b=%d%n",result);
        result = a / b;
        System.out.printf("a/b=%d%n",result);

    }
    static void operator(){
        int a = input.nextInt();
        int b = input.nextInt();
        int total = a + b ;
        double av = total/2;

        System.out.printf("총점 :%d%n",total);
        System.out.printf("평균 :%.1f%n",av);

    }
    //실행메서드
    public static void main(String[] args){
        fourArithmetic();
        operator();
    }


}
