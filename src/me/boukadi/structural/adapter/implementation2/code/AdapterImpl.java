package me.boukadi.structural.adapter.implementation2.code;

public class AdapterImpl extends OldImpl implements Standard {

    @Override
    public void operation(int a, int b) {
        int results = multiply(a, b);
        show(results);
    }
}
