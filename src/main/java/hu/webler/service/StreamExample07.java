package hu.webler.service;

import hu.webler.bootstrap.DataInitializer;

import java.util.Collection;
import java.util.stream.Collectors;

public class StreamExample07 {

    DataInitializer dataInitializer;

    public StreamExample07(DataInitializer dataInitializer) {
        this.dataInitializer = dataInitializer;
    }

    public <T extends Number> Collection<T> numbersDivisibleByThree(Collection<T> collection) {
        return collection.stream()
                .filter(num -> num.intValue() % 3 == 0)
                .collect(Collectors.toList());
    }
}
