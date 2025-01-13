package day4;

public class BitOperatorEx {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 11;

        System.out.println("n1 : "+ Integer.toBinaryString(n1));
        System.out.println("n2 : "+ Integer.toBinaryString(n2));

        System.out.println("n1 & n2 : " + Integer.toBinaryString(n1 & n2));
        System.out.println("n1 | n2 : " + Integer.toBinaryString(n1 | n2));
        System.out.println("n1 | n2 : " + Integer.toBinaryString(n1 ^ n2));
    }
}
