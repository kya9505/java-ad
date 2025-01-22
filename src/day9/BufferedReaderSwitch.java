package src.day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
import java.util.StringTokenizer;


public class BufferedReaderSwitch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int student = 100;
        int[] scores = new int[student];
        int score = 0;
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
            switch (a) {
                case 1:
                    bw.write("학생수 : ");
                    bw.flush();
                    student = Integer.parseInt(br.readLine());
                    continue;
                case 2:
                    for (int i = 0; i < student; i++) {
                        bw.write("scores[" + i + "]> ");
                        bw.flush();
                        scores[i] = Integer.parseInt(br.readLine());
                    }
                    continue;
                case 3:
                    for (int i = 0; i < student; i++) {
                        bw.write("score[" + i + "]: " + scores[i] + "\n");
                        bw.flush();
                    }
                    continue;
                case 4:
                    for (int i = 0; i < student; i++) {
                        sum += scores[i];
                        if (scores[i] > max) {
                            max = scores[i];
                        }
                    }
                    avg = sum / student;
                    bw.write("최고점수 : " + String.valueOf(max) + "\n");
                    bw.write(String.format("평균점수 : %2.1f\n", avg));
                    bw.flush();
                    continue;
                default:
                    bw.write("프로그램 종료");
                    bw.flush();
                    break;
            }
            break;

        }
    }
}