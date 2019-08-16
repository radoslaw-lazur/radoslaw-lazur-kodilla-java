package com.kodilla.stream.array;

import java.util.stream.IntStream;

public final class ArrayTask implements ArrayOperations {

    public double getAverage(int[] numbers){
        IntStream.range(0, numbers.length )
                .map(n -> numbers[n])
                .forEach(System.out::println);
        return IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average()
                .getAsDouble();
    }
}
