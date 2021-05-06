package me.boukadi.behavioral.state.implementation;

public class EnAir extends State {
    public EnAir(AvionImpl avion) {
        super(avion);
    }

    @Override
    public void executeEntrerAuGarage() {
        System.out.println("Impossible, i'm on Air..!");
    }

    @Override
    public void executeSortirDuGarage() {
        System.out.println("Impossible, i'm on Air...!");
    }

    @Override
    public void executeDecoller() {
        System.out.println("Impossible, already on Air...!");
    }

    @Override
    public void executeAtterir() {
        System.out.println("From Air to Piste");
        avion.setState(new EnPiste(avion));
    }

    @Override
    public void executeDoActivity() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Doing En Air Activity..."+ i);
        }
    }
}
