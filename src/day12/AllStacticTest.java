package day12;

class AllStactic{
    private AllStactic(){}
    public static int hap(int a, int b){
        int v = a + b;
        return v;
    }

}
public class AllStacticTest {
    public static void main(String[] args) {
        //AllStactic st = new AllStactic();
        int result = AllStactic.hap(10,20);
        System.out.println(result);
    }
}
