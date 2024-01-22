import java.util.Scanner;
import java.util.Arrays;

public class ejercicio5_19 {

    public static void main(String args[]) {
        // Declaracion de variables
        int dorsal, contador = -1;
        String dorsales = "";
        Scanner teclado = new Scanner(System.in);
        // Codigo del programa
        do {
            System.out.println("Dime los dorsales,cuando introduzcas un -1 para");
            dorsal = teclado.nextInt();
            dorsales = dorsales + " " + dorsal;
        } while (dorsal != -1);
    }

}
