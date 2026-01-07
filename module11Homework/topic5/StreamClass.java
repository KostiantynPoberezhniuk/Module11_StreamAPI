package org.module11Homework.topic5;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamClass {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> it1 = first.iterator();
        Iterator<T> it2 = second.iterator();

        Iterator<T> zipIterator = new Iterator<T>() {
            public boolean takeFirst = true;

            @Override
            public boolean hasNext() {
                return it1.hasNext() && it2.hasNext();
            }

            @Override
            public T next() {
                if (takeFirst) {
                    takeFirst = false;
                    return it1.next();
                } else {
                    takeFirst = true;
                    return it2.next();
                }
            }
        };
        Spliterator<T> spliterator =
                Spliterators.spliteratorUnknownSize(zipIterator, Spliterator.ORDERED);

        return StreamSupport.stream(spliterator, false);
    }
}
