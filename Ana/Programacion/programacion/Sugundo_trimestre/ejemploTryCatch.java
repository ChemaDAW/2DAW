
import java.util.Scanner;

public class ejemploTryCatch {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String args[]) {
        // declaracion de variables
        int numero, numeroArray, divisor, dividendo;
        char salir;
        String arrayTryCatch[] = new String[5];
        Scanner teclado = new Scanner(System.in);
        // codigo del programa
        try {
            System.out.println("Introuduce un numero del 1-5");
            numero = teclado.nextInt();
        } catch (Exception caracter) {
            System.out.println("Era un numero no un caracter");
        }
        try {
            System.out.println("¿Quieres salir (s/n)?");
            salir = teclado.next().charAt(0);
            salir = teclado.next().charAt(0);
        } catch (Exception numeroMal) {
            System.out.println("Era un caracter no un numero");
        }
        try {
            System.out.println("Introduce una posicion para el array(Max 5)");
            numeroArray = teclado.nextInt();
            arrayTryCatch[numeroArray] = "Hola";
        } catch (Exception fueraRango) {
            System.out.println("Esa posicion esta fuera del rango");
        }

        try {
            System.out.println("Dime el divisor");
            divisor = teclado.nextInt();
            System.out.println("Dime el dividendo");
            dividendo = teclado.nextInt();
            dividendo = divisor / dividendo;

        } catch (Exception e) {
            System.out.println("No se puede dividir entre 0");
        }

    }
}
