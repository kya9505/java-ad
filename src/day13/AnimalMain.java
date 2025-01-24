package day13;

class Animal{
    public void eat(){
        System.out.println("먹이를 먹다.");
    }
}
class Cat extends Animal{
    public void meow(){
        System.out.println("야옹하고 울다.");
    }

}
class Dog extends Animal{
    public void bark(){
        System.out.println("멍멍하고 짖다.");
    }
}


public class AnimalMain {
    public static void main(String[] args) {
        Cat objCat = new Cat();
        Dog objDog = new Dog();

        objCat.meow();
        objCat.eat();
        objDog.bark();
        objDog.eat();
    }
}
