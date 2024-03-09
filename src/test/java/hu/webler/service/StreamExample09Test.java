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

@DisplayName("Unit test of StreamExample09")
public class StreamExample09Test {

    private DataInitializer dataInitializerMock;
    private StreamExample09 streamExample09;

    @BeforeEach
    void setUp() {
        dataInitializerMock = mock(DataInitializer.class);
        streamExample09 = new StreamExample09(dataInitializerMock);
    }

    @Test()
    @DisplayName("StreamExample08 Test")
    void filterUnevenBiggerThan_addCollection_returnUnevenBiggerThanGivenNumber() {
        // Arrange
        List<Integer> listOfNumbers = Arrays.asList(8, 2, 3, 4, 7, 12, 9);
        List<Integer> listOfFilteredNumbers = Arrays.asList(3, 7, 9);
        when(dataInitializerMock.listOfIntegers2()).thenReturn(listOfNumbers);

        // Act
        int givenNumber = 2;
        Collection<Integer> ListFilteredOddAndBiggerThanValue = streamExample09
                .filterUnevenBiggerThan(dataInitializerMock.listOfIntegers2(),givenNumber);

        // Assert
        assertEquals(listOfFilteredNumbers, ListFilteredOddAndBiggerThanValue);
    }
}
