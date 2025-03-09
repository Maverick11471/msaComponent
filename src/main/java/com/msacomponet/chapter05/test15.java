package com.msacomponet.chapter05;

import java.io.*;

public class test15 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int number = 666;  // 첫 번째 종말의 숫자
        int count = 1;      // 찾은 종말의 숫자 개수

        while (count < N) {
            number++;  // 다음 숫자 확인
            if (String.valueOf(number).contains("666")) {
                count++;  // "666" 포함하면 count 증가
            }
        }

        System.out.println(number);
    }


}
