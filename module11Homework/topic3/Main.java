package org.module11Homework.topic3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> str = Arrays.asList("1, 2, 0", "4, 5");
        String result = str.stream()
                .flatMap(m -> Arrays.stream(m.split(", ")))
                .sorted()
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
