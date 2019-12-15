package com.kodilla.patterns2.observer.homework;

public class Pupil implements Observer {
    private final String pupilName;
    private int homeworks;

    public Pupil(String pupilName) {
        this.pupilName = pupilName;
    }


    @Override
    public void update(Mentor mentor) {
        System.out.println(mentor.getName() + ": New homework to check from " + pupilName + "\n" +
                " (total: " + (mentor.getHomeworsks().size() <= 1 ? " homework: " : " homeworks: ") +
                mentor.getHomeworsks().size() +")");
        mentor.getHomeworsks().forEach(System.out::println);
        homeworks++;
    }

    public int getHomeworks() {
        return homeworks;
    }
}
