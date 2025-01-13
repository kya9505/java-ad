package day9;

public class CatMain {
    public static void main(String[] args) {
        ParentCat momCat = new ParentCat();
        String breed = momCat.breed;
        System.out.println("어미고양이는" + breed);
        momCat.metodParentCat();
        ;

        ParentCat momCat1 = new ParentCat();
        momCat.breed = "점박이";
        System.out.println(momCat.breed);
        momCat1.metodParentCat();
    }
}