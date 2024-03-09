package hu.webler.service;

import hu.webler.bootstrap.DataInitializer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@DisplayName("Unit test of StreamExample01")
public class StreamExample01Test {

    private DataInitializer dataInitializerMock;
    private StreamExample01 streamExample01;

    @BeforeEach
    void setUp() {
        dataInitializerMock = mock(DataInitializer.class);
        streamExample01 = new StreamExample01(dataInitializerMock);
    }

    @Test
    @DisplayName("StreamExample01 test")
    void createStreanFromCollection_addCollection_ReturnStream() {
        // Arrange
        List<Integer> listOfNums1 = Arrays.asList(1, 2, 3, 4, 7);
        List<String> listOfWords = Arrays.asList("Péter", "Roland");

        when(dataInitializerMock.listOfIntegers1()).thenReturn(listOfNums1);
        when(dataInitializerMock.listOfStrings()).thenReturn(listOfWords);

        // Act
        Stream<Integer> streamOfNums1 = streamExample01.createStreamFromCollection(dataInitializerMock.listOfIntegers1());
        Stream<String> streamOfWords = streamExample01.createStreamFromCollection(dataInitializerMock.listOfStrings());

        // Assert
        assertNotNull(streamOfNums1);
        assertEquals(5, streamOfNums1.count());
        assertNotNull(streamOfWords);
        assertEquals(2, streamOfWords.count());
    }
}