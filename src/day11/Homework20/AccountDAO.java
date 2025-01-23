package day11.Homework20;

public class AccountDAO {

    AccountDTO accnum = new AccountDTO();
    AccountDTO name = new AccountDTO();
    AccountDTO cash = new AccountDTO();

    public AccountDAO(AccountDTO accnum, AccountDTO name, AccountDTO cash) {
        this.accnum = accnum;
        this.name = name;
        this.cash = cash;
    }

    public void menu(){
        System.out.println("*".repeat(50));
        System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
        System.out.println("*".repeat(50));
    }
    public void menucall(String menu ){
        System.out.println("-".repeat(10));
        System.out.println(menu);
        System.out.println("-".repeat(10));
    }


}
