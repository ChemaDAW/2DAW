package Sugundo_trimestre;

import java.util.Scanner;

public class Ej_buscar1// HECHO POR JOSE MARIA FERNANDEZ GARZON
{
    public static void main(String args[]) {
        // Definimos las varibales
        Scanner teclado = new Scanner(System.in);
        int pos = 0;
        String frase = "";
        String i = "";
        int a = 0;
        int b = 1;
        // Desarrollamos el programa
        System.out.println("Dime la frase");
        frase = teclado.nextLine();
        System.out.println("Dime la palabra o caracter que quieres buscar");
        i = teclado.nextLine();
        for (int ii = 0; ii < frase.length(); ii++) {
            pos = frase.indexOf(i, pos + 1);
            if (pos > 0) {
                b++;
            } else {
                System.out.println("no hay");

            }

            System.out.println(b);

        }
    }// FIN_MAIN
}// FIN_CLASS