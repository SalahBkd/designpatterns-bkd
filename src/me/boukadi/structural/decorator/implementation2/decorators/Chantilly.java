package me.boukadi.structural.decorator.implementation2.decorators;

import me.boukadi.structural.decorator.implementation2.componants.Boisson;

public class Chantilly extends DecoratorAbstract {

    public Chantilly(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 4 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " Au Chantilly";
    }
}
