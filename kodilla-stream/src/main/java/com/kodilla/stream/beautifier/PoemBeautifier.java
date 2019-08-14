package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public static String addAAAInFrontAndBehind(String text){
        return "AAA" + text + "AAA";
    }
    public static String addExclamation(String text){
        return text + "!";
    }

    public void beautify(String textToProcess, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(textToProcess);
        System.out.println("The result is: " + result);
    }
}
