package com.msacomponet.chapter05;

import java.io.*;
import java.util.*;
public class test18 {

    public class Main {
        public static void main(String[] args) throws IOException {
            // [1] 입력 처리
            // [문제] 문제에서 첫 번째 줄에서 사람 수 N을 입력받고,
            // 두 번째 줄에서 좌표들을 입력받는다.
            // "좌표 압축" 문제에서 좌표들이 주어진다는 사실을 인식하고 입력을 받습니다.
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());  // 첫 번째 줄에서 사람 수 N을 입력받음.

            // 두 번째 줄에서 N개의 좌표를 입력받음.
            String[] input = br.readLine().split(" ");  // input = ["2", "4", "-10", "4", "-9"]

            // [2] 좌표 배열 만들기
            // [문제] 입력받은 좌표들을 배열에 저장해야 한다.
            // 문제에서 주어진 좌표들을 저장할 배열을 준비하고,
            // 입력받은 좌표들을 해당 배열에 저장합니다.
            int[] coords = new int[N];
            for (int i = 0; i < N; i++) {
                coords[i] = Integer.parseInt(input[i]);  // coords = [2, 4, -10, 4, -9]
            }

            // [3] 좌표 정렬 및 중복 제거
            // [문제] 좌표들을 정렬하고 중복을 제거해야 한다.
            // "좌표 압축"의 핵심은 중복된 좌표들을 제거하고,
            // 각 좌표를 그 순서대로 압축하는 것입니다.
            // 따라서 먼저 좌표들을 정렬하고 중복을 제거해야 합니다.
            int[] sortedCoords = coords.clone();  // sortedCoords = [2, 4, -10, 4, -9]
            Arrays.sort(sortedCoords);  // sortedCoords = [-10, -9, 2, 4, 4]

            // [4] 좌표에 인덱스 매핑
            // [문제] 중복된 좌표는 같은 인덱스를 가져야 한다.
            // 정렬된 좌표들에 대해 인덱스를 매핑하여 좌표를 압축된 인덱스로 변환합니다.
            // 각 좌표가 처음 등장할 때마다 그 인덱스를 부여하고,
            // 이미 등장한 좌표는 무시하여 중복을 제거합니다.
            Map<Integer, Integer> compressMap = new HashMap<>();
            int index = 0;

            for (int coord : sortedCoords) {
                if (!compressMap.containsKey(coord)) {
                    compressMap.put(coord, index++);  // compressMap = {-10=0, -9=1, 2=2, 4=3}
                }
            }

            // [5] 좌표를 압축된 인덱스로 변환
            // [문제] 원래 좌표들을 압축된 인덱스로 변환해야 한다.
            // 원래 주어진 좌표들을 압축된 인덱스로 변환하여 출력하는 것이 목표입니다.
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for (int coord : coords) {
                // 원래 좌표를 압축된 인덱스로 변환하여 출력
                bw.write(compressMap.get(coord) + " ");  // 출력: "2 3 0 3 1"
            }

            // [6] 출력 버퍼 비우기
            // [문제] 출력이 완료된 후 버퍼를 비워야 한다.
            // BufferedWriter에서 데이터를 모두 출력한 후, 출력 버퍼를 비워줍니다.
            bw.flush();
            bw.close();
        }
    }

}
