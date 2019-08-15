package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;


public class SteamMain {
    public static void main(String[] args) {

        Processor processor = new Processor();
        //ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
         Executor codeToExecute = () -> System.out.println("This is an example text");
        //processor.execute(executeSaySomething);
        processor.execute(codeToExecute);


        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, Double::sum);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAbyB);

        System.out.println("Kodilla Module 7.1 Task");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("aaa", String::toUpperCase);
        poemBeautifier.beautify("RANDOM-TEXT", String::toLowerCase);
        poemBeautifier.beautify("aaa", PoemBeautifier::addAAAInFrontAndBehind);
        poemBeautifier.beautify("Thomas", PoemBeautifier::addExclamation );

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }
}
