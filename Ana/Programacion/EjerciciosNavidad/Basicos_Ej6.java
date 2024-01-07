import java.util.*;

public class Basicos_Ej6 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        // Creacion de variables
        int num1 = 0, suma = 0, contador = 0;
        // Codigo del programa
        do {
            System.out.println("Dime el numeros y te lo sumo (Introduce un numero negativo para parar)");
            num1 = teclado.nextInt();
            if (num1 >= 0) {
                contador++;
                suma += num1;
            }
        } while (num1 >= 0);
        System.out.println("La media es " + suma / contador);
    }

}
