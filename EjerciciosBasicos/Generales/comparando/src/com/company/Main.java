package com.company;

public class Main {

    public static void main(String[] args) {
        Integer valor1 = 40;
        Integer valor2 = 30;
        int comparar;
        if (valor1.equals(valor2)) {
            System.out.println("Son iguales");
        } else {
            comparar = valor1.compareTo(valor2);
            if (comparar > 0) {
                System.out.println("Valor1 es mayor que valor2");
            } else {
                System.out.println("Valor2 es mayor que valor1");
            }
        }
    }
}
