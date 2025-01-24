package day13.coputer;

public class Calculator {
    int row;
    private int colum;

    public Calculator(){}
    public Calculator(int row, int colum){
        this.row = row;
        this.colum = colum;
    }

    public void areacompute(){
        System.out.println("사각형의 면적을 계산합니다.");
        int result = row*colum;
        System.out.println("계산이 끝났습니다. 면적은 "+ result);

    }
}
