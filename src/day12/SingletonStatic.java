package day12;

public class SingletonStatic {
    private static SingletonStatic instance;
    private SingletonStatic(){}
//
//    static { //stati 블럭을 이용해 예외
//        try {
//            instance =new SingletonStatic();
//        } catch (RuntimeException e) {
//            throw new RuntimeException("싱글톤 객체 생성 오류");
//        }
//    }
    //외부에서 정적메소드인 gerInstance 호출하면 이때 초기화(Laze)
    public static SingletonStatic getInstance(){
        if(instance == null)instance = new SingletonStatic();
        return instance;
    }




}
