package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ingresoCadena = new Scanner(System.in);
        System.out.println("Ingrese primer cadena a comparar");
        String primerCadena = ingresoCadena.nextLine();
        System.out.println("Ingrese segunda cadena a comparar");
        String segundaCadena = ingresoCadena.nextLine();
        System.out.println(cadenasDeTextoDistintas(primerCadena, segundaCadena));
    }
    public static boolean cadenasDeTextoDistintas(String primerCadena, String segundaCadena) {
        if(primerCadena.toUpperCase().equals(segundaCadena.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}
