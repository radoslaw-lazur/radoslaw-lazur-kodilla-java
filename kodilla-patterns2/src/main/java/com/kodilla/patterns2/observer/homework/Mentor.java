package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.Deque;

public class Mentor implements Observable {
    private final Deque<Observer> observers;
    private final Deque<String> homeworsks;
    private final String name;

    public Mentor(String name) {
        observers = new ArrayDeque<>();
        homeworsks = new ArrayDeque<>();
        this.name = name;
    }

    public void sendHomework(String homework) {
        homeworsks.offer(homework);
        notifyObservers();
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.offer(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(t -> t.update(this));
    }

    public Deque<String> getHomeworsks() {
        return homeworsks;
    }

    public String getName() {
        return name;
    }
}
