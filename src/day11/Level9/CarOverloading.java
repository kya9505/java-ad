package Homework.Level9;

public class CarOverloading {
    private int num;
    private double gas;

    public  void show(){
        System.out.println("차량 번호는"+ num + "입니다.");
        System.out.println("연료량은"+ gas + "입니다.");
    }
    public void setCar(int n){
        num =n;
        System.out.println("차량번호를 "+num+"로 바꾸었습니다.");
    }
    public void setCar(double g){
        gas = g;
        System.out.println("연료량을"+gas+"로 바꾸었습니다.");
    }
    public void setNumGas(int n, double g){
        if(g>0 && g<1000){
            num = n ;
            gas = g ;
            System.out.println("차량번호를"+num+"로, 연료량을"+gas+"로 바꾸었습니다.");
        }else {
            System.out.println(g+"는 올바른 연료량이 아닙니다.");
            System.out.println("연료량을 바꿀 수 없습니다.");
        }
    }
}


class Sample2{
    public static void main(String[] args) {
        CarOverloading car1 = new CarOverloading();

        car1.setNumGas(1234,20.5);
        car1.show();

        System.out.println("차량번호만 변경되었습니다.");
        car1.setCar(2345);
        car1.show();

        System.out.println("연료량만 변경되었습니다.");
        car1.setCar(30.5);
        car1.show();
    }
}
