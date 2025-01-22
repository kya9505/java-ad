package src.day11.Level9;

public class CarCMV {
    public static int sum = 0;

    private int num;
    private double gas;

    public CarCMV(){
        num = 0;
        gas = 0;
        sum++;
        System.out.println("자동차가 만들어졌습니다.");
    }

    public void setCarCMV(int n, double g) {
        num = n;
        gas = g;
        System.out.println("차량 번호가"+num+"으로, 연료량을"+gas+"로 바꾸었습니다.");
    }
    public static void showSum(){
        System.out.println("자동차는 총"+sum+"대 있습니다.");
    }
    public  void show(){
        System.out.println("차량 번호는"+ num + "입니다.");
        System.out.println("연료량은"+ gas + "입니다.");
    }
}


class Sample9 {
    public static void main(String[] args) {

        CarCMV.showSum();

        CarCMV car1 = new CarCMV();
        car1.setCarCMV(1234, 20.5);

        CarCMV.showSum();

//
        CarCMV car2 = new CarCMV();
        car2.setCarCMV(1234, 20.5);

        CarCMV.showSum();

    }
}




