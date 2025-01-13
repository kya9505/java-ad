package day7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int monthdays[] = new int [12];

      for(int i =0;i<8; i++){
          if(i==7) {
              monthdays[i] = 31;
          }else  if((i+1)%2==0){
              monthdays[i] = 30;
          }else  monthdays[i]=31;
      }

      for(int i =8;i<12; i++){
          if((i+1)%2==0) monthdays[i] = 31;
          else  monthdays[i]=30;
      }

      for(;;){
          System.out.print("YEAR = ");
          int year = sc.nextInt();

          System.out.print("MONTH = ");
          int month = sc.nextInt();

          if(year%4==0 && year%100 != 0) monthdays[month] = 29;
          if(year%400==0) monthdays[month] = 29;
          if(month<0 || month >12)
          {System.out.println("잘못 입력하였습니다.");
              System.out.println();
              continue;}
          if(month ==0 ) break;
          System.out.printf("입력하신 달의 날 수는 %d일입니다.\n\n",monthdays[month]);
      }
    }
}

