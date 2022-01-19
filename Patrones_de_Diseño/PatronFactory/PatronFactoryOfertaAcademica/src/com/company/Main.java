package com.company;

public class Main {

    public static void main(String[] args) {

        Instituto instituto = new Instituto();

        instituto.agregarOfertaAcademica("Front");
        instituto.agregarOfertaAcademica("Back");
        instituto.agregarOfertaAcademica("Full");
        instituto.agregarOfertaAcademica("IOs Developer");

        instituto.generarInforme();

    }
}
