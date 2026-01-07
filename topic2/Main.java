package org.module11Homework.topic2;


import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {
        SortedNames sortedNames = new SortedNames();

        List<String> namesList = List.of("Bob", "John", "Smith", "Bond", "Rob", "Zohan");
        String[] result = sortedNames.sorted(namesList);

        System.out.println(Arrays.toString(result));
    }
}
