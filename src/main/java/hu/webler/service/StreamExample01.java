package hu.webler.service;

import hu.webler.bootstrap.DataInitializer;

import java.util.Collection;
import java.util.stream.Stream;

public class StreamExample01 {

    DataInitializer dataInitializer;

    public StreamExample01(DataInitializer dataInitializer) {
        this.dataInitializer = dataInitializer;
    }

    public <T> Stream<T> createStreamFromCollection(Collection<T> collection) {
        return collection.stream();
    }
}
