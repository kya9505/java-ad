//15
package day11.Homwork;

public class Memberservice {
    H13 Id = new H13();
    H13 Password = new H13();

    public boolean login(String Id, String Password) {
        if (Id.equals("hong") && Password.equals("12345")) {
                return true;
        } else return false;
    }

    public void logout(){
        System.out.println(Id+"님이 로그아웃 되었습니다.");

    }
}
