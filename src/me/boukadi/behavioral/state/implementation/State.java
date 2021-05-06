package me.boukadi.behavioral.state.implementation;

public abstract class State {
    protected AvionImpl avion;

    public State(AvionImpl avion) {
        this.avion = avion;
    }

    public abstract void executeEntrerAuGarage();
    public abstract void executeSortirDuGarage();
    public abstract void executeDecoller();
    public abstract void executeAtterir();
    public abstract void executeDoActivity();
}
