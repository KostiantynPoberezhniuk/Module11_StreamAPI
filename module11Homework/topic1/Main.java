package org.module11Homework.topic1;

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {
        NamesList namesList = new NamesList();
        List<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("John");
        names.add("Smith");
        names.add("Bond");
        names.add("Rob");
        names.add("Zohan");

        System.out.println(namesList.evenNames(names));
    }
}
