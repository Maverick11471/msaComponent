package com.msacomponet.chapter05;

import java.util.List;

public class test07 {


    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        numbers.stream()
            .filter(n -> n % 2 == 0) // 짝수만 필터링
            .forEach(System.out::println); // 출력
    }
}

