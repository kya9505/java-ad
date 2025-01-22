package day11;

import java.awt.dnd.DragSource;
import java.util.Scanner;

class Calculation{

    public void addition(int a,int b){
        System.out.println(a+b);
    }
    public void subtraction(int a, int b){
        System.out.println(a-b);
    }
}

class Inheritance01 extends Calculation{
    public void multipl(int a, int b){
        System.out.println(a*b);
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inheritance01 obj = new Inheritance01();

        int a = sc.nextInt();
        int b = sc.nextInt();

        obj.addition(a,b);
        obj.subtraction(a,b);
        obj.multipl(a,b);
    }
}
