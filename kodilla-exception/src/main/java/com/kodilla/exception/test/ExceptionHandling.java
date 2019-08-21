package com.kodilla.exception.test;

public class ExceptionHandling  {
    public static void main(String[] args) {

        System.out.println("Task Module 8.3");
        SecondChallenge secondChallenge = new SecondChallenge();
        try{
            String stringException = secondChallenge.probablyIWillThrowException(1, 1.5);
            System.out.println(stringException);
        } catch (Exception e){
            System.out.println("Exception occured");
        } finally {
            System.out.println("finally");
        }
    }
}







