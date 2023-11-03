// Desarrollar el juego de la camara secreta que consiste
// en abrir una camara mediante su codigo secreto,que esta
// formado de digitos del 1 al 5,el jugaro especificara ccual
// es la longitud de la combincaion,a mayor longitud mayor
// dificultad del juego,la aplicacion generea de forma aleatoria
// una combinacion secreata que el usuario tendra que acedrtar
// en cada intento se muestra como pista,para cada digito de la combincaion
// introducida por el jugador si es mayor,menor o igual.

import java.util.Scanner;
import java.util.Arrays;

public class practicochema // HECHO POR JOSE MARIA FERNANDEZ GARZON
{
    Scanner teclado = new Scanner(System.in);

    public static void main(String args[]) {
        // DECLARACION DE VARIABLES

        // Desarrollamos el programa
        menu();

    }// FIN_MAIN

    public static void menu() {
        // Declaracion de variables
        Scanner teclado = new Scanner(System.in);
        int menu;
        boolean salir = false;
        char salir1;
        // Desarrolo del programa
        while (!salir) {

            System.out.printf("1. Camara secreta\n");
            System.out.printf("2. Salir\n");
            System.out.printf("¿Que opcion quieres?\n");
            menu = teclado.nextInt();

            switch (menu) {
                case 1:
                    camaraSecreta();
                    break;
                case 2:
                    System.out.printf("Quieres salir s/n\n");
                    salir1 = teclado.next().charAt(0);
                    if (salir1 == 's' && salir1 == 's')
                        salir = true;
                    else
                        salir = false;
                    break;
                default:
                    System.out.printf("Solo numeros del 1 al 4,decide que quieres hacer\n");
            }

        }
        teclado.close();// Cerramos el teclado
    }

    public static void camaraSecreta() {
        // Declaracion de variables
        Scanner teclado = new Scanner(System.in);
        int a;
        int aleatorio;
        int usuario1;
        int fin = 0;
        // Desarrollo del programa
        System.out.println("Dime de que longitud quieres la combinacion");
        a = teclado.nextInt();
        int secreto[] = new int[a];
        int secretoUsuario[] = new int[a];
        for (int i = 0; i < secreto.length; i++) {
            aleatorio = (int) (Math.random() * 5 + 1);
            secreto[i] = aleatorio;
        }
        do {
            for (int j = 0; j <= a - 1; j++) {
                System.out.println("Dime numero por numero la combinacion(Del 1 - 5)");
                usuario1 = teclado.nextInt();
                secretoUsuario[j] = usuario1;
            }

            for (int f = 0; f < secreto.length; f++) {
                if (secretoUsuario[f] == secreto[f]) {
                    System.out.println("Has acercado el " + secretoUsuario[f] + " que esta en la posicion " + f);
                }
                if (secretoUsuario[f] < secreto[f]) {
                    System.out.println("El numero " + secretoUsuario[f] + " de la posicion " + f + " es menor");
                }
                if (secretoUsuario[f] > secreto[f]) {
                    System.out.println("El numero " + secretoUsuario[f] + " de la posicion " + f + " es mayor");
                }
            }
            fin++;
        } while (fin < 4);
        if (Arrays.equals(secreto, secretoUsuario))
            System.out.println("Has adivinado la combinacion");
        else
            System.out.println("No has adivinado la combinacion");

        teclado.close();

    }
}

// FIN_CLASS
