package org.module11Homework.topic5;

import java.util.stream.Stream;

public class Main extends StreamClass {


    public static void main(String[] args) {

        Stream<Integer> s1 = Stream.of(1, 3, 5, 7);
        Stream<Integer> s2 = Stream.of(2, 4, 6, 8, 10);

        zip(s1, s2).forEach(System.out::println);
    }
}
