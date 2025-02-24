package com.msacomponet.chapter05;


import java.io.*;

public class test05 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        if (N == 1) {
            System.out.println(1);
            return;
        }

        int layer = 1;  // 현재 층
        int rangeMax = 1; // 현재 층에서 가장 큰 숫자

        while (rangeMax < N) {
            rangeMax += 6 * layer;
            layer++;
        }

        System.out.println(layer);
    }
}


