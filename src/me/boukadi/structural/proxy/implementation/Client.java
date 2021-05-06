package me.boukadi.structural.proxy.implementation;

public class Client {
    private ProxyImpl proxy;
    public void clientProcess() {
        proxy.process();
    }

    public void setProxy(ProxyImpl proxy) {
        this.proxy = proxy;
    }
}
