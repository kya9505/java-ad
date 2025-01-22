package Homework.Level9;

public class CarInstance {
        private int num;
        private double gas;

        public CarInstance(){
            num = 0 ;
            gas = 0.0;
            System.out.println("자동차가 만들어졌습니다.");
        }

        public void setCarInstance(int n, double g) {
            num = n;
            gas = g;
            System.out.println("차량 번호가"+num+"으로, 연료량을"+gas+"로 바꾸었습니다.");
        }

        public  void show(){
            System.out.println("차량 번호는"+ num + "입니다.");
            System.out.println("연료량은"+ gas + "입니다.");
        }
    }


    class Sample8 {
        public static void main(String[] args) {

            CarInstance car1 = new CarInstance();
            car1.setCarInstance(1234,20.5);
            car1.show();

            CarInstance car2 = new CarInstance();
            car2.setCarInstance(4567,30.5);
            car2.show();
        }
    }



