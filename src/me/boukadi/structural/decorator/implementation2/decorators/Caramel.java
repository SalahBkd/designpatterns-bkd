package me.boukadi.structural.decorator.implementation2.decorators;

import me.boukadi.structural.decorator.implementation2.componants.Boisson;

public class Caramel extends DecoratorAbstract {

    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 3 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " Au Caramel";
    }
}
