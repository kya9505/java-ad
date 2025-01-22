package src.day02;

public class StringEx {
    public static void main(String[] args) {
        char v1 = 'A';
        String v2 = "츄르츄르";

        String v3 = new String("홍길동");
        String v4 = "홍길동";

        System.out.printf("%c %s %s %n",v1,v2,v3);
        System.out.println(v2.hashCode());
        System.out.println(v3.hashCode());
        System.out.println(v4.hashCode());
    }
}
