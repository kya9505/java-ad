package day10.car;

public class CarMain {
    public static void main(String[] args) {
        CarDTO car1 = new CarDTO("캐스퍼", "고윤아");
        CarDAO car1dao = new CarDAO(car1);

        for(int i =0; i<10; i++){
            car1dao.run();
        }
        System.out.println("*".repeat(50));
        for(int i = 0; i<10; i++){
            car1dao.CarBreak();
        }
        System.out.println("*".repeat(50));
    }
}
