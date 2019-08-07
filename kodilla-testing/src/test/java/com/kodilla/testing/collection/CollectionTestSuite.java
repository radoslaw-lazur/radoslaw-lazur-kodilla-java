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
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(evenNumbers);
        oddNumbersExterminator.exterminate(numbers);

        System.out.println("Testing empty collections" + " numbers size: "
                + numbers.size() + " evenNumber size: " + evenNumbers.size());

        for(Integer data: evenNumbers){
            System.out.println(data);
        }

        Assert.assertTrue(numbers.isEmpty() && evenNumbers.isEmpty());

    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(10);
        numbers.add(1);
        numbers.add(31);
        numbers.add(8);
        numbers.add(2);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(evenNumbers);
        oddNumbersExterminator.exterminate(numbers);

        System.out.println("Testing normal collections" + " numbers size: "
                + numbers.size() + " evenNumbers size: " + evenNumbers.size());

        for(Integer data: evenNumbers){
            System.out.println(data);
        }

        for (Integer evenNumber : evenNumbers) {
            Assert.assertTrue(numbers.size() != 0 && evenNumber % 2 == 0);
        }
    }
}
