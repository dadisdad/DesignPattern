package com.java.designpattrn.pattern.observer.ex2;

import java.util.Vector;

/**
 * @author dadisdad
 * @date 2018/4/17
 */
public abstract class Subject {

    private Vector<Observer> observers = new Vector<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }
}
