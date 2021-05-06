package me.boukadi.structural.adapter.implementation2.code;

public class Test {
    public static void main(String[] args) {
        Client client = new Client();
        // how we change the standard implementation without affecting Client source code ?
        // use Adapter pattern
        //client.setStandard(new StandardImpl());
        //client.setStandard(new AdapterImpl()); // INHERITANCE BASED SOLUTION
        client.setStandard(new AdapterImpl2()); // COMPOSITION BASED SOLUTION
        client.process(10, 10);

    }
}
