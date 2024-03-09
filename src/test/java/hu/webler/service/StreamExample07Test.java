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

@DisplayName("Unit test of StreamExample07")
public class StreamExample07Test {

    private DataInitializer dataInitializerMock;
    private StreamExample07 streamExample07;

    @BeforeEach
    void setUp() {
        dataInitializerMock = mock(DataInitializer.class);
        streamExample07 = new StreamExample07(dataInitializerMock);
    }

    @Test()
    @DisplayName("StreamExample07 Test")
    void divisibleByThree_addCollection_returnDivisibleByThreeNums() {
        // Arrange
        List<Integer> listOfNums1 = Arrays.asList(8, 2, 3, 4, 7, 12, 9);
        List<Integer> listOfFilteredNumbers = Arrays.asList(3, 12, 9);
        when(dataInitializerMock.listOfIntegers2()).thenReturn(listOfNums1);

        // Act
        Collection<Integer> listFilteredDivisibleByThree2 = streamExample07.
                numbersDivisibleByThree(dataInitializerMock.listOfIntegers2());

        // Assert
        assertEquals(listOfFilteredNumbers, listFilteredDivisibleByThree2);
    }
}
