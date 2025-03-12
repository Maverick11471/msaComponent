package com.msacomponet.chapter05;

import java.io.*;
import java.util.*;
public class test17 {

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            int N = Integer.parseInt(br.readLine()); // 점 개수 입력받기
            int[][] points = new int[N][2]; // 좌표 저장 배열

            // 좌표 입력받기
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                points[i][0] = Integer.parseInt(st.nextToken()); // x 좌표
                points[i][1] = Integer.parseInt(st.nextToken()); // y 좌표
            }

            // 정렬 (y 좌표 기준, y 좌표가 같으면 x 좌표 기준 정렬)
            Arrays.sort(points, (a, b) -> {
                if (a[1] == b[1]) {
                    return Integer.compare(a[0], b[0]); // x 오름차순 정렬
                }
                return Integer.compare(a[1], b[1]); // y 오름차순 정렬
            });

            // 결과 출력
            for (int i = 0; i < N; i++) {
                sb.append(points[i][0]).append(" ").append(points[i][1]).append("\n");
            }

            System.out.println(sb);
        }
    }

}
