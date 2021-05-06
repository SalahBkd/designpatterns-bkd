package me.boukadi.behavioral.observer.implementation1;

public class StockListView implements Observer {
    Stock stock;

    public StockListView(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void update() {
        System.out.println("stocklistview got updated: " + stock.getValue());
    }
}
