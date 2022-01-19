package com.company;

public class Auto implements Strategy{
    @Override
    public void acelerar() {
        System.out.println("Auto: acelerando...");
    }

    @Override
    public void frenar() {
        System.out.println("Auto: frenando...");
    }
}
