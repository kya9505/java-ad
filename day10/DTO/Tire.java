package day10.DTO;

public class Tire {
    private String model;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "model='" + model + '\'' +
                '}';
    }
}
