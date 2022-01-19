package com.company.estados;

import com.company.Estado;

public class Sediento implements Estado {


    @Override
    public Estado beber() {
        return new Feliz();
    }

    @Override
    public Estado comer() {
        return this;
    }

    @Override
    public Estado mimar() {
        return this;
    }

    @Override
    public String toString() {
        return "Tengo sed...";
    }
}
