package com.msacomponet.chapter05;

import java.io.*;
import java.util.*;
public class test19 {

    public class Main {
        public static void main(String[] args) throws IOException {
            // [1] 입력을 빠르게 받기 위한 BufferedReader 사용
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // [2] 출입 기록 개수 N 입력받기
            int N = Integer.parseInt(br.readLine());

            // [3] HashSet을 사용하여 출입 기록 저장 (중복 방지 및 빠른 탐색)
            HashSet<String> employees = new HashSet<>();

            for (int i = 0; i < N; i++) {
                // [4] 한 줄 입력받고 공백을 기준으로 이름과 상태 구분
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String action = st.nextToken();

                // [5] "enter"이면 추가, "leave"이면 제거
                if (action.equals("enter")) {
                    employees.add(name);
                } else {
                    employees.remove(name);
                }
            }

            // [6] 남아있는 직원들의 이름을 리스트로 변환 후 내림차순 정렬
            List<String> result = new ArrayList<>(employees);
            Collections.sort(result, Collections.reverseOrder());

            // [7] 결과 출력
            StringBuilder sb = new StringBuilder();
            for (String name : result) {
                sb.append(name).append("\n");
            }
            System.out.println(sb);
        }
    }

}
