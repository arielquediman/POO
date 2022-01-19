package com.company;

public class Main {

    public static void main(String[] args) {
        Carrito carrito = new Carrito(); //instanciamos
        carrito.agregarProducto("Sandwich");
        carrito.agregarProducto("Combo1");
        carrito.agregarProducto("Papas");
        carrito.agregarProducto("Combo3");
        carrito.agregarProducto("Chocolate");
        System.out.println(carrito.calcularPrecioTotal());

    }
}
