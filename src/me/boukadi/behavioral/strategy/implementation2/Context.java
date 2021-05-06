package me.boukadi.behavioral.strategy.implementation2;

public class Context {
    IStrategy strategy = null;
    public void applyStrategy(/*int type*/) {
        /* BAD: open for modification
        if(level == 0) {
            System.out.println("apply initial strategy");
        } else if(level == 1) {
            System.out.println("apply level 1 stragey");
        } else {
            System.out.println("apply default strategy");
        }*/

        // GOOD: loose coupling, open for extension
        System.out.println("Doing some other logic...this part is static will remain");
        this.strategy.applyStrategy(); // this part is dynamic, externalize it with strategy DP.
        System.out.println("doing some other logic...this part is static will remain");
    }

    public void seStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}
