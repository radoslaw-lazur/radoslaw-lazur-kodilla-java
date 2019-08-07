package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){

        Calculator calculator = new Calculator(5, 5);


        // addAtoB method unit test
        if(calculator.addAToB() == 10) {
            System.out.println("The addAtoB method works properly");
        } else {
            System.out.println("The addAtoB method does not work properly");
        }

        // substractAFromB unit test
        if(calculator.substractAFromB() == 0) {
            System.out.println("The substractAFromB method works properly");
        } else {
            System.out.println("The substractAFromB method does not work properly");
        }
    }
}
