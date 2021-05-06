package me.boukadi.structural.decorator.implementation2.componants;

public class Tea extends Boisson {

    public Tea() {
        description = "Tea";
    }

    @Override
    public double cout() {
        return 18;
    }



}
