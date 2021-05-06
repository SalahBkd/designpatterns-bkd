package me.boukadi.behavioral.observer.implementation1;

public class Chart implements Observer {
    DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("chart got updated"+ dataSource.getValue());
    }
}
