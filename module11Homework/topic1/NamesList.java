package org.module11Homework.topic1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class NamesList {

    public String evenNames(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(names::get)
                .collect(Collectors.joining(", "));
    }
}
