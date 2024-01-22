import java.util.*;

public class Basicos_Ej3 {
    static Scanner teclado = new Scanner(System.in);
    static int num1 = 1;

    public static void main(String[] args) {
        // Creacion de variables
        int contador = 0;
        // Codigo del programa
        do {
            pedirNumero();
            contador++;
        } while (num1 >= 0);
        System.out.println("Adios,se han introducido " + contador + " numeros");
    }

    public static void pedirNumero() {
        System.out.println("Dime el primer numero");
        num1 = teclado.nextInt();
    }
}
