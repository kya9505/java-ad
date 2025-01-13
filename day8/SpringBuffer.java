package day8;

public class SpringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();//SpringBuffer생성
        sb.append("와");
        sb.append("와");
        sb.append("와");
        sb.append("와");
        sb.append("와");
        String result = sb.toString();
        System.out.println(result);
        System.out.println(sb.capacity()); //StringBuffer 변수의 배열 용량 크기 변화
    }
}
