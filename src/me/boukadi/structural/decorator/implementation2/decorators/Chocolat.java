package me.boukadi.structural.decorator.implementation2.decorators;

import me.boukadi.structural.decorator.implementation2.componants.Boisson;

public class Chocolat extends DecoratorAbstract {

    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 2 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " Au Chocolat";
    }
}
