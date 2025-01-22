package src.day06;
import java.util.Random;
public class RamdomEx {
    public static void main(String[] args) {
        Random random = new Random();
            int n1 = random.nextInt(4);
            for(int i =1; i<=3; i++){
                int n2 = random.nextInt(4)+1;
                System.out.println(n2);
            }
            //60~45
        int b = random.nextInt(((60-45)+1) -(-45));

            //0~10
            int a = (int)(Math.random()*10);
            //0~100
            int a1 = (int)(Math.random()*100);
            //1~10
            int a2 = (int)(Math.random()*10+1);
            //10~20
            int a3 = (int)(Math.random()*10+10);
            //1~4\5
            int a4 = (int)(Math.random()*45+1);



    }
}
