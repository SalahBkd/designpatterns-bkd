package me.boukadi.structural.composite.implementation;

public abstract class Componant {
    protected String name;
    protected int level = 0;

    public Componant(String name) {
        this.name = name;
    }

    public abstract void show();

    public String tab() {
        String tabs = "";
        for (int i = 0; i < level; i++) {
            tabs += "\t";
        }
        return tabs;

    }

}
