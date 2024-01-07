import java.util.*;

public class Arrays_Ej1 {
    static Scanner teclado = new Scanner(System.in);
    static int f[] = new int[10];

    public static void main(String[] args) {
        // Creacion de variables

        // Codigo del programas
        ejercioA();
        ejercioB();
        ejercioC();
        ejercioD();
        ejercioE();
    }

    public static void ejercioA() {
        System.out.println("En el array f en el elemento 6 esta " + f[6]);
    }

    public static void ejercioB() {
        int g[] = new int[10];
        for (int i = 0; i < g.length; i++) {
            g[i] = 8;
        }

    }

    public static void ejercioC() {
        double c[] = new double[100];
        double suma = 0;
        for (int i = 0; i < c.length; i++) {
            suma += c[i];
        }
        System.out.println("La suma de todos los elementos del array c es de " + suma);
    }

    public static void ejercioD() {
        int a[] = new int[11];
        int b[] = new int[34];
        System.arraycopy(a, 0, b, 0, a.length);
    }

    public static void ejercioE() {
        double w[] = new double[99];
        double menor = 100, mayor = 0;
        for (int i = 0; i < w.length; i++) {
            w[i] = Math.random() * (40 - 1 + 1) + 1;
            if (w[i] < menor) {
                menor = w[i];
            }
            if (w[i] > mayor) {
                mayor = w[i];
            }
        }
        System.out.println("El mayor es " + mayor + " y el menor es " + menor);
    }
}
