package day10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Arr[] = new String[100];
        int cnt = 0;
        int max = Integer.MIN_VALUE;

        for(int i =0 ; i<100; i++){
         int a = sc.nextInt();
         cnt++;
         if(a==999){
             cnt--;
             break;
         }
        }
    }
}
