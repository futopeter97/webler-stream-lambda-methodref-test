package hu.webler.util;

import java.util.Collection;
import java.util.Objects;
import java.util.stream.Stream;

public class Printer {

    public static void printSeparator() {
        System.out.println("-------------------------");
    }

    public static <T> void printElements(Stream<T> stream) {
        stream.map(Object::toString)
                .forEach(System.out::println);
    }

    public static <T> void printElements(Collection<T> collection) {
        collection.stream()
                .map(Objects::toString)
                .forEach(System.out::println);
    }

    public static <T> void printElement(T element) {
        System.out.println(element);
    }

    private Printer() {
    }
}
