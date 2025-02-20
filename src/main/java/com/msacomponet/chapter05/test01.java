package com.msacomponet.chapter05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test01 {
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

    List<String> result = names.stream()
        .filter(name -> name.length() > 4)  // 길이가 4보다 큰 이름만 필터링
        .map(String::toUpperCase)           // 대문자로 변환
        .collect(Collectors.toList());      // 리스트로 수집
}
