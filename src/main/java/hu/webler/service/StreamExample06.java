package hu.webler.service;

import hu.webler.bootstrap.DataInitializer;

import java.util.Collection;
import java.util.stream.Collectors;

public class StreamExample06 {

    DataInitializer dataInitializer;

    public StreamExample06(DataInitializer dataInitializer) {
        this.dataInitializer = dataInitializer;
    }

    public <T extends Number> Collection<String> squareRootOfNumbers(Collection<T> collection) {
        return collection.stream()
                .map(Number::doubleValue)
                .map(Math::sqrt)
                .map(num -> String.format("%.2f", num))
                .collect(Collectors.toList());
    }
}
