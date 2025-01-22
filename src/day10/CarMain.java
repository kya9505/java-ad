//package src.day10;
//
//import src.day10.DTO.CarDTO;
//import src.day10.DTO.Tire;
//import src.day10.car.CarDAO;
//
//public class CarMain {
//    public static void main(String[] args) {
//        CarDTO car1 = new CarDTO();
//        Tire tire = new Tire();
//        tire.setModel("한국타이어");
//        CarDTO car2 = new CarDTO("캐스퍼",tire);
//        CarDAO carDao = new CarDAO(car2);
//        carDao.delete();
//        carDao.insert();
//        carDao.update();
//        carDao.select();
//    }
//}
