package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, num, x, contador;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        n = leer.nextInt();
        num = 0;
        while (n > 0) {
            num = num + 1;
            x = 1; //variable control del otro ciclo while
            contador = 0;
            while (x <= num) {
                if (num % x == 0) {
                    contador = contador + 1;
                }
                x = x + 1;
            }
            if (contador == 2) {
                System.out.println(num);
                n = n - 1;
            }
        }
    }
}
