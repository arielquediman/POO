package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        esPrimo(num);
    }
    public static void esPrimo(int num) {
        if (num <= 1){
            System.out.println("No es primo");
        } else {
            int contadorPrimos = 0;
            for (Integer i = 1; i <= num; i++) {
                if (num % i == 0) {
                    contadorPrimos = contadorPrimos + 1;
                }
            }
            if (contadorPrimos == 2) {
                System.out.println("Es primo");
            } else {
                System.out.println("No es primo");
            }
        }
    }
}
