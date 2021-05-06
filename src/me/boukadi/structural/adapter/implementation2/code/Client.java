package me.boukadi.structural.adapter.implementation2.code;

public class Client {

    private Standard standard;

    public void process(int a, int b) {
        System.out.println("DOING SOMETHING......");
        standard.operation(a, b);
        System.out.println("DOING SOMETHING ELSE.........");

    }

    public void setStandard(Standard standard) {
        this.standard = standard;
    }
}
