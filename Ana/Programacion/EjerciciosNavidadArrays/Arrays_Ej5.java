import java.util.*;

public class Arrays_Ej5 {
    static Scanner teclado = new Scanner(System.in);
    static int entero[] = new int[10];
    static int bono[] = new int[15];
    static int mejoresPuntuaciones[] = new int[5];

    public static void main(String[] args) {
        // Creacion de variables

        // Codigo del programas
        ejercioA();
        ejercioB();
        ejercioC();

    }

    public static void ejercioA() {
        for (int i = 0; i < entero.length; i++) {
            entero[i] = 0;
        }
    }

    public static void ejercioB() {
        int suma = 0;
        for (int i = 0; i < bono.length; i++) {
            suma += bono[i];
        }
    }

    public static void ejercioC() {
        System.out.println("Indice     Puntuacion");
        for (int i = 0; i < mejoresPuntuaciones.length; i++) {
            System.out.println(i + "              " + mejoresPuntuaciones[i]);
        }
    }
}
