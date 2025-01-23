package day10;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [][]answer = new int [100][100];
        int [][]arr1 = new int [100][100];
        int [][]arr2 = new int [100][100];

        for(int i = 0; i<100; i++){
            for(int j =0; j<100; j++){
                arr1[i][j] = sc.nextInt();
                arr2[i][j] = sc.nextInt();
                answer[i][j] = arr1[i][j] * arr2[i][j];

            }
        }
        System.out.println(answer);
    }
}

