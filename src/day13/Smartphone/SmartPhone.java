package day13.Smartphone;

public class SmartPhone extends Phone {
    private boolean wifi;

    public SmartPhone(){}
    public SmartPhone(String bander, String model, String color) {
        super(bander, model, color);
    }
    public void setWifi(boolean wifi){
        this.wifi = wifi;
        System.out.println("wifi의 상태를 변경하였습니다");
    }
    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }

    public void deviceInfo(){
        String vB = super.getBander();
        String vM = super.getModel();
        String vC = super.getColor();
    }
}
