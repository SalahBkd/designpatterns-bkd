package me.boukadi.behavioral.strategy.implementation1;

public class DESAlgorithm implements Algorithm {
    @Override
    public void encrypt() {
        System.out.println("encrypting with DES");
    }
}
