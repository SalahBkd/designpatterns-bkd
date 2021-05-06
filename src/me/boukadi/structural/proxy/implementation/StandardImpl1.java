package me.boukadi.structural.proxy.implementation;

public class StandardImpl1 implements Standard {

    // sometimes we need to secure the access to this method
    @Override
    public void process() {
        System.out.println("****************************");
        System.out.println("Processing from StandardImpl1...!");
        System.out.println("****************************");
    }
}
