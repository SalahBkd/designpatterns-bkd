package me.boukadi.behavioral.state.implementation;

public class EnPiste extends State {
    public EnPiste(AvionImpl avion) {
        super(avion);
    }

    @Override
    public void executeEntrerAuGarage() {
        System.out.println("From Piste to Garage...!");
        avion.setState(new AuGarage(avion));
    }

    @Override
    public void executeSortirDuGarage() {
        System.out.println("Impossible, i'am in Piste...!");
    }

    @Override
    public void executeDecoller() {
        System.out.println("From Piste to Air...!");
        avion.setState(new EnAir(avion));
    }

    @Override
    public void executeAtterir() {
        System.out.println("Impossible, i'am in Piste...!");
    }

    @Override
    public void executeDoActivity() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Doing En Piste Activity..."+ i);
        }
    }
}
