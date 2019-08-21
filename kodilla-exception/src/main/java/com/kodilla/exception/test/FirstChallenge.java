package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {

        try {
            if(b == 0){
                throw new ArithmeticException();
            }
        }
        catch (ArithmeticException ex) {
            System.out.println("You cannot divide by zero! Error: " + ex);
        } finally {
            System.out.println("When a == 0: NaN, b == 0: infinity");
        }

        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println("Result: " + result);

    }
}
