package src.day10;

import src.day10.DTO.PersonDTO;

public class PersonMain {
    public static void main(String[] args) {
//        PersonDTO 고윤아1 = new PersonDTO(); //
//        고윤아1.name = " 고윤아";
//        고윤아1.age = 31;
//        고윤아1.phoneNum = "010-5624-4211";
        PersonDTO 이민우 = new PersonDTO("이민우",33,"010-2253-7771");
        System.out.println(이민우.eat()+" " + 이민우.getName()+ " ");
        System.out.println(이민우.getName()+" "+이민우.getAge()+"세 "+이민우.lunch()+" "+이민우.eat());
        System.out.println(이민우.getName()+ " "+ 이민우.lunch()+" "+이민우.play());
        System.out.println();
        PersonDTO 고윤아 = new PersonDTO("고윤아",31,"010-5624-4211");
        System.out.println(고윤아.getName()+" "+고윤아.play());
        System.out.println(고윤아.getName()+ " "+고윤아.lunch()+ " 우동을 "+고윤아.eat());
        System.out.println(고윤아.getName()+ " "+ 고윤아.lunch()+ " "+고윤아.play());
    }
}
