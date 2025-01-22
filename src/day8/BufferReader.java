package day8;

import java.io.*;
import java.util.StringTokenizer;

public class BufferReader {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for(int i = 1; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            bw.write(first+ " ");
            bw.write((second)+"\n");
        }

        bw.flush();
        bw.close();
    }
}
