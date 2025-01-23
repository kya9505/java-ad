package day06;

import java.util.Scanner;

public class DoWhileEx {
        public static void main(String[] args) {
            System.out.println("메시지를 입력하세요.");
            System.out.println("프로그램을 종료하려면 \"exit\"를 입력하세요,");

            Scanner in = new Scanner(System.in);
            String inputString; // 입력된 내용 중 "exit"가 입력되면 프로그램 조욜
            do {
                System.out.println(">");
                inputString = in.nextLine();
                System.out.println(inputString);
            } while (!inputString.equals("exit"));

            System.out.println();
            System.out.println("프로그램 종료");
        }
    }
