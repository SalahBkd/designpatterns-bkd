package me.boukadi.structural.proxy.implementation;

public class ProxyImpl implements Standard {
    private StandardImpl1 standardImpl1;

    @Override
    public void process() {
        System.out.println("checking for valid credentials from proxyimpl...!");
        standardImpl1 = new StandardImpl1();
        System.out.println("Before Calling the process method...!");
        standardImpl1.process();
        System.out.println("After calling the process method...!");
    }
}
