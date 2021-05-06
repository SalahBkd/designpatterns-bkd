package me.boukadi.structural.decorator.implementation2.componants;

public abstract class Boisson {
    protected String description;

    public abstract double cout();
    public String getDescription() {
        return description;
    }
}
