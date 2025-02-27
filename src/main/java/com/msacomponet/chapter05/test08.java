package com.msacomponet.chapter05;

import java.io.*;

public class test08 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine()); // n이 최대 10억이므로 long 사용
        System.out.println(n * 4);
    }
}


