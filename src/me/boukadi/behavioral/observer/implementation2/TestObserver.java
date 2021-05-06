package me.boukadi.behavioral.observer.implementation2;

public class TestObserver {
    public static void main(String[] args) {
        ObservableImpl1 observable = new ObservableImpl1();
        ObserverImpl1 observer1 = new ObserverImpl1();
        ObserverImpl2 observer2 = new ObserverImpl2();
        observable.subscribe(observer1);
        observable.subscribe(observer2);

        observable.setEtat(100);
        observable.setEtat(50);

        //observable.unsubscribe(observer1);

        // usecases: message brokers, state management

    };
}
