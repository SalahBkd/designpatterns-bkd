package me.boukadi.structural.proxy.implementation;

public class Test {
    public static void main(String[] args) {
        Client client = new Client();
        client.setProxy(new ProxyImpl());
        client.clientProcess();

        // USE CASES
        // Spring Framework (Security, @Transactional, @Cacheable)
    }
}
