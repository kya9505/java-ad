package day5;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        System.out.println("점수를 입력하세요.");

        Scanner s = new Scanner(System.in);
        int grade = s.nextInt();

        if(grade<= 100 && grade>=90){
            System.out.println("A학점");
        }else if(grade<90 && grade >=80){
            System.out.println("B학점");
        } else if(grade<80 && grade >=70){
            System.out.println("C학점");
        }else if(grade<70 && grade >=60){
            System.out.println("D학점");
        }else {
            System.out.println("F학점");
        }
    }
}
