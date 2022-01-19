package com.company;

public class Moto implements Strategy{
    @Override
    public void acelerar() {
        System.out.println("Moto: acelerando...");
    }

    @Override
    public void frenar() {
        System.out.println("Moto: frenando...");
    }
}
