package org.module11Homework.topic4;

import java.util.stream.Stream;

public class RandomDigits {

    public static Stream<Long> acm(long seed, long a, long c, long m) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}
