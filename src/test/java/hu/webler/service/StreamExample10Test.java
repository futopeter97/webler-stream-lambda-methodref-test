package hu.webler.service;

import hu.webler.bootstrap.DataInitializer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@DisplayName("Unit test of StreamExample10")
public class StreamExample10Test {

    private DataInitializer dataInitializerMock;
    private StreamExample10 streamExample10;

    @BeforeEach
    void setUp() {
        dataInitializerMock = mock(DataInitializer.class);
        streamExample10 = new StreamExample10(dataInitializerMock);
    }

    @Test()
    @DisplayName("StreamExample09 Test")
    void productOfNumbers_addCollection_returnProductOfElements() {
        // Arrange
        List<Integer> listOfNumbers = Arrays.asList(8, 2, 3, 4, 7, 12, 9);
        List<Integer> listOfNumbers2 = Arrays.asList(1, 0, 2, 100);

        when(dataInitializerMock.listOfIntegers1()).thenReturn(listOfNumbers);
        when(dataInitializerMock.listOfIntegers3()).thenReturn(listOfNumbers2);

        // Act
        String productOfElements = streamExample10.productOfNumbers(dataInitializerMock.listOfIntegers1());
        String productOfElementsIncludingZero = streamExample10.productOfNumbers(dataInitializerMock.listOfIntegers3());

        // Assert
        assertEquals("145152,00", productOfElements);
        assertEquals("0,00", productOfElementsIncludingZero);

    }
}
