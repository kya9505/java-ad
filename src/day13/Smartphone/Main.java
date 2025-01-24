package day13.Smartphone;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.bell();
        phone.hangOn();
        phone.sendVoice("여보슈");
        phone.receiveVoice("고윤아님 맞으신가여?");
        phone.sendVoice("이민우인데요");
        phone.hangUp();

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setWifi(true);
        smartPhone.bell();
        smartPhone.hangOn();
        smartPhone.sendVoice("여보세여");
        smartPhone.receiveVoice("여보아닌데요?");
        smartPhone.hangUp();
        System.out.println();

        SmartPhone applePhone =  new SmartPhone("사과", "사과15", "화이트");
        applePhone.bell();
        applePhone.hangOn();
        applePhone.sendVoice("안녕");
        applePhone.receiveVoice("안녕");
        applePhone.hangUp();

    }
}
