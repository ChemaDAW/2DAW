
import java.util.*;

public class Sorteo_Chema {
    // Variables globales
    static int ganadora[] = new int[10];
    static Scanner teclado = new Scanner(System.in);
    static boolean combinacionGanadoraCreada = false;
    static boolean combinacionCreada = false;

    // Main
    public static void main(String[] args) {
        // Creacion de variables
        int opcion = -1, salir = 0;
        int boleto[] = new int[10];
        // Codigo del programa
        do {
            do {
                System.out.println(
                        "Que opcion quieres coger:\n0-Salir\n1-Generar combinacion ganadora\n2-Crear boleto\n3-Comprobar boleto\n4-Ver boleto ganador\n5-Ver tu boleto");
                opcion = teclado.nextInt();
            } while (opcion < 0 || opcion > 5);
            switch (opcion) {
                // Menu
                case 0:
                    try {
                        // Comprobacion de salida
                        System.out.println("¿Seguro que quieres salir \n1-Si\n2-No");
                        salir = teclado.nextInt();
                    } catch (Exception inputMismatchException) {
                        System.out.println("Intoduce un numero");
                        salir = 0;
                    }
                    break;
                case 1:
                    crearCombinacion();
                    break;
                case 2:
                    boleto = pedirBoleto(boleto);
                    break;
                case 3:
                    comprobarBoleto(boleto);
                    break;
                case 4:
                    mostrarArray();
                    break;
                case 5:
                    verArray(boleto);
                    break;
                default:
                    System.out.println("Introduce del 0-5");
                    break;
            }
        } while (salir != 1);
    }

    // Metodo para crear la combinacion ganadora
    public static void crearCombinacion() {
        Arrays.fill(ganadora, -1);
        for (int i = 0; i < ganadora.length; i++) {
            int random = (int) (Math.random() * 99 + 1) + 1;
            for (int j = 0; j < ganadora.length; j++) {
                // Aqui comprobamos si se ha repetido o no
                if (random == ganadora[j]) {

                } else {
                    ganadora[i] = random;
                }
            }
        }
        System.out.println("Combinacion creada con exito");
        combinacionGanadoraCreada = true;
    }

    // Metodo para pedir los numeros de nuestro boleto
    public static int[] pedirBoleto(int boleto[]) {
        int numero;
        if (combinacionGanadoraCreada) {
            System.out.println("Tienes que introducir 10 numeros");
            for (int i = 0; i < boleto.length; i++) {
                numero = teclado.nextInt();
                boleto[i] = numero;
            }
            combinacionCreada = true;
        } else {
            System.out.println("Tienes que crear el boleto ganador");
        }
        return boleto;
    }

    // Metodo para mostrar el array del boleto ganador de forma repetitiva
    public static void mostrarArray() {
        if (combinacionGanadoraCreada == true) {
            for (int i = 0; i < ganadora.length; i++) {
                System.out.print(ganadora[i] + ",");
            }
        } else {
            System.out.println("Tienes que crear primero tu boleto");
        }
        System.out.println("");
    }
    // Metodo para mostrar el array del boleto ganador de forma estatica

    public static void verArray(int boleto[]) {
        if (combinacionCreada == true) {
            System.out.println(Arrays.toString(boleto));
        } else {
            System.out.println("Tienes que crear primero tu boleto");
        }
    }

    // Metodo para comprobar cuantos numeros has acertado
    public static void comprobarBoleto(int boleto[]) {
        int contador = 0;
        if (combinacionCreada == true && combinacionGanadoraCreada == true) {
            for (int i = 0; i < boleto.length; i++) {
                for (int j = 0; j < boleto.length; j++) {
                    if (boleto[j] == ganadora[i]) {
                        contador++;
                    }
                }
            }
            System.out.println("Has acertado en " + contador);
        } else {
            System.out.println("No has creado alguna de las combinaciones");
        }

    }
}
