package com.kodilla.testing.collection;


import java.util.ArrayList;

public class OddNumbersExterminator {

   private ArrayList<Integer> evenNumbers;

    public OddNumbersExterminator(ArrayList<Integer> evenNumbers) {
        this.evenNumbers = evenNumbers;
    }

    public void exterminate(ArrayList<Integer> numbers){
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) % 2 == 0){
                evenNumbers.add(numbers.get(i));
            }
        }
    }
}
