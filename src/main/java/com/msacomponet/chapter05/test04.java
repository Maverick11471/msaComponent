package com.msacomponet.chapter05;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test04 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());  // 입력값 (n)

        int size = (int) Math.pow(2, n) + 1;  // (2^n + 1)
        int result = size * size;  // 점 개수 계산

        System.out.println(result);
    }


}
