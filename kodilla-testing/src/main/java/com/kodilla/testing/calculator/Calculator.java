package com.kodilla.testing.calculator;

public class Calculator {

    private int a, b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int addAToB(){
        return a + b;
    }

    public int substractAFromB(){
        return a - b;
    }
}
