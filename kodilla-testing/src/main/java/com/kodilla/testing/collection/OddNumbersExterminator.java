package com.kodilla.testing.collection;


import java.util.ArrayList;

public class OddNumbersExterminator {

   private ArrayList<Integer> evenNumbers = new ArrayList<>();

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) % 2 == 0){
                evenNumbers.add(numbers.get(i));
            }
        }
        return evenNumbers;
    }
}

