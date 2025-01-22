package src.day10.DTO;

public class CarDTO { //자동차 데이터 기능 정의
    private String model;
    private int speed;
    private boolean start;
    private Tire tire;

    public CarDTO(){}
    public CarDTO(String model, Tire tire){
        this.model = model;
        this.tire = tire;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isStart() {
        return start;
    }

    public Tire getTire() {
        return tire;
    }


}
