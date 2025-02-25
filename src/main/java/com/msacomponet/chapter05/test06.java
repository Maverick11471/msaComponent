package com.msacomponet.chapter05;

import java.io.*;
import java.util.StringTokenizer;

public class test06 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (A == 0 && B == 0) {
                break; // 종료 조건
            }

            if (B % A == 0) {
                sb.append("factor\n");
            } else if (A % B == 0) {
                sb.append("multiple\n");
            } else {
                sb.append("neither\n");
            }
        }

        System.out.print(sb.toString());
    }


}
