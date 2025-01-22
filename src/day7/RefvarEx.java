package src.day7;

public class RefvarEx {
    public static void main(String[] args) {
        int[] arry1;
        int[] arry2;
        int[] arry3;

        arry1 = new int[] {1,2,3};

        for(int i = 0; i<arry1.length;i++){
            System.out.print(arry1[i]);
        }
        System.out.println();
        for(int i : arry1){
            System.out.print(i);
        }
    }
}
