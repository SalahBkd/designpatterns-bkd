package me.boukadi.behavioral.state.implementation;

public class App {
    public static void main(String[] args) {
        AvionImpl avion = new AvionImpl();
        avion.doActivity();
        avion.atterir();
        avion.entrerAuGarage();
        System.out.println("*****************");
        avion.doActivity();
        avion.decoller();
        avion.sortirDuGarage();
        avion.decoller();
        System.out.println("*****************");
        avion.doActivity();
        avion.entrerAuGarage();
    }
}
