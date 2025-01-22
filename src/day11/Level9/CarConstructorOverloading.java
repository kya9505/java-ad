package Homework.Level9;

public class CarConstructorOverloading {
    private int num;
    private double gas;

    public CarConstructorOverloading(){
        num = 0 ;
        gas = 0.0;
        System.out.println("자동차가 만들어졌습니다.");
    }

    public CarConstructorOverloading(int n, double g) {
        num = n;
        gas = g;
        System.out.println("차량 번호가"+num+"이며, 연료량이"+gas+"인 자동차가 만들어졌습니다.");
    }

    public  void show(){
        System.out.println("차량 번호는"+ num + "입니다.");
        System.out.println("연료량은"+ gas + "입니다.");
    }
}


class Sample5{
    public static void main(String[] args) {

        CarConstructorOverloading car1 = new CarConstructorOverloading();
        car1.show();

        CarConstructorOverloading car2 = new CarConstructorOverloading(1234,20.5);
        car2.show();
    }
}
