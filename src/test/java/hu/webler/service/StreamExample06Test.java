package hu.webler.service;

import hu.webler.bootstrap.DataInitializer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@DisplayName("Unit test of StreamExample06")
public class StreamExample06Test {

    private DataInitializer dataInitializerMock;
    private StreamExample06 streamExample06;

    @BeforeEach
    void setUp() {
        dataInitializerMock = mock(DataInitializer.class);
        streamExample06 = new StreamExample06(dataInitializerMock);
    }

    @Test
    @DisplayName("StreamExample06 Test")
    void squareRootOfNumbers_addCollection_returnSqrtOfElements() {
        // Arrange
        List<Integer> listOfNums1 = Arrays.asList(1, 2, 3, 4, 7);
        List<Number> listOfNums2 = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
        List<String> filteredNumbersTest1 = Arrays.asList("1,00", "1,41", "1,73", "2,00", "2,65");
        List<String> filteredNumbersTest2 = Arrays.asList("1,05", "1,48", "1,82", "2,10", "2,35");

        when(dataInitializerMock.listOfIntegers1()).thenReturn(listOfNums1);
        when(dataInitializerMock.listOfNumbers1()).thenReturn(listOfNums2);

        // Act
        Collection<String> sqrtOfIntElements = streamExample06
                .squareRootOfNumbers(dataInitializerMock.listOfIntegers1());
        Collection<String> sqrtOfDoubleElements = streamExample06
                .squareRootOfNumbers(dataInitializerMock.listOfNumbers1());

        // Assert
        assertEquals(filteredNumbersTest1, sqrtOfIntElements);
        assertEquals(filteredNumbersTest2,sqrtOfDoubleElements);
    }
}
