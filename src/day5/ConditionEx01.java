package day5;

public class ConditionEx01 {
    public static void main(String[] args) {

        int num = 20;
        if (num > 15) {
            System.out.println("숫자가 15 보다 큽니다.");
        } else {
            System.out.println("이 문장은 if문 외부에 있습니다.");
        }
//
        if (num < 50) {
            System.out.println("숫자가 50보다 작습니다.");
        } else {
            System.out.println("숫자가 50보다 큽니다.");
        }
        System.out.println("메뉴를 번호(1-2)로 고르시오. 1.중식 2.한식");
        int menuChoice = 0;
        menuChoice = 1;
        if (menuChoice == 1) {
            System.out.println("짬뽕 맛있게 드세요.");
        } else if (menuChoice == 2) {
            System.out.println("불고기 맛있게 드세요");
        } else {
            System.out.println("굶던가");
        }

        if (num == 10) {
            System.out.println("숫자가 10입니다.");
        } else if (num == 15) {
            System.out.println("숫자가 15입니다.");
        } else if (num == 20) {
            System.out.println("숫자가 20입니다.");
        } else {
            System.out.println("숫자가 존재하지 않습니다.");
        }

    }
}
