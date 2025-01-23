package day8;

public class MultiArray {
    public static void main(String[] args) {
        int[][] scores = {
                {80, 90, 60},
                {76, 88}
        };
//        for(int i = 0; i<scores.length; i++){
//            for(int j =0; j<scores[i].length; j++){
//                System.out.print(scores[i][j]+" ");
//            }
//            System.out.println();
//        }

        int sum = 0;
        int cnt = 0;
        for(int k : scores[1]){
            sum += k;
        }

        System.out.println("sum = "+sum);
        System.out.printf("avg = %2.1f",(double)sum/scores[1].length);
    }
}
