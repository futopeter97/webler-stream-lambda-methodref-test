package hu.webler.service;

import hu.webler.bootstrap.DataInitializer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@DisplayName("Unit test of StreamExample02")
public class StreamExample02Test {

    private DataInitializer dataInitializerMock;
    private StreamExample02 streamExample02;

    @BeforeEach
    void setUp() {
        dataInitializerMock = mock(DataInitializer.class);
        streamExample02 = new StreamExample02(dataInitializerMock);
    }

    @Test
    @DisplayName("StreamExample02 test")
    void squareNumbers_addCollection_returnSquareOfElements() {
        // Arrange
        List<Integer> listOfNums1 = Arrays.asList(1, 2, 3, 4, 7);
        List<Number> listOfNums2 = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
        List<Integer> listOfSquareNums1 = Arrays.asList(1, 4, 9, 16, 49);
        List<Double> listOfSquareNums2 = Arrays.asList(1.21, 4.84, 10.89, 19.36, 30.25);

        when(dataInitializerMock.listOfIntegers1()).thenReturn(listOfNums1);
        when(dataInitializerMock.listOfNumbers1()).thenReturn(listOfNums2);

        // Act
        Collection<? extends Number> squareOfNums1 = streamExample02.squareNumbers(dataInitializerMock.listOfIntegers1());
        Collection<? extends Number> squareOfNums2 = streamExample02.squareNumbers(dataInitializerMock.listOfNumbers1());

        // Assert
        assertNotNull(squareOfNums1);
        assertEquals(5, squareOfNums1.stream().count());
        assertEquals(listOfSquareNums1,squareOfNums1);
        assertEquals(listOfSquareNums2, squareOfNums2);
    }
}
