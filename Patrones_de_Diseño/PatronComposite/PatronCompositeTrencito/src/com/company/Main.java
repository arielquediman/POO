package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vagon vagon = new Vagon(); // en vez de vagon, deberia llamarse componente, q se yo xD
        Vagon locomotora = new Vagon();
        vagon.agregarFiguras("Vagon");
        System.out.println(vagon.superficieTotal());
        locomotora.agregarFiguras("Locomotora");
        System.out.println(locomotora.superficieTotal());
    }
}
