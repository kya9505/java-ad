package day4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = 0;

        if (a == b) {
            System.out.println("0");
        }else if(a!=b){
            System.out.println("1");
        }

        if(b!=c){
            System.out.println(1);
        }else if(b==c){
            System.out.println(0);
        }

    }


}

