package me.boukadi.behavioral.observer.implementation2;

public class ObserverImpl1 implements Observer {
    private double sum = 0;
    @Override
    public void update(/*int etat2,*/ Observable observable) {
        int etat = ((ObservableImpl1)observable).getEtat(); // pull technique
        sum += etat;
        System.out.println("observer1 state got updated !");
    }
}
