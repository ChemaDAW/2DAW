import java.util.*;

public class Basicos_Ej5 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        // Creacion de variables
        int num1 = 0, suma = 0;
        // Codigo del programa
        do {
            System.out.println("Dime el numeros y te lo sumo (Introduce 0 para parar)");
            num1 = teclado.nextInt();
            suma += num1;
        } while (num1 != 0);
        System.out.println("El total es " + suma);
    }

}
