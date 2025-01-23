package day8;

public class Main {
    public static void main(String[] args) {
        int [][] scores = {
                {80,90,60},
                {76,88}
        };
        for(int i = 0; i<scores.length; i++){
            for(int j =0; j<scores[i].length; j++){
                System.out.print(scores[i][j]+" ");
            }
            System.out.println();
        }
    }
}
