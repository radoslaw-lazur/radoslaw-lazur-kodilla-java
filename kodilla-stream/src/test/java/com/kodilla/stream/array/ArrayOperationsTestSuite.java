package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        // Given
        int[] arrayWithNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9,
                10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        // When
       ArrayTask arrayTask = new ArrayTask();
       double test = arrayTask.getAverage(arrayWithNumbers);
       System.out.println(test);
       System.out.println();
       //Then
       Assert.assertEquals(10.5, test,0);
    }
}
