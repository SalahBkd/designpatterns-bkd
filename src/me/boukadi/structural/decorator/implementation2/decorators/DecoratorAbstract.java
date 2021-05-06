package me.boukadi.structural.decorator.implementation2.decorators;

import me.boukadi.structural.decorator.implementation2.componants.Boisson;

public abstract class DecoratorAbstract extends Boisson {
    protected Boisson boisson;

    public DecoratorAbstract(Boisson boisson2) {
        boisson = boisson2;
    }

    public abstract String getDescription();
}
