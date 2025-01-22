package src.day10.DTO;

public class PersonDTO {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    private int age;
    private String phoneNum;

    public PersonDTO(){} //default constructor 기본생성자 => 개발자가 기술해놓지 않으면 컴파일시 컴파일러가 생성해줌

    public PersonDTO(String name,int age, String phoneNum){
        this.name = name;
        this.age = age;
        this.phoneNum = phoneNum; // 생성자 오버로딩

    }

   public PersonDTO(String name, String phoneNum){
        this.name = name;
        this.phoneNum = phoneNum;
   }

    public String getName() {
        return name;
    }

    public String play(){
        return "으라차차";
    }
    public String eat(){
        return "냠냠굿";
    }
    public void walk(){
        System.out.println("터벅터벅");
    }
    public String lunch(){
        return "점심시간에";
    }
}
