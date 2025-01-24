package day13.Stargraft;

class Stargraft{
    public String attrack(){
        return "유닛 공격";
    }
}


class Zealot extends Stargraft{
    public String attrack(){
        String result = super.attrack();
        System.out.println("찌르기");
        return result;
     }
}

class Terran extends Stargraft{

}

class Protoss extends Stargraft{
    public void teleportation(){
        System.out.println("프로토스 워프");
    }
}



public class StatgraftPlay {
    public static void main(String[] args) {
        Stargraft zealot1 = new Zealot();
        String result = zealot1.attrack();
        System.out.println(result);
    }
}
