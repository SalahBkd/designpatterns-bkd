package me.boukadi.structural.decorator.implementation2.componants;

public class Espresso extends Boisson {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cout() {
        return 12;
    }



}
