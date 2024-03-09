package hu.webler.service;

import hu.webler.bootstrap.DataInitializer;

import java.util.Collection;
import java.util.stream.Collectors;

public class StreamExample08 {

    DataInitializer dataInitializer;

    public StreamExample08(DataInitializer dataInitializer) {
        this.dataInitializer = dataInitializer;
    }

    public <T extends Number> Collection<T> numbersBiggerThan(Collection<T> collection, int threshold) {
        return collection.stream()
                .filter(num -> num.doubleValue() > threshold)
                .collect(Collectors.toList());
    }
}
