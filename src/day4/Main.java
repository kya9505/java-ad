package day4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int a,b;

     a = sc.nextInt();
     b = sc.nextInt();

    a = a + 100;
    b = b % 10 ;

        System.out.printf("%d %d", a,b);


    }
}
