package com.kodilla.exception.nullpointer;

public class NullPointerExceptionRunner {
    public static void main(String[] args) {
        User user = new User("Radek");

        MessageSender messageSender = new MessageSender();
        try {
            messageSender.sendMessageTo(user, "Hello!");
        } catch (MessageNotSentException e){
            System.out.println("Message is not sent but....");

            System.out.println("Processing other logic");
        }
    }
}
