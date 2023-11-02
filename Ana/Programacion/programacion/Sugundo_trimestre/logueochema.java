import java.util.Scanner;
import java.util.Arrays;

public class logueochema // HECHO POR JOSE MARIA FERNANDEZ GARZON
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
        int menu, menu2;
        boolean salir = false;
        char salir1;
        // Desarrolo del programa
        while (!salir) {

            System.out.printf("1. Comprobar DNI o NIE\n");
            System.out.printf("2. Salir\n");
            System.out.printf("¿Que opcion quieres?\n");
            menu = teclado.nextInt();

            switch (menu) {
                case 1:
                    System.out.printf("¿Que quieres comprobar DNI o NIE  (1/2)?\n");
                    System.out.printf("¿Que opcion quieres?\n");
                    menu2 = teclado.nextInt();
                    switch (menu2) {
                        case 1:
                            System.out.println("------------COMPROBANDO TU DNI-------------");
                            comprobarDni();
                            break;
                        case 2:
                            System.out.println("------------COMPROBANDO TU NIE-------------");
                            comprobarNie();
                            break;
                        default:
                            System.out.println("El numero era entre 1 y 2");
                            break;
                    }
                case 2:
                    System.out.printf("Quieres salir s/n\n");
                    salir1 = teclado.next().charAt(0);
                    if (salir1 == 's' || salir1 == 's')
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

    public static void comprobarDni() {
        // Declaracion de variables
        Scanner teclado = new Scanner(System.in);
        String arrayDni[] = new String[9];
        String dni;
        char letra;
        // Codigo del programa
        System.out.println("Hola buenas,introduzca su dni");
        dni = teclado.nextLine();
        letra = dni.charAt(dni.length() - 1);
        dni = dni.replace("T", "");
        dni = dni.replace("R", "");
        dni = dni.replace("W", "");
        dni = dni.replace("A", "");
        dni = dni.replace("G", "");
        dni = dni.replace("M", "");
        dni = dni.replace("Y", "");
        dni = dni.replace("F", "");
        dni = dni.replace("P", "");
        dni = dni.replace("D", "");
        dni = dni.replace("B", "");
        dni = dni.replace("X", "");
        dni = dni.replace("t", "");
        dni = dni.replace("r", "");
        dni = dni.replace("w", "");
        dni = dni.replace("a", "");
        dni = dni.replace("g", "");
        dni = dni.replace("m", "");
        dni = dni.replace("y", "");
        dni = dni.replace("f", "");
        dni = dni.replace("p", "");
        dni = dni.replace("d", "");
        dni = dni.replace("b", "");
        dni = dni.replace("x", "");
        dni = dni.replace("N", "");
        dni = dni.replace("J", "");
        dni = dni.replace("Z", "");
        dni = dni.replace("S", "");
        dni = dni.replace("Q", "");
        dni = dni.replace("V", "");
        dni = dni.replace("H", "");
        dni = dni.replace("L", "");
        dni = dni.replace("C", "");
        dni = dni.replace("K", "");
        dni = dni.replace("E", "");
        dni = dni.replace("n", "");
        dni = dni.replace("j", "");
        dni = dni.replace("z", "");
        dni = dni.replace("s", "");
        dni = dni.replace("q", "");
        dni = dni.replace("v", "");
        dni = dni.replace("h", "");
        dni = dni.replace("l", "");
        dni = dni.replace("c", "");
        dni = dni.replace("k", "");
        dni = dni.replace("e", "");
        dni = dni.replace("b", "");
        arrayDni = dni.split("");
        dni = "";
        for (int i = 0; i <= arrayDni.length - 1; i++) {
            dni = dni + arrayDni[i];
        }
        int dniDigito = Integer.parseInt(dni);
        dniDigito = dniDigito % 23;
        switch (dniDigito) {
            case 0:
                if (letra == 'T' || letra == 't') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
            case 1:
                if (letra == 'R' || letra == 'r') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 2:
                if (letra == 'W' || letra == 'w') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 3:
                if (letra == 'A' || letra == 'a') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 4:
                if (letra == 'G' || letra == 'g') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 5:
                if (letra == 'M' || letra == 'm') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 6:
                if (letra == 'Y' || letra == 'y') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 7:
                if (letra == 'F' || letra == 'f') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 8:
                if (letra == 'P' || letra == 'p') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 9:
                if (letra == 'D' || letra == 'd') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 10:
                if (letra == 'X' || letra == 'x') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 11:
                if (letra == 'B' || letra == 'b') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 12:
                if (letra == 'N' || letra == 'n') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
            case 13:
                if (letra == 'J' || letra == 'j') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 14:
                if (letra == 'Z' || letra == 'z') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 15:
                if (letra == 'S' || letra == 's') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 16:
                if (letra == 'Q' || letra == 'q') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 17:
                if (letra == 'V' || letra == 'v') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 18:
                if (letra == 'H' || letra == 'h') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 19:
                if (letra == 'L' || letra == 'l') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 20:
                if (letra == 'C' || letra == 'c') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 21:
                if (letra == 'K' || letra == 'k') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 22:
                if (letra == 'E' || letra == 'e') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
        }

    }

    public static void comprobarNie() {
        // Declaracion de variables
        Scanner teclado = new Scanner(System.in);
        String arrayNie[] = new String[9];
        String nie;
        char letra;
        // Codigo del programa
        System.out.println("Hola buenas,introduzca su nie");
        nie = teclado.nextLine();
        letra = nie.charAt(nie.length() - 1);
        nie = nie.replace("T", "");
        nie = nie.replace("R", "");
        nie = nie.replace("W", "");
        nie = nie.replace("A", "");
        nie = nie.replace("G", "");
        nie = nie.replace("M", "");
        nie = nie.replace("F", "");
        nie = nie.replace("P", "");
        nie = nie.replace("D", "");
        nie = nie.replace("B", "");
        nie = nie.replace("t", "");
        nie = nie.replace("r", "");
        nie = nie.replace("w", "");
        nie = nie.replace("a", "");
        nie = nie.replace("g", "");
        nie = nie.replace("m", "");
        nie = nie.replace("y", "");
        nie = nie.replace("f", "");
        nie = nie.replace("p", "");
        nie = nie.replace("d", "");
        nie = nie.replace("b", "");
        nie = nie.replace("x", "");
        nie = nie.replace("N", "");
        nie = nie.replace("J", "");
        nie = nie.replace("Z", "");
        nie = nie.replace("S", "");
        nie = nie.replace("Q", "");
        nie = nie.replace("V", "");
        nie = nie.replace("H", "");
        nie = nie.replace("L", "");
        nie = nie.replace("C", "");
        nie = nie.replace("K", "");
        nie = nie.replace("E", "");
        nie = nie.replace("n", "");
        nie = nie.replace("j", "");
        nie = nie.replace("z", "");
        nie = nie.replace("s", "");
        nie = nie.replace("q", "");
        nie = nie.replace("v", "");
        nie = nie.replace("h", "");
        nie = nie.replace("l", "");
        nie = nie.replace("c", "");
        nie = nie.replace("k", "");
        nie = nie.replace("e", "");
        nie = nie.replace("b", "");
        arrayNie = nie.split("");
        for (int j = 0; j <= arrayNie.length - 1; j++) {
            if (arrayNie[j] == "X") {
                arrayNie[j] = "0";
            }
            if (arrayNie[j] == "Y") {
                arrayNie[j] = "1";
            }
            if (arrayNie[j] == "Z") {
                arrayNie[j] = "2";
            }
            if (arrayNie[j] == "x") {
                arrayNie[j] = "0";
            }
            if (arrayNie[j] == "y") {
                arrayNie[j] = "1";
            }
            if (arrayNie[j] == "z") {
                arrayNie[j] = "2";
            }
        }
        nie = "";
        for (int i = 0; i <= arrayNie.length - 1; i++) {
            System.out.println(arrayNie[i]);
            nie = nie + arrayNie[i];
        }
        int nieDigito = Integer.parseInt(nie);
        System.out.println(nieDigito);
        nieDigito = nieDigito % 23;
        switch (nieDigito) {
            case 12:
                if (letra == 'N' || letra == 'n') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
            case 13:
                if (letra == 'J' || letra == 'j') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 14:
                if (letra == 'Z' || letra == 'z') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 15:
                if (letra == 'S' || letra == 's') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 16:
                if (letra == 'Q' || letra == 'q') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 17:
                if (letra == 'V' || letra == 'v') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 18:
                if (letra == 'H' || letra == 'h') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 19:
                if (letra == 'L' || letra == 'l') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 20:
                if (letra == 'C' || letra == 'c') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 21:
                if (letra == 'K' || letra == 'k') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;
            case 22:
                if (letra == 'E' || letra == 'e') {
                    System.out.println("Esta correcto");
                } else {
                    System.out.println("Es incorrecto");
                }
                break;

        }

    }

}

// FIN_CLASS
