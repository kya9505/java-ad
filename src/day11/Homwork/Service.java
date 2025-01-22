package day11.Homwork;

public class Service {
    public static void main(String[] args) {
        Memberservice memberservice = new Memberservice();
        boolean result = memberservice.login("hong", "12345");
        if(result){
            System.out.println("로그인 되었습니다.");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }


        Printer.println(10);
        Printer.println(true);
        Printer.println(5.7);
        Printer.println("홍길동");

        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        if(obj1 == obj2){
            System.out.println("같은 ShopService 객체입니다.");
        }else {
            System.out.println("다른 Shopservice 객체입니다. ");
        }
        Account account = new Account();

        account.setBalance(10000);
        System.out.println("현재잔고 : "+account.getBalance());
       account.setBalance(-100);
        System.out.println("현재잔고 : "+account.getBalance());
       account.setBalance(2000000);
        System.out.println("현재잔고 : "+account.getBalance());
       account.setBalance(300000);
        System.out.println("현재잔고 : "+account.getBalance());
    }
}
