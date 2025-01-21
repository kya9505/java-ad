package day10.car;

public class CarDAO {
    CarDTO car = new CarDTO();

    public CarDAO(CarDTO car){
        this.car = car;
    }
    public void run(){
        car.setSpeed(car.getSpeed()+1);
        System.out.println(car.getModel()+"의 현재속도 : "+car.getSpeed());
    }
    public void CarBreak(){
        car.setSpeed(car.getSpeed()-1);
        System.out.println(car.getModel()+"의 현재속도 : "+car.getSpeed());
        if(car.getSpeed()==0){
            System.out.println("*".repeat(50));
            System.out.println(car.getUser()+"의 "+car.getModel()+">>stop<<");
        }
    }

}
