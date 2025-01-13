package day9;
public class MethodEx {

    public static String method(int num) {
        if (num % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
        return "리턴값";
    }
    public static void main (String[]args){
        int num = 9;
        method(num);
        System.out.println(method(50));


    }
}