package me.boukadi.structural.adapter.implementation2.code;

public class StandardImpl implements Standard {
    @Override
    public void operation(int a, int b) {
        System.out.println("***********************");
        System.out.println("Standard Results="+ a*b);
        System.out.println("***********************");

    }
}
