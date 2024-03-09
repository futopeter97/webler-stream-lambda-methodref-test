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

@DisplayName("Unit test of StreamExample05")
public class StreamExample05Test {

    private DataInitializer dataInitializerMock;
    private StreamExample05 streamExample05;

    @BeforeEach
    void setUP() {
        dataInitializerMock = mock(DataInitializer.class);
        streamExample05 = new StreamExample05(dataInitializerMock);
    }

    @Test()
    @DisplayName("StreamExample05 test")
    void filterEven_addCollection_returnEvenFilteredNums() {
        // Arrange
        List<Integer> listOfNums1 = Arrays.asList(1, 2, 3, 4, 7);
        List<Number> listOfNums2 = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
        List<Integer> listOfFilteredNums1 = Arrays.asList(2, 4);
        List<Double> listOfFilteredNums2 = Arrays.asList(2.2, 4.4);

        when(dataInitializerMock.listOfIntegers1()).thenReturn(listOfNums1);
        when(dataInitializerMock.listOfNumbers1()).thenReturn(listOfNums2);

        //Act
        Collection<Integer> evenFilteredIntegerNums = streamExample05.filterEven(dataInitializerMock.listOfIntegers1());
        Collection<Number> evenFilteredDoubleNums = streamExample05.filterEven(dataInitializerMock.listOfNumbers1());

        // Assert
        assertEquals(listOfFilteredNums1, evenFilteredIntegerNums);
        assertEquals(listOfFilteredNums2, evenFilteredDoubleNums);
    }
}
