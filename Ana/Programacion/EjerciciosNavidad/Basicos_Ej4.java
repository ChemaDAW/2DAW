import java.util.*;

public class Basicos_Ej4 {
    static Scanner teclado = new Scanner(System.in);
    static int numeros[] = new int[5];

    public static void main(String[] args) {
        // Creacion de variables
        int contador = 0;
        // Codigo del programa
        do {
            System.out.println("Dime el numero " + contador);
            numeros[contador] = teclado.nextInt();
            contador++;
        } while (contador < 5);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ",");
        }
    }

}
