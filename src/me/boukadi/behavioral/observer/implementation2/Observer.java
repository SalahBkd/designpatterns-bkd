package me.boukadi.behavioral.observer.implementation2;

public interface Observer {
    //void update(int etat); // push technique
    void update(Observable observable); // pull technique
}
