package com.company.estados;

import com.company.Estado;

public class Hambriento implements Estado {


    @Override
    public Estado beber() {
        return this;
    }

    @Override
    public Estado comer() {
        return new Feliz();
    }

    @Override
    public Estado mimar() {
        return this;
    }

    @Override
    public String toString() {
        return "Dame comidaaaa...";
    }
}
