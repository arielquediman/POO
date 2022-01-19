package com.company;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Comprable {

    private List<Comprable> productos;
    private Double descuento;

    public Combo(Double descuento) {
        this.descuento = descuento;
        productos = new ArrayList<>();
    }

    public void agregarProducto(Comprable comprable){
        productos.add(comprable);
    }

    @Override
    public Double informarPrecio() {
        Double sumaPrecios = 0.0;
        System.out.println("-------RECORRIENDO COMBO-----");
        for(Comprable comprable: productos){
            sumaPrecios += comprable.informarPrecio();
        }
        Double precioFinal = sumaPrecios - (sumaPrecios * descuento);
        System.out.println("-- El precio de los productos es de " + sumaPrecios + " con el descuento te queda" + precioFinal);
        return precioFinal;
    }
}
