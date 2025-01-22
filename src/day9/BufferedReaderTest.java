package src.day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
import java.util.StringTokenizer;
public class BufferedReaderTest {

   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int student = 100;
        int[] scores = new int[student];
        int score = 0 ;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        double avg = 1;

        while (true) {
            bw.write("--------------------------------------------------\n");
            bw.write("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5. 종료\n");
            bw.write("--------------------------------------------------\n");
            bw.write("선택> ");
            bw.flush();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            bw.write("\n");
            if (a == 1) {
                bw.write("학생수> ");
                bw.flush();
                int b = Integer.parseInt(br.readLine());
                student = b;
                bw.write("\n");
            }
            if (a == 2) {
                for (int i = 0; i < student; i++) {
                    bw.write("scores[" + i+"]> ");
                    bw.flush();
                    scores[i] = Integer.parseInt(br.readLine());
                    bw.write("\n");
                }
            }
            if (a == 3) {
                for (int i = 0; i < student; i++) {
                    bw.write("scores[" + i + "]: " + scores[i] + "\n");
                    bw.flush();
                }
            }
            if (a == 4) {
                bw.write("최고 점수 : ");
                bw.flush();
                for (int i = 0; i < student; i++) {
                    sum += scores[i];
                    if (scores[i] > max) {
                        max = scores[i];
                    }
                }
                avg = sum/student;
                bw.write(String.valueOf(max)+" ");
                bw.write("평균 점수 : ");
                bw.write(String.format("%2.1f\n",avg));
                bw.flush();
            }
            if (a == 5) {
                bw.write("프로그램 종료");
                bw.flush();
                break;
            }
        }
        bw.flush();
        bw.close();
    }
}