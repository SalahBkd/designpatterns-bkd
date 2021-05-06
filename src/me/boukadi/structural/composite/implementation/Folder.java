package me.boukadi.structural.composite.implementation;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Componant {
    List<Componant> childs = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public Componant add(Componant child) {
        child.level = this.level + 1;
        childs.add(child);
        return child;
    }

    @Override
    public void show() {
        System.out.println(tab() + "Folder: " + name);
        for(Componant child : childs)
            child.show();
    }
}
