import java.util.*;

public class Arrays_Ej2 {
    static Scanner teclado = new Scanner(System.in);
    static int t[][] = new int[3][3];

    public static void main(String[] args) {
        // Creacion de variables

        // Codigo del programas
        ejercioA();
        ejercioB();
        ejercioC();
        ejercioD();
        ejercioE();
        ejercioF();
        ejercioG();
        ejercioH();
        ejercioI();
        ejercioJ();

    }

    public static void ejercioA() {

    }

    public static void ejercioB() {
        System.out.println("t tiene " + t.length + " filas");
    }

    public static void ejercioC() {
        System.out.println("t tiene " + t[0].length + " columnas");
    }

    public static void ejercioD() {
        System.out.println("Tiene " + t.length * t[0].length + " elementos");
    }

    public static void ejercioE() {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                // Acceso a cada elemento de 't'
                int valor = t[i][j];
                System.out.println("t[" + i + "][" + j + "] = " + valor);
            }
        }
    }

    public static void ejercioF() {
        t[0][0] = 0;
        t[0][1] = 0;
        t[0][2] = 0;
        t[1][0] = 0;
        t[1][1] = 0;
        t[1][2] = 0;
        t[2][0] = 0;
        t[2][1] = 0;
        t[2][2] = 0;
    }

    public static void ejercioG() {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                t[i][j] = 0;
            }
        }
    }

    public static void ejercioH() {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                System.out.print("Ingrese el valor para t[" + i + "][" + j + "]: ");
                t[i][j] = teclado.nextInt();
            }
        }
    }

    public static void ejercioI() {
        int minimo = 100;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                if (t[i][j] < minimo) {
                    minimo = t[i][j];
                }
            }
        }
    }

    public static void ejercioJ() {
        System.out.printf(Arrays.toString(t[0]));
    }
}
