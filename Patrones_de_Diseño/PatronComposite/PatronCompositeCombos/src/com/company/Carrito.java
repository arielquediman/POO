package com.company;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Comprable> productos;

    public Carrito() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(String productoCombo){
        try {
            productos.add(ComprableFactory.getInstance().crearComprable(productoCombo));
        } catch (FactoryException e) {
            System.out.println(e.getMessage());
        }
    }

    public Double calcularPrecioTotal(){
        Double sumaTotal = 0.0;
        for (Comprable producto : productos) {
            sumaTotal += producto.informarPrecio();
        }
        return sumaTotal;
    }
}
