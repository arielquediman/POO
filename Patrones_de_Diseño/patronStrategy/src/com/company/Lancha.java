package com.company;

public class Lancha implements Strategy{
    @Override
    public void acelerar() {
        System.out.println("Lancha: acelerando...");

    }

    @Override
    public void frenar() {
        System.out.println("Lancha: frenando...");
    }
}
