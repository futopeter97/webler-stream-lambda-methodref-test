package hu.webler.service;

import hu.webler.bootstrap.DataInitializer;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class StreamExample03 {

    DataInitializer dataInitializer;

    public StreamExample03(DataInitializer dataInitializer) {
        this.dataInitializer = dataInitializer;
    }

    public <T extends Number> double sumElements(Collection<T> collection) {
        Optional<?> firstElement = collection.stream().findFirst();
        if (firstElement.isPresent() &&
                ((firstElement.get() instanceof Double) || (firstElement.get() instanceof Float))) {
            return collection.stream()
                    .mapToDouble(Number::doubleValue)
                    .sum();
        } else {
            return collection.stream()
                    .mapToInt(Number::intValue)
                    .sum();
        }
    }

    public <T extends Number> T sumElementsMoreGeneric(Collection<T> collection) {
        Optional<T> firstElement = collection.stream().findFirst();
        if (firstElement.isPresent()) {
            Class<?> elementType = firstElement.get().getClass();
            if (elementType.equals(Double.class) || elementType.equals(Float.class)) {
                double sum = collection.stream()
                        .mapToDouble(Number::doubleValue)
                        .sum();
                return (T) Double.valueOf(sum);
            } else {
                long sum = collection.stream()
                        .mapToLong(Number::longValue)
                        .sum();
                if (elementType.equals(Integer.class)) {
                    return (T) Integer.valueOf((int) sum);
                } else {
                    return (T) Long.valueOf(sum);
                }
            }
        }
        return null;
    }


    // tested
    public <T extends Number> double sumElements(List<T> nums) {
        if (nums.getFirst() instanceof Double || nums.getFirst() instanceof Float) {
            return nums.stream()
                    .mapToDouble(Number::doubleValue)
                    .sum();
        } else {
            return nums.stream()
                    .mapToInt(Number::intValue)
                    .sum();
        }
    }
}
