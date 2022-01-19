package com.company;

import java.util.ArrayList;
import java.util.List;

public class FigurasComposite implements Figura {
    private List<Figura> conjuntoDeFiguras;

    public FigurasComposite() {
        conjuntoDeFiguras = new ArrayList<>();
    }

    public void agregarFiguras(Figura figura) {
        conjuntoDeFiguras.add(figura);
    }

    @Override
    public Double informarArea() {
        Double sumaAreas = 0.0;
        for (Figura figura : conjuntoDeFiguras) {
            sumaAreas += figura.informarArea();
        }
        return sumaAreas;
    }
}

