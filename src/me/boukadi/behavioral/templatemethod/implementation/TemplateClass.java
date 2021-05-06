package me.boukadi.behavioral.templatemethod.implementation;

public abstract class TemplateClass {
    public int templateOperation() {
        int a = abstractOperation1();
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum += abstractOperation2();
        }
        return sum;
    }

    protected abstract int abstractOperation1();
    protected abstract int abstractOperation2();
}
