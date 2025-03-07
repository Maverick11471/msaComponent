package com.msacomponet.chapter05;

import java.io.*;

public class test14 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 1; i < N; i++) {
            int sum = i;
            int num = i;

            while (num > 0) {
                sum += num % 10; // 각 자리수 더하기
                num /= 10;
            }

            if (sum == N) {
                result = i;
                break; // 가장 작은 생성자를 찾으면 종료
            }
        }

        System.out.println(result);
    }


}
