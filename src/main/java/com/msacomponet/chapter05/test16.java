package com.msacomponet.chapter05;

import java.io.*;
import java.util.*;
public class test16 {

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken()); // 학생 수
            int K = Integer.parseInt(st.nextToken()); // 상을 받는 학생 수

            st = new StringTokenizer(br.readLine());
            Integer[] scores = new Integer[N];

            for (int i = 0; i < N; i++) {
                scores[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(scores, Collections.reverseOrder()); // 내림차순 정렬

            System.out.println(scores[K - 1]); // K번째 학생 점수 출력 (커트라인)
        }
    }

}
