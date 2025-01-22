package day11.Homework20;

import java.util.Scanner;


public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account();
        Account[] Account = new Account[100];

        boolean Boo = false;
        boolean A = true;
        int cnt = 0;


        while (A) {
            account.menu();
            System.out.print("선택> ");
            int num = sc.nextInt();
            sc.nextLine();

            switch (num) {
                case 1:
                    if(cnt >1){
                        System.out.println("더이상 계좌를 개설할 수 없습니다.");
                    } else{
                        Account[cnt] = new Account();
                        account.menucall("계좌생성");
                        System.out.print("계좌번호 : ");
                        Account[cnt].setAccnum(sc.nextLine());
                        System.out.print("계좌주 : ");
                        Account[cnt].setName(sc.nextLine());
                        System.out.print("초기입금액 : ");
                        Account[cnt].setCash(sc.nextInt());
                        System.out.println("결과 : 계좌가 생성되었습니다.");
                        cnt++;
                        sc.nextLine();
                    }
                    break;


                case 2:
                    account.menucall("계좌목록");
                    if(cnt==0) System.out.println("생성된 계좌가 없습니다.");
                    for (int i = 0; i < cnt; i++) {
                        if (Account[i] != null) {
                            System.out.println("계좌번호 " + Account[i].getAccnum() + " " + Account[i].getName() + "님 " + Account[i].getCash() + "원");
                        }
                    }
                    break;

                case 3 :
                    account.menucall("예금");
                    System.out.print("계좌번호 : ");
                    String accnum = sc.nextLine();
                    for (int i = 0; i < cnt; i++) {
                        if (Account[i].getAccnum().equals(accnum)){
                            System.out.print("예금할 금액 : ");
                            int cashadd =sc.nextInt();
                            Account[i].setCash(Account[i].getCash()+cashadd);
                            System.out.println("\n현재 총 잔액 : "+Account[i].getCash());
                             Boo = true;
                        }
                    }
                    if(!Boo){
                        System.out.println("해당 계좌가 존재하지 않습니다.");
                        break;
                    }
                    break;
                case 4 :
                    account.menucall("출금");
                    System.out.println("계좌번호 : ");
                    String accnum2 = sc.nextLine();
                    for(int i =0; i<cnt; i++){
                        if(Account[i].getAccnum().equals(accnum2));
                    }

            }
        }
    }
}
