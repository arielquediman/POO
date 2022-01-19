package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese 1er numero");
        int num1 = ingreso.nextInt();
        System.out.println("Ingrese 2do numero");
        int num2 = ingreso.nextInt();
        System.out.println("Ingrese 3er numero");
        int num3 = ingreso.nextInt();
        System.out.println("El maximo entre los 3 numeros ingresados es: " + maximoEntre3numeros(num1,num2,num3));
    }
    public static Integer maximoEntre3numeros (Integer num1, Integer num2, Integer num3) {
        Integer resultado = null;
        if ((num1 >= num2) & (num1 >= num3)) { // si num 1 es mayor o menor a num 2
            resultado = num1;
        } else if ((num2 >= num1) & (num2 >= num3)){
            resultado = num2;
        } else if ((num3 >= num1) & (num3 >= num2)) {
            resultado = num3;
        }
        return resultado;
    }
}
