package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {
    private static int testCounter = 0;

    @Before
    public void before() { System.out.println("Test Case: begin"); }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        // Given
        ArrayList<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        // When
        ArrayList<Integer> integers = oddNumbersExterminator.exterminate(numbers);
        // Then
        Assert.assertTrue(integers.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        // Given
        ArrayList<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        numbers.add(3);
        numbers.add(4);
        numbers.add(10);
        numbers.add(1);
        numbers.add(31);
        numbers.add(8);
        numbers.add(2);
        // When
        ArrayList<Integer> evenNumbersList = oddNumbersExterminator.exterminate(numbers);
        // Then
        Assert.assertTrue(evenNumbersList.size() != 0);
        for(Integer thenData: evenNumbersList){
            Assert.assertTrue(thenData % 2 == 0);
        }

    }
}