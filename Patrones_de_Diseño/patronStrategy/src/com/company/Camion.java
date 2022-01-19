package com.company;

public class Camion implements Strategy{
    @Override
    public void acelerar() {
        System.out.println("Camión: acelerando...");
    }

    @Override
    public void frenar() {
        System.out.println("Camión: frenando...");
    }
}
