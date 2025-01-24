package day13.coputer;

public class Computer extends Calculator{

    public  double radius;

    public Computer(){}

    public Computer(double r){
        this.radius =r ;
    }

    public void areacompute(){
        System.out.println("원의 면적을 계산합니다.");
        double result = Math.PI * this.radius * this.radius;
        System.out.println("계산이 끝났습니다. 면적은 "+ result);

    }

    public static void main(String[] args) {
        Calculator computer = new Calculator(10,20);
        computer.areacompute();

        Computer computer1 = new Computer(5);
        computer1.areacompute();

        Calculator calculator = new Computer();
    }
}
