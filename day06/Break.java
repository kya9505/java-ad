package day06;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        //주사위 6개의 면에는 1~6까지의 숫자가 있다.
        //1~5까지의 숫자가 나오면 주사위를 던지고 -> whlie
        //6이 나오면 게임 종료 -> if
        //주사위 숫자는 예측 할 수 없다. -> 변수에 Math.random() 적용
        Scanner sc = new Scanner(System.in);
        while (true){
            int num = (int)(Math.random()*6)+1;
            System.out.println(num);
            System.out.println("프로그램 종료를 원하시면 exit를 입력하세요.");
            String a = sc.nextLine();
            if(a.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }

    }
}
