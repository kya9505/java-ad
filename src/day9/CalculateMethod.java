package src.day9;

public class CalculateMethod {
    public static void calculate(int x,int y){
        System.out.println(2*x*y);
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        double pie = 3.14;
        calculate(x,y);
        calculate(y,pie);
    }

    public static void calculate(int x, double y){
        double pi = 3.14;
        System.out.printf("원둘레 구하는 공식 : 2 x 반지름 %d x 원주율 %f%n 2 X %d x %f = %.2f",x,y,x,y,2*x*y);
    }


}
