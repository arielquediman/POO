package com.company;

import java.util.ArrayList;
import java.util.List;

public class ProgramaIntesivo extends OfertaAcademica{

    private Double bonificacion;
    private List<OfertaAcademica> ofertasAcademicas;

    public ProgramaIntesivo(String nombre, String descripcion, Double bonificacion) {
        super(nombre, descripcion);
        this.bonificacion = bonificacion;
        ofertasAcademicas = new ArrayList<>();
    }

    public void agregarOfertaAcademica(OfertaAcademica ofertaAcademica){

        ofertasAcademicas.add(ofertaAcademica);
    }


    @Override
    public Double informarPrecio() {
        Double precioTotal = 0.0;
        for (OfertaAcademica ofertaAcademica : ofertasAcademicas) {
            precioTotal += ofertaAcademica.informarPrecio();
        }
        precioTotal -= precioTotal*bonificacion;
        return precioTotal ;
    }
}
