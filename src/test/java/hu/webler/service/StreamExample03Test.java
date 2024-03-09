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

@DisplayName("Unit test of StreamExample03")
public class StreamExample03Test {

    private DataInitializer dataInitializerMock;
    private StreamExample03 streamExample03;

    @BeforeEach
    void setUp() {
        dataInitializerMock = mock(DataInitializer.class);
        streamExample03 = new StreamExample03(dataInitializerMock);
    }

    @Test
    @DisplayName("StreamExample03 Sumelements Collection Test")
    void sumElementsMoreGeneric_addCollection_ReturnSum() {
        // Arrange
        List<Integer> listOfNums1 = Arrays.asList(1, 2, 3, 4, 7);
        List<Number> listOfNums2 = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);

        when(dataInitializerMock.listOfIntegers1()).thenReturn(listOfNums1);
        when(dataInitializerMock.listOfNumbers1()).thenReturn(listOfNums2);

        // Act
        Integer sumOfElements1 = streamExample03.sumElementsMoreGeneric(listOfNums1);
        Number sumOfElements2 = streamExample03.sumElementsMoreGeneric(listOfNums2);

        // Assert
        assertEquals(17, sumOfElements1);
        assertEquals(16.5,sumOfElements2);

    }

    @Test
    @DisplayName("StreamExample03 Sumelements List test")
    void sumElements_addList_returnSum() {
        // Arrange
        List<Integer> nums1 = Arrays.asList(1, 2, 3, 4, 7);
        List<Number> nums2 = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);

        when(dataInitializerMock.listOfIntegers1()).thenReturn(nums1);
        when(dataInitializerMock.listOfNumbers1()).thenReturn(nums2);

        // Act
        int sumOfElements1 = (int) streamExample03.sumElements(dataInitializerMock.listOfIntegers1());
        double sumOfElements2 = streamExample03.sumElements(dataInitializerMock.listOfNumbers1());

        // Assert
        assertEquals(17, sumOfElements1);
        assertEquals(16.5,sumOfElements2);
    }


}
