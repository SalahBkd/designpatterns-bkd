package me.boukadi.structural.composite.implementation;

public class File extends Componant {
    public File(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(tab() + "File: " + name);
    }


}
