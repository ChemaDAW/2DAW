package Sugundo_trimestre;

import java.util.Scanner;

public class Ejarrays// HECHO POR JOSE MARIA FERNANDEZ GARZON
{
    static Scanner teclado = new Scanner(System.in);

    public static void main(String args[]) {
        menu();

    }// FIN_MAIN

    public static void verVector() {

    }

    public static void menu() {
        Scanner teclado = new Scanner(System.in);
        int menu;
        boolean salir = false;
        char seguro;
        while (!salir) {

            System.out.println("1. Vector");
            System.out.println("2. Vector letras");
            System.out.println("3. Palabra sin vocales");
            System.out.println("4. Palabra en la frase");
            System.out.println("5. Frase polindroma");
            System.out.println("6. Salir");

            System.out.println("Escribe una de las opciones");
            menu = teclado.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Has seleccionado la opcion 1");
                    Vectores();
                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2");
                    vectorletras();
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    Vocales();
                    break;
                case 4:
                    System.out.println("Has seleccionado la opcion 3");
                    palabrasEnLaFrase();
                    break;
                case 5:
                    System.out.println("Has seleccionado la opcion 3");
                    esPolindromo();
                    break;
                case 6:
                    System.out.println("Estas seguro que quieres salir s/n");
                    seguro = teclado.next().charAt(0);
                    if (seguro == 's' && seguro == 's')
                        salir = true;
                    else
                        salir = false;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }

        }
    }

    public static void vectorletras() {
        // creamos un vector de letras
        char palabra[], letra;
        int dimension = 0;
        do {
            System.out.println("Dime de que dimension quieres el vector");
            dimension = teclado.nextInt();
        } while (dimension <= 0);
        palabra = new char[dimension];
        // inicializamos la estructura
        for (int i = 0; i < palabra.length; i++) {
            System.out.println("Nuestro arrays de caracteres contiene:");
            palabra[i] = '1';
        }

        teclado.close();

    }

    public static void Vectores() {
        // creamos un vector de enteros
        int edad[], mirar;
        edad = new int[17];
        // lo inicializamos
        for (int i = 0; i < 17; i++) {
            edad[i] = 0;
        }
        // Accemos a una posicion del vector
        edad[5] = 30;// asignamos un valor.
        mirar = edad[5] + 5;
        System.out.println("El vector tiene en la posicion 5 el valor de " + mirar);
        // mostramos todo el vector
        System.out.print("{");
        for (int i = 0; i < 17; i++) {
            System.out.print(edad[i] + ",");
        }
        System.out.println("}");
    }

    public static void Vocales() {
        String palabra;
        System.out.println("Dime la palabra y te la pondre sin vocales:");
        palabra = teclado.nextLine();

        palabra = palabra.replace("a", "");
        palabra = palabra.replace("e", "");
        palabra = palabra.replace("i", "");
        palabra = palabra.replace("o", "");
        palabra = palabra.replace("u", "");
        palabra = palabra.replace(" ", "");

        System.out.println(palabra);

    }

    public static void palabrasEnLaFrase() {
        // Definimos las varibales
        String frase, palabra;
        int repeticion = 0, posicion;
        // Desarrollamos el programa
        System.out.println("Dime la frase");
        frase = teclado.nextLine();
        System.out.println("Dime la palabra");
        palabra = teclado.nextLine();
        posicion = frase.indexOf(palabra);
        while (posicion != -1) {
            repeticion++;
            posicion = frase.indexOf(palabra, posicion + 1);
        }
        System.out.println(palabra + " esta " + repeticion + " veces");
    }

    public static void esPolindromo() {
        System.out.print("Introduce una frase: ");
        String frase = teclado.nextLine();
        frase = frase.replace(" ", "");
        frase = frase.replace(",", "");
        frase = frase.replace(".", "");
        System.out.print(frase);
        frase = frase.toLowerCase();
        int fin = frase.length() - 1;
        int ini = 0;
        boolean palindromo = false;
        while (ini < fin) {
            if (frase.charAt(ini) == frase.charAt(fin)) {
                palindromo = true;
            } else {
                palindromo = false;
                break;
            }
            ini++;
            fin--;
        }
        if (palindromo)
            System.out.print("\nEs palindromo.\n");
        else
            System.out.print("\nNo es palindromo.\n");

    }

    public static void relacionLetras() {

    }
}

// FIN_CLASS
