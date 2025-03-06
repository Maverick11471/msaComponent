package com.msacomponet.chapter05;

import java.io.*;
import java.util.StringTokenizer;

public class test13 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 카드 개수
        int m = Integer.parseInt(st.nextToken()); // 목표 숫자
        int[] cards = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;

        // 3장의 카드 선택 (브루트포스)
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int total = cards[i] + cards[j] + cards[k];
                    if (total <= m) {
                        result = Math.max(result, total);
                    }
                }
            }
        }

        System.out.println(result);
        br.close();
    }


}
