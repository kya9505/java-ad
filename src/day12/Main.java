package day12;

import java.util.Scanner;

class Calculation{
    int a;
    int b;

    public void addition(){
        System.out.println(a+b);
    }
    public void subtraction(){
        System.out.println(a-b);
    }
}

class Inheritance01 extends Calculation{
    public void multipl(){
        System.out.println(a*b);
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inheritance01 obj = new Inheritance01();

        obj.a = sc.nextInt();
        obj.b = sc.nextInt();

        obj.addition();
        obj.subtraction();
        obj.multipl();
    }
}
