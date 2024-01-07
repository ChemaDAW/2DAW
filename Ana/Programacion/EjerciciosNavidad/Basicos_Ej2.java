import java.util.*;

public class Basicos_Ej2 {
    static Scanner teclado = new Scanner(System.in);
    static int num1 = 1;

    public static void main(String[] args) {
        // Creacion de variables
        // Codigo del programa
        do {
            pedirNumero();
            if (num1 % 2 == 0) {
                System.out.println("Es par");
            } else {
                System.out.println("Es impar");
            }
        } while (num1 != 0);
        System.out.println("Adios!!!");
    }

    public static void pedirNumero() {
        System.out.println("Dime el primer numero");
        num1 = teclado.nextInt();
    }
}
