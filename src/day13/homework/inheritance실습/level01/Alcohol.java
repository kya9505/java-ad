package day13.homework.inheritance실습.level01;

class Alcohol extends Drink {

    double alcper;

    public Alcohol(String name, int price, int count, double alcper) {
        super(name, price, count);
        this.alcper = alcper;
    }

    public double getAlcper() {
        return alcper;
    }

    public void setAlcper(double alcper) {
        this.alcper = alcper;
    }

    public static void printTitle() {
        System.out.println("상품명(도수[%])\t단가\t\t수량\t\t금액");
    }

    @Override
    public void printData() {
        System.out.printf("%s(%.1f)\t\t%d\t%d\t\t%d\n",name,alcper,price,count,getTotalPrice());
    }


}
