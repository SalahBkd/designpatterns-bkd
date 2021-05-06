package me.boukadi.structural.decorator.implementation1;

public class CloudStream implements Stream {
    @Override
    public void write(String data) {
        System.out.println("storing: " +data);
    }
}
