package com.company;

public class FiguraFactory {
    private static FiguraFactory instance;

    private FiguraFactory() {

    }

    public static FiguraFactory getInstance() {
        if(instance == null) {
            instance = new FiguraFactory();
        }
        return instance;
    }

    public Figura crearFigura (String tipoDeFigura){
        switch (tipoDeFigura) {
            case "Vagon":
                FigurasComposite vagon = new FigurasComposite();
                vagon.agregarFiguras(new Rectangulo(5.0, 4.0));
                vagon.agregarFiguras(new Circulo(1.0));
                return vagon;
            case "Locomotora":
                FigurasComposite locomotora = new FigurasComposite();
                locomotora.agregarFiguras(new Rectangulo(6.0, 4.0));
                locomotora.agregarFiguras(new Circulo(1.0));
                locomotora.agregarFiguras(new Triangulo(2.0,2.0));
                return locomotora;
            default:
                System.out.println("Componente no valido");
                return null;
        }
    }

}
