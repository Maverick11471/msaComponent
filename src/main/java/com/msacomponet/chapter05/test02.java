package com.msacomponet.chapter05;

import java.util.List;

public class test02 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int sum = numbers.stream()
            .filter(n -> n % 2 == 0)  // 짝수 필터링
            .mapToInt(n -> n * 2)     // 각 요소 2배
            .sum();                   // 합계 구하기

        System.out.println(sum); // 12 (2*2 + 4*2)
    }


}
