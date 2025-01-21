package day10.A;

public class A {
    //필드
    A a1 = new A(true);
    A a2 = new A(1);
    A a3 = new A("문자열");

    public A(){}; //기본 생성자
    public A(boolean b){}; //public 생성자
    A(int i){}; // default 생성자
    private A(String s){};//private 생성자

    public A(A a1, A a2, A a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

}
