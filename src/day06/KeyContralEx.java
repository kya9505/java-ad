package src.day06;

import java.util.Scanner;

public class KeyContralEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean run = true; // 현실세계 자동차가 달리다. ==> 컴퓨터 세계 boolean run = true(엔진을 켜다)
        int speed = 0;
        while(run){
            System.out.println("-----------------------------");
            System.out.println("1. 속도증가 | 2. 감속 | 3. 중지");
            System.out.println("-----------------------------");
            System.out.print("선택하세요.");

            String strNum = in.nextLine();

            if(strNum.equals("1")){
                speed++;
                System.out.println("현재속도 = " + speed);
            }else if(strNum.equals("2")){
                speed--;
                System.out.println("현재속도 = " + speed);
            } else if (strNum.equals("3")) {
                run = false;
            }
        }

    }
}
