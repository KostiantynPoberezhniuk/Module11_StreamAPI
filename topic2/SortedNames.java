package org.module11Homework.topic2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedNames {

    public List<String> sorted(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
