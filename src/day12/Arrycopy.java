package day12;

public class Arrycopy {
    public static void main(String[] args) {
        int[] oldIntArry = {1, 2, 3};
        int [] newoldArry = new int[5];
        //기존배열을 새로운 배열의 동일한 인덱스에 복사하는 for문
        for(int i =0; i<oldIntArry.length; i++){
            newoldArry[i] = oldIntArry[i];
        }

        for(int i = 0; i<newoldArry.length;i++){
            System.out.print(newoldArry[i]+" ");
        }
        //자바 API System class에서 제공하는 arrycopy()를 이용한 출력
        System.arraycopy(oldIntArry,0,newoldArry,0,oldIntArry.length);
        for(int n : newoldArry){
            System.out.print(n+"*");
        }
    }
}
