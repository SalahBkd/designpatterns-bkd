package me.boukadi.behavioral.observer.implementation1;

public class TestDataSource {
    public static void main(String[] args) {
        var dataSource = new DataSource();
        var spreadSheet = new SpreadSheet(dataSource);
        var chart = new Chart(dataSource);

        dataSource.addObserver(spreadSheet);
        dataSource.addObserver(chart);

        dataSource.setValue(10);
    }
}
