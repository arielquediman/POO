package com.company;

import java.util.ArrayList;
import java.util.List;

public class Vagon {
    private List<Figura> figuras;

    public Vagon() {
        figuras = new ArrayList<>();
    }

    public void agregarFiguras(String nombre){
        figuras.add(FiguraFactory.getInstance().crearFigura(nombre));
    }

    public Double superficieTotal(){
        Double sumaDeAreas = 0.0;
        for (Figura figura : figuras) {
            sumaDeAreas += figura.informarArea();
        }
        System.out.println("La superficie total de todas las figuras es: ");
        return sumaDeAreas;
    }

}
