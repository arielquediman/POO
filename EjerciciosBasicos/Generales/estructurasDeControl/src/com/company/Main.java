package com.company;

public class Main {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int resto = num1%num2;
        if (resto == 0) {
            System.out.println("Es divisible");
        } else {
            System.out.println("No es divisible");
        }
    }
}
