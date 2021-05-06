package me.boukadi.behavioral.strategy.implementation2;

public class App {
    public static void main(String[] args) {
        Context ctx = new Context();
        ctx.seStrategy(new IStrategyImpl2());
        ctx.applyStrategy();

    }
}
