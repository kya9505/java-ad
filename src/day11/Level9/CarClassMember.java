package Homework.Level9;

public class CarClassMember {

     int num;
     double gas;

     public  void show(){
         System.out.println("차량 번호는"+ num + "입니다.");
         System.out.println("연료량은"+ gas + "입니다.");

    }
}


    class Sample3{
        public static void main(String[] args) {
            CarClassMember car1 = new CarClassMember();

            car1.num =123;
            car1.gas = 20.5;

            car1.show();
    }
}
