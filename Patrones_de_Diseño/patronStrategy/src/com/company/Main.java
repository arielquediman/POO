package com.company;

public class Main {

    public static void main(String[] args) {
        Auto auto = new Auto();
        Camion camion = new Camion();
        Moto moto = new Moto();
        Lancha lancha = new Lancha();
        SuperChofer conducirAuto = new SuperChofer(new Auto());
        conducirAuto.acelerar();
        conducirAuto.frenar();
        SuperChofer conducirMoto = new SuperChofer(new Moto());
        conducirMoto.acelerar();
        conducirAuto.frenar();
    }
}
