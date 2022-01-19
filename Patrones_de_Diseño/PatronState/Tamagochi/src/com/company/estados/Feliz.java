package com.company.estados;

import com.company.Estado;

public class Feliz implements Estado {


    @Override
    public Estado beber() {
        return new Hambriento();
    }

    @Override
    public Estado comer() {
        return new Sediento();
    }

    @Override
    public Estado mimar() {
        return this;
    }

    @Override
    public String toString() {
        return "Estoy feliz";
    }
}
