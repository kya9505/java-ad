package day13;

class GrandFather{
    public void printGranfather(){
        System.out.println("나는 할아버지입니다.");
    }
}

class SubFather extends GrandFather{
    public String FamilyName = "프로그래머";
    public String houseAddress = "인천";
    public  void printFather(){
        System.out.println("나는 아버지입니다! 나는 할아버지로부터 상속받습니다.");
    }
}

class SubSon extends SubFather{

    public  void printson(){
        System.out.println("나는 아들입니다,");
        System.out.println("나는 아버지로부터 상속받습니다.");
        System.out.println("나의 아버지는 "+this.FamilyName);
        System.out.println("나의 집은"+this.houseAddress);
    }
}


public class Inher2 {
    public static void main(String[] args) {
        SubSon obj = new SubSon();
        obj.printson();
        obj.printFather();
        obj.printGranfather();
    }
}
