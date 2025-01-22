package src.day9;

public class Method2 {
    public static void callMethod(){
        System.out.println("static 메서드입니다.");
        System.out.println(5+6);
    }
    public static void callMethod(String message){
        System.out.println(message);
    }
    public static void callMethod(int num1,int num2){
        System.out.println(num1+num2);
    }

    public static void main(String[] args) {
        callMethod();
        callMethod("static 메소드 callMethod에요");
        callMethod(2,3);
    }
}
