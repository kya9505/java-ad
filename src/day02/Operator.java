package src.day02;

public class Operator {
    public static void main(String[] args) {
        int kor = 77;
        int eng = 87;
        int total = 0;
        double average= 0.0;

        total = kor+eng;
        average = total/2;

        System.out.printf("총점은 %d%n",total);
        System.out.printf("평균은 %.2f%n",average); //실수를 소수점 둘째짜리까지(점아래 반올림) 출력

        System.out.println("총점:"+total);
        System.out.println("평균:"+(average));
    }
}
