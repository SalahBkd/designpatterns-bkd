package me.boukadi.behavioral.observer.implementation2;

public class ObserverImpl2 implements Observer {
    private double lastState = 0;
    @Override
    public void update(/*int etat*/ Observable observable) {
        int etat = ((ObservableImpl1)observable).getEtat(); // pull technique
        System.out.println("observer2 got updated !");
        if(etat - lastState > 0)
            System.out.printf("observer 2, augmentation !");
        else if(etat - lastState < 0)
            System.out.println("observer 2, depression !");
        else
            System.out.println("observer 2, stability !");
        lastState = etat;
    }
}
