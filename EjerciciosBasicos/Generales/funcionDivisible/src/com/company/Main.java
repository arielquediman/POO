package com.company;
public class Main {
    //        Hacer una función que reciba como parámetro dos valores y devuelva un boolean.
    //        La función debe comprobar si el primer número es divisible por el segundo.
    public static void main(String[] args) {
        System.out.println(esDivisible(10, 5));
    }
    public static boolean esDivisible(int dividendo, int divisor){
        boolean resultado;
        if (dividendo % divisor == 0) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }
}
