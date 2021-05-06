package me.boukadi.behavioral.observer.implementation2;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl1 implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private int etat = 0;
    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            // Push Technique
            //o.update(etat);

            // Pull technique
            o.update(this);
        }
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
        this.notifyObservers();
    }
}
