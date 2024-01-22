import java.util.*;

public class Basicos_Ej8 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        // Creacion de variables
        int num1 = 0, suma = 0, contador = 0;
        // Codigo del programa
        do {
            System.out.println("Dime 15 numeros y te lo sumo )");
            num1 = teclado.nextInt();
            suma += num1;
            contador++;
        } while (contador < 15);
        System.out.println("El total es " + suma);
    }

}
