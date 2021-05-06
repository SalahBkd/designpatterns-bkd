package me.boukadi.behavioral.state.implementation;

public class AuGarage extends State {

    public AuGarage(AvionImpl avion) {
        super(avion);
    }

    @Override
    public void executeEntrerAuGarage() {
        System.out.println("Impossoble, already in Garage...!");
    }

    @Override
    public void executeSortirDuGarage() {
        System.out.println("From Garage to Piste...!");
        avion.setState(new EnPiste(avion));
    }

    @Override
    public void executeDecoller() {
        System.out.println("Impossible, i'am on Garage...!");
    }

    @Override
    public void executeAtterir() {
        System.out.println("Impossible, i'am on Garage...!");
    }

    @Override
    public void executeDoActivity() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Doing Au Garage Activity..."+ i);
        }
    }
}
