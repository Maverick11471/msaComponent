package com.msacomponet.chapter05;

import java.io.*;
import java.util.Arrays;

public class test10 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int[] sticks = new int[3];
        sticks[0] = Integer.parseInt(input[0]);
        sticks[1] = Integer.parseInt(input[1]);
        sticks[2] = Integer.parseInt(input[2]);

        Arrays.sort(sticks); // 오름차순 정렬 (a, b, c)

        // 삼각형이 불가능한 경우, 가장 긴 변을 조정 1
        if (sticks[2] >= sticks[0] + sticks[1]) {
            sticks[2] = sticks[0] + sticks[1] - 1;
        }

        int perimeter = sticks[0] + sticks[1] + sticks[2];
        System.out.println(perimeter);
    }
}


