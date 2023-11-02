package Sugundo_trimestre;

import java.util.Scanner;

public class Ej_buscar// HECHO POR JOSE MARIA FERNANDEZ GARZON
{
    public static void main(String args[]) {
        // Definimos las varibales
        Scanner teclado = new Scanner(System.in);
        int pos;
        String frase = "";
        String i = "";
        // Desarrollamos el programa
        System.out.println("Dime la frase");
        frase = teclado.nextLine();
        System.out.println("Dime la palabra o caracter que quieres buscar");
        i = teclado.nextLine();
        pos = frase.indexOf(i);
        System.out.println(i + " en la frase " + frase + " esta en la posicion " + pos);

    }// FIN_MAIN
}// FIN_CLASS