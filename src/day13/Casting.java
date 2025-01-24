package day13;


class Pareant{
    String Name;
    int age;
}

class Child extends Pareant{
    int num;
}


public class Casting {
    public static void main(String[] args) {
        Pareant p = new Pareant();
        Child c = new Child();
        System.out.println(p.Name + p.age);
        System.out.println(c.age+c.num+c.Name);

        Pareant p2 = (Pareant) c; // 자식클래스 객체 c를 부모클래스로 업캐스팅
        System.out.println(p2.Name + p2.age);

        Child c2 = (Child) p; // 부모클래스 p를 자식클래스로 다운캐스팅
        System.out.println(c2.num+ c2.age+c2.Name);

    }
}
