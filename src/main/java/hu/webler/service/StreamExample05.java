package hu.webler.service;

import hu.webler.bootstrap.DataInitializer;

import java.util.Collection;
import java.util.stream.Collectors;

public class StreamExample05 {

    DataInitializer dataInitializer;

    public StreamExample05(DataInitializer dataInitializer) {
        this.dataInitializer = dataInitializer;
    }

    public <T extends Number> Collection<T> filterEven(Collection<T> collection) {
        return collection.stream()
                .filter(num -> num.intValue() % 2 == 0)
                .collect(Collectors.toList());
    }
}
