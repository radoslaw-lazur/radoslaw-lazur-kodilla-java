package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

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

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        // Given
        ArrayList<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        // When
        for(Integer evenNumberList: oddNumbersExterminator.exterminate(numbers)){
            System.out.println(evenNumberList);
        }
        if(numbers.isEmpty()){
            System.out.println("The List numbers is empty");
        }
        // Then
        Assert.assertTrue(numbers.isEmpty());
        Assert.assertTrue(oddNumbersExterminator.exterminate(numbers).isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        // Given
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(10);
        numbers.add(1);
        numbers.add(31);
        numbers.add(8);
        numbers.add(2);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        // When
        for(Integer evenNumbersList: oddNumbersExterminator.exterminate(numbers)){
            System.out.println(evenNumbersList);
        }
        // Then
        Assert.assertTrue(numbers.size() != 0);
        for(Integer evenNumberList: oddNumbersExterminator.exterminate(numbers)){
            Assert.assertTrue(evenNumberList % 2 == 0);
        }
        for(Integer evenNumberList: oddNumbersExterminator.exterminate(numbers)){
            Assert.assertFalse(evenNumberList % 2 != 0);
        }
    }
}
