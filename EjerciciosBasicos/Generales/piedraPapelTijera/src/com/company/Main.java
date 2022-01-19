package com.company;
import java.util.Scanner;

// DESAFIO 1 - TALLERES CIERRE DE SEMANA C3S

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Desafio 1 "(1)Piedra, (2)papel o (3)tijera"
        System.out.println("Ingrese nombre jugador 1:");
        String jugador1 = entrada.nextLine();
        System.out.println("Ingrese nombre jugador 2:");
        String jugador2 = entrada.nextLine();
        System.out.println("Ingrese eleccion jugador 1: piedra, papel o tijera");
        String eleccionJugador1 = entrada.nextLine();
        System.out.println("Ingrese eleccion jugador 2: piedra, papel o tijera");
        String eleccionJugador2 = entrada.nextLine();

        Integer ptsJugador1 = 0;
        Integer ptsJugador2 = 0;
        boolean flag = true;
        while (flag) {
            if(!eleccionJugador1.equals("*") || !eleccionJugador2.equals("*")) {
                Integer res = cualGana(eleccionJugador1, eleccionJugador2);
                if (res == 0) {
                    System.out.println("Empate!");
                } else if (res == 1) {
                    System.out.println("Gano " + jugador1);
                    ptsJugador1++;
                } else {
                    System.out.println("Gano " + jugador2);
                    ptsJugador2++;
                }
                System.out.println("Ingrese eleccion jugador 1:");
                eleccionJugador1 = entrada.nextLine();
                if (!eleccionJugador1.equals("*")) {
                    System.out.println("Ingrese eleccion jugador 2:");
                    eleccionJugador2 = entrada.nextLine();
                    if (eleccionJugador2.equals("*")) {
                        flag = false;
                    }
                } else {
                    flag = false;
                }
            }
        }

        if (ptsJugador1 < ptsJugador2) {
            System.out.println("El ganador es: " + jugador2 + ", con: " + ptsJugador2 + " puntos");
        } else {
            System.out.println("El ganador es: " + jugador1 + ", con: " + ptsJugador1 + " puntos");
        }

    }

    public static Integer cualGana (String eleccionGamer1, String eleccionGamer2) {
        if (eleccionGamer1.equals(eleccionGamer2)) {
            return 0;
        } else if ((eleccionGamer1.equals("piedra") && eleccionGamer2.equals("tijera")) || (eleccionGamer1.equals("tijera") && eleccionGamer2.equals("papel")) || (eleccionGamer1.equals("papel") && eleccionGamer2.equals("piedra"))) {
            return 1;
        } else {
            return 2;
        }
    }

}