package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int limiteDeHorasTrabajadas = 40;
        final double porcentaje = 50;
        int horasTrabajadas;
        double sueldoSemanal, valorPorHorasExtras, valorPorHoraSemanal = 875.0, sueldoConHorasExtras;
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        horasTrabajadas = ingreso.nextInt();
        if ((horasTrabajadas > 0) && (horasTrabajadas <= limiteDeHorasTrabajadas)) {
            sueldoSemanal = horasTrabajadas * valorPorHoraSemanal;
            System.out.println("El sueño semanal es: $" + sueldoSemanal + "\nCantidad de horas trabajadas: " + horasTrabajadas + "hs");
        } else {
            sueldoSemanal = horasTrabajadas * valorPorHoraSemanal;
            valorPorHorasExtras = (sueldoSemanal * porcentaje) / 100;
            sueldoConHorasExtras = sueldoSemanal + valorPorHorasExtras;
            System.out.println("El sueño semanal es: $" + sueldoConHorasExtras + "\nCantidad de horas trabajadas: " + horasTrabajadas + "hs");
        }
    }
}
