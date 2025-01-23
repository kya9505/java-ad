package day10.car;

public class CarDTO {
    private String model;
    private String user;
    private int speed;

    public CarDTO(){};
    public CarDTO(String model,String user){
        this.model = model;
        this.user = user;
        this.speed = speed;
    };


    public void setModel(String model) {
        this.model = model;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public String getUser() {
        return user;
    }

    public int getSpeed() {
        return speed;
    }
}
