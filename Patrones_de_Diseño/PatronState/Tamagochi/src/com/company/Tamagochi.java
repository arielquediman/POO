package com.company;

import com.company.estados.Triste;

public class Tamagochi {

    private String nombre;
    private Estado estadoActual;

    public Tamagochi(String nombre){
        this.nombre = nombre;
        estadoActual = new Triste();
    }

    public void darDeComer(){
        estadoActual = estadoActual.comer();
    }

    public void darDeTomar(){
        estadoActual = estadoActual.beber();
    }

    public void mimar(){
        estadoActual = estadoActual.mimar();

    }

    public void imprimiTuEstado(){
        System.out.println(estadoActual);
    }
}
