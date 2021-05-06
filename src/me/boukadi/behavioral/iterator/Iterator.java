package me.boukadi.behavioral.iterator;

public interface Iterator {
    void next();
    Product current();
    boolean hasNext();
}
