package src.day8;

public class StringSplintEx {
    public static void main(String[] args) {
        String str = "input@github.com@kya9505";

        String[] splitter = str.split("@");

        System.out.print(splitter[0]+" ");
        System.out.print(splitter[1]+" ");
        System.out.print(splitter[2]+" ");
        System.out.println();
        for(int i = 0 ; i < splitter.length; i++ ){
            System.out.print(splitter[i]+ " ");
        }
        System.out.println();
        int i =0;
        for(String data : splitter){
            System.out.printf("%d 위치 : %s%n",++i,data);
        }
    }
}
