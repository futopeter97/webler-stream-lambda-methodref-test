package hu.webler.service;

import hu.webler.bootstrap.DataInitializer;

import java.util.Collection;

public class StreamExample10 {

    DataInitializer dataInitializer;

    public StreamExample10(DataInitializer dataInitializer) {
        this.dataInitializer = dataInitializer;
    }

    public <T extends Number> String productOfNumbers(Collection<T> collection) {
        double productOfNumbers = collection.stream()
                .mapToDouble(Number::doubleValue)
                .reduce(1, (a, b) -> a * b);
        return String.format("%.2f", productOfNumbers);
    }
}
