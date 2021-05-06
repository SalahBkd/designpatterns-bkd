package me.boukadi.behavioral.templatemethod.implementation;

public class TemplateImpl1 extends TemplateClass{
    @Override
    protected int abstractOperation1() {
        return 5;
    }

    @Override
    protected int abstractOperation2() {
        return 10;
    }
}
