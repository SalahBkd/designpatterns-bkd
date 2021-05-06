package me.boukadi.behavioral.strategy.implementation1;

public class AESAlgorithm implements  Algorithm {
    @Override
    public void encrypt() {
        System.out.println("encrypting with AES");
    }
}
