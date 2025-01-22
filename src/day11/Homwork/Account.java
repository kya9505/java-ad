package src.day11.Homwork;

public class Account {
    private int Balance;
    public int MIN_BALANCE = 0;
    public int MAX_BALANCE = 1000000;

    public Account(){}
    public Account(int balance) {
        Balance = balance;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        if(!(balance>=MIN_BALANCE) || !(balance<=MAX_BALANCE)){
            Balance = Balance;
        }else Balance = balance;
    }
}
