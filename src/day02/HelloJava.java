package src.day02;

import java.util.Scanner;

// 1."Hello Java" 문자열을 출력하는 HelloJava클래스 작성
//2. "Hello Java"를 출력한 후 사용자에게 이름을 입력받아 "Hello name"을 출력하세요.
public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello Java"); //out은 콘솔(기본출력기)에 입력, print입력받은 내용을 출력
        callName(); //다른 메소드 호출
        System.out.println("당신의 이름을 입력해주세요");
        Scanner input = new Scanner(System.in); //멤버변수(instance하는 변수) - 힙영역
        String name = input.nextLine();
        System.out.println("당신의 이름은 "+ name);
        callName();
        String eat = callStringName(); //호출한 메소드의 리턴값 타입을 맞춰줘야함
        eat = eat +"먹고싶다 냠냠";
        System.out.println(eat);

        callStringparam(eat);

    }
//
    public static void callName(){
        System.out.println("내 이름을 불러죠 하하");
    }

    public static String callStringName(){
        String name = "마라탕";
        return name;
    }
    public static void callStringparam(String eat){
        System.out.println(eat + " callStringparam 처리완료");
    }


}
