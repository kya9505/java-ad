package Homework.Level9;

public class CarCO3 {
    private int num;
    private double gas;

    private CarCO3(){
        num = 0 ;
        gas = 0.0;
        System.out.println("자동차가 만들어졌습니다.");
    }

    public CarCO3(int n, double g) {
        this();
        num = n;
        gas = g;
        System.out.println("차량 번호가"+num+"으로, 연료량을"+gas+"로 바꾸었습니다.");
    }

    public  void show(){
        System.out.println("차량 번호는"+ num + "입니다.");
        System.out.println("연료량은"+ gas + "입니다.");
    }
}


class Sample7 {
    public static void main(String[] args) {

        //CarCO3 car1 = new CarCO3(); : private한 생성자의 호출로 객체 생성 불가
        //car1.show();

        CarCO3 car2 = new CarCO3(1234, 20.5);
        car2.show();
    }
}


