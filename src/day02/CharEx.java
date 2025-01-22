package src.day02;

public class CharEx {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 65;
        char c3 = '가';
        char c4 = 44032; //유니코드 직접 저장

        char c = ' '; //char초기화 시 ' ' 공백(유니코드

        System.out.printf("%c %c %c %c",c1,c2,c3,c4);
    }
}
