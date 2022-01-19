package com.company;

public class Producto implements Comprable{

    private String nombre;
    private Double precio;

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public Double informarPrecio() {
        System.out.println("PROD: "+ nombre + " le sumo al total: " + precio);
        return precio;
    }

}
