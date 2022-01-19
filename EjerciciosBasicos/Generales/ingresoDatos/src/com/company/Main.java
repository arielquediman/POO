package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        String nombre;
        String apellido;
        char inicial;
        String iniciales;
        System.out.println("Ingrese su nombre");
        nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = scanner.nextLine();
        iniciales = Character.toString(nombre.charAt(0)) + Character.toString(apellido.charAt(0));
        System.out.println(iniciales);
    }
}


