package day11.Homwork;

//17
public class Printer {
    public int Int;
    public double Double;
    public boolean Boolean;
    public String string;

    public Printer(String string) {
        this.string = string;
    }

    public Printer(boolean aBoolean) {
        Boolean = aBoolean;
    }

    public Printer(double aDouble) {
        Double = aDouble;
    }

    public Printer(int anInt) {
        Int = anInt;
    }

    public static void println(int anInt){
        System.out.println(anInt);
    }
    public static void println(boolean aBoolean){
        System.out.println(aBoolean);
    }
    public static void println(double aDouble){
        System.out.println(aDouble);
    }
    public static void println(String string){
        System.out.println(string);
    }
}
