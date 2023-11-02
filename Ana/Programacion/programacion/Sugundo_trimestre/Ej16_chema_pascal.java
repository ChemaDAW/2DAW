package Sugundo_trimestre;

import java.util.Scanner;

public class Ej16_chema_pascal// HECHO POR JOSE MARIA FERNANDEZ GARZON
{
    public static void main(String args[]) {
        // Definimos las varibales
        Scanner teclado = new Scanner(System.in);
        String frase;
        int numeroPalabras = 1;
        char c;
        // Desarrollamos el programa
        System.out.println("Dime la frase y te dire cuantas palabras tiene");
        frase = teclado.nextLine();
        for (int i = 0; i < frase.length(); i++) {
            c = frase.charAt(i);
            if (c == ' ') {
                numeroPalabras++;
            }
        }
        System.out.println(numeroPalabras);
        teclado.close();

    }// FIN_MAIN
}// FIN_CLASS
