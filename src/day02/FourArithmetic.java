package day02;

import java.util.Scanner;

public class FourArithmetic {
    public static void main(String[] args) {
        int a =12;
        int b = 2;
        int result = 0;

        result = a + b;
        System.out.printf("a + b = %d%n",result); //prinr f : c언어 동일, %로 콤마 왼쪽 내용 대입
        result = a - b;     //%n 줄바꿈
        System.out.printf("a - b = %d%n",result); //prinr f : c언어 동일, %로 콤마 왼쪽 내용 대입
        result = a * b;
        System.out.printf("a * b = %d%n",result); //prinr f : c언어 동일, %로 콤마 왼쪽 내용 대입
        result = a / b;
        System.out.printf("a / b = %d%n",result); //prinr f : c언어 동일, %로 콤마 왼쪽 내용 대입


    }
}
