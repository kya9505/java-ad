package day01;

public class Calculator{
    public static void main(String[] args) {

        int sum = 0;


        for(int i=1; i <=100; i++){
            System.out.println("i =" + i);

          if( i % 2 == 0){
            sum += i;
          }
        }
        System.out.println("1부터 100까지의 짝수 합은 : " + sum);
    }
}

