package com.company;

public class OfertaAcademicaFactory {

    private static OfertaAcademicaFactory instance;

    private OfertaAcademicaFactory(){

    }

    public static OfertaAcademicaFactory getInstance() {
        if(instance == null){
            instance = new OfertaAcademicaFactory();
        }
        return instance;
    }

    public OfertaAcademica crearOfertaAcademica(String nombreCurso) throws FactoryException{
        switch (nombreCurso){
            case "Front" :
                return new Curso("FrontEnd","abc",16,2,1000.0);
            case "Back" :
                return new Curso("BackEnd","abc",20,2,900.0);
            case "Full" :
                ProgramaIntesivo programaIntesivo = new ProgramaIntesivo("Full Stack", "abc",0.2);
                programaIntesivo.agregarOfertaAcademica(crearOfertaAcademica("Front"));
                programaIntesivo.agregarOfertaAcademica(crearOfertaAcademica("Back"));
                return programaIntesivo;
            default:
                throw new FactoryException("El codigo: '" + nombreCurso +  "' no es válido");
        }
    }


}
