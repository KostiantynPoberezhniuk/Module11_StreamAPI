package org.module11Homework.topic4;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        RandomDigits randomDigits = new RandomDigits();

        long a = 25214903917L;
        long c = 11L;
        long m = 2 ^ 48L;
        long seed = 15L;


        List<Long> numbers = randomDigits
                .acm(seed, a, c, m)
                .limit(10)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
