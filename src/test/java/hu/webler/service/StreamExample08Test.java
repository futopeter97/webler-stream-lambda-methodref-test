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

@DisplayName("Unit test of StreamExample08")
public class StreamExample08Test {

    private DataInitializer dataInitializerMock;
    private  StreamExample08 streamExample08;

    @BeforeEach
    void setUp() {
        dataInitializerMock = mock(DataInitializer.class);
        streamExample08 = new StreamExample08(dataInitializerMock);
    }

    @Test()
    @DisplayName("StreamExample08 Test")
    void numbersBiggerThan_addCollection_returnNumbersBiggerThanGivenNumber() {
        // Arrange
        List<Integer> listOfNums1 = Arrays.asList(8, 2, 3, 4, 7, 12, 9);
        List<Integer> listOfFilteredNumbers = Arrays.asList(8, 3, 4, 7, 12, 9);
        when(dataInitializerMock.listOfIntegers2()).thenReturn(listOfNums1);

        // Act
        int givenNumber = 2;
        Collection<Integer> listFilteredGreaterThanGivenNumber = streamExample08
                .numbersBiggerThan(dataInitializerMock.listOfIntegers2(),givenNumber);

        // Assert
        assertEquals(listOfFilteredNumbers, listFilteredGreaterThanGivenNumber);
    }
}
