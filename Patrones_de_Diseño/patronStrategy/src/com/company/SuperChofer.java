package com.company;

public class SuperChofer {
    private Strategy vehiculo;

    public SuperChofer(Strategy vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void acelerar(){
        vehiculo.acelerar();
    }

    public void frenar(){
        vehiculo.frenar();
    }

}
