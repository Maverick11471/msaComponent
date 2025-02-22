package com.msacomponet.chapter05;

import java.util.List;

public class test03 {
    public static void main(String[] args) {
        List<String> words = List.of("banana", "apple", "grape", "orange", "kiwi");

        words.stream()
            .sorted()
            .forEach(System.out::println);
    }
}
