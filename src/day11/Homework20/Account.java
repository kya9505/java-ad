package day11.Homework20;

public class Account {
    private String accnum;
    private String name;
    private int cash;



    public void setAccnum(String accnum) {
        this.accnum = accnum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public String getAccnum() {
        return accnum;
    }

    public String getName() {
        return name;
    }

    public int getCash() {
        return cash;
    }

    public void menu(){
        System.out.println("*".repeat(50));
        System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
        System.out.println("*".repeat(50));
    }
    public void menucall(String A){
        System.out.println("-".repeat(10));
        System.out.println(A);
        System.out.println("-".repeat(10));
    }

}
