package hu.webler.bootstrap;

import lombok.Getter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
public class DataInitializer {

    public List<Integer> listOfIntegers1() {
        return List.of();
    }

    public List<Number> listOfNumbers1() {
        return Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
    }

    public List<Integer> listOfIntegers2() {
        return Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    public Set<Double> setOfDoubles() {
        return new HashSet<>(Arrays.asList(1.1, 1.1, 1.1, 2.2, 3.3, 4.4, 5.5));
    }

    public List<Integer> listOfIntegers3() {
        return Arrays.asList(1, 0, 2, 100);
    }

    public List<String> listOfStrings() {
        return Arrays.asList("Péter", "Roland");
    }

}
