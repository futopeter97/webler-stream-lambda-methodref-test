package hu.webler.service;

import hu.webler.bootstrap.DataInitializer;

import java.util.Collection;
import java.util.stream.Collectors;

public class StreamExample09 {

    DataInitializer dataInitializer;

    public StreamExample09(DataInitializer dataInitializer) {
        this.dataInitializer = dataInitializer;
    }

    public <T extends Number>Collection<T> filterUnevenBiggerThan(Collection<T> collection, int threshold) {
        return collection.stream()
                .filter(num -> num.doubleValue() > threshold && num.doubleValue() % 2 != 0)
                .collect(Collectors.toList());
    }
}
