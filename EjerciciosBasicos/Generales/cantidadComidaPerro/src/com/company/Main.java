package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del perro: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingresa cuanto come el perro: ");
        Double comidaParaEstarLleno = scanner.nextDouble();
        System.out.println(nombre + " come " + comidaParaEstarLleno + " por dia");
        Integer cantidadPaquetes = cuantosComio(comidaParaEstarLleno);
        System.out.println(nombre + " comio " + cantidadPaquetes + " paquetes");
    }

        public static Integer cuantosComio(Double comidaMinima){
            Double cuantosKilosVa = 0.0;
            Integer paquetes = 0;
            while (cuantosKilosVa < comidaMinima) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Ingrese el peso del paquete: ");
                Double pesoPaquete = scanner.nextDouble();
                cuantosKilosVa += pesoPaquete;
                paquetes++;
            }
            return paquetes;
        }
    }
