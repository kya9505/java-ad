package day02;

public class BooleanEx {
    public static void main(String[] args) {
        int bool = 10;

        boolean result = (bool == 20);
        System.out.println("=="+result);

        result = (bool != 20);
        System.out.println("!="+result);

        result = (bool > 20);
        System.out.println(">"+result);

        result = (0< bool && bool <20);
        System.out.println("&&"+result);

        result = (0< bool | bool >20);
        System.out.println("|"+result);
    }
}
