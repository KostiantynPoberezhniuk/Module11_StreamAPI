package org.module11Homework.topic2;

import java.util.Comparator;
import java.util.List;

public class SortedNames {

    public String[] sorted(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .toArray(String[]::new);
    }
}
