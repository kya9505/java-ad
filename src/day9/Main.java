package day9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[]{"J", "U", "N", "G", "O", "L"};
        String A = sc.next();
        boolean a = true;

        for(int i =0; i< arr.length; i++){
            if(A.equals(arr[i])) {
                System.out.print(i);
                a = false;
                break;
            }
        }
        if(a){
            System.out.println("none");
        }


    }
}