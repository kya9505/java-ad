package day13.Smartphone;

public class Phone {
    private String bander;
    private String model;
    private String color;
    String message;

    public Phone(){}
    public Phone(String bander, String model, String color){
        this.bander = bander;
        this.model= model;
        this.color = color;

    }

    public String getBander() {
        return bander;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void bell(){
        System.out.println("벨이 울린다.");
    }

    public String sendVoice(String message){
        this.message = message;
        System.out.println("보낼 음성메세지 : "+message);
        return message;
    }
    public String sendVoiceTrancefer(){
        return message;
    }
    public void receiveVoice(String message){
        sendVoiceTrancefer();
        System.out.println("수신된 음성메세지 : "+message);
    }

    public void hangOn(){
        System.out.println("전화를 받다.");
    }
    public void hangUp(){
        System.out.println("전화를 끊다.");
    }
}
