package me.boukadi.structural.adapter.implementation2.code;

public class AdapterImpl2 implements Standard {
    private OldImpl old = new OldImpl();

    @Override
    public void operation(int a, int b) {
        int results = old.multiply(a, b);
        old.show(results);
    }
}
