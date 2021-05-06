package me.boukadi.behavioral.state.implementation;

public class AvionImpl implements Avion {
    private State state;

    public AvionImpl() {
        state = new EnPiste(this);
    }

    @Override
    public void entrerAuGarage() {
        state.executeEntrerAuGarage();
    }

    @Override
    public void sortirDuGarage() {
        state.executeSortirDuGarage();
    }

    @Override
    public void decoller() {
        state.executeDecoller();
    }

    @Override
    public void atterir() {
        state.executeAtterir();
    }

    @Override
    public void doActivity() {
        state.executeDoActivity();
    }

    public void setState(State state) {
        this.state = state;
    }
}
