package com.company.estados;

import com.company.Estado;

public class Triste implements Estado {


    @Override
    public Estado beber() {
        return this;
    }

    @Override
    public Estado comer() {
        return this;
    }

    @Override
    public Estado mimar() {
        return new Feliz();
    }

    @Override
    public String toString() {
        return "Estoy triste";
    }
}
