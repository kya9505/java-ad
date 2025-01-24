package day13.coputer;

public class Circlecal1 extends Circlecal {

//
//    public double areaCircle(double radius) {
//        System.out.println("나는 Circlecal1dml areaCircle 메소드야");
//        return Math.PI * radius * radius;
//    }

    @Override
    public double areaCircle(double radius) {
        double result = super.areaCircle(radius);
        System.out.println("부모버전계산 : " + result);
        return Math.PI * radius *radius;
    }

    public static void main(String[] args) {
        Circlecal1 c1 = new Circlecal1();
        double result = c1.areaCircle(10);
        System.out.printf("원의 면적 : %.1f\n",result);

        Circlecal c2 = new Circlecal();
        double result2 = c2.areaCircle(20);
        System.out.printf("원의 면적 : %.1f\n",result2);
        System.out.println("*");
        Circlecal c3 = new Circlecal1();
        result = c3.areaCircle(30);
        System.out.printf("원의 면적 : %.1f\n",result);
    }

}
