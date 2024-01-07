import java.util.*;

public class Arrays_Ej3 {
    static Scanner teclado = new Scanner(System.in);
    static int aux[][] = new int[2][3];

    public static void main(String[] args) {
        // Creacion de variables

        // Codigo del programas
        ejercioK();
        ejercioL();
        ejercioM();
        ejercioN();
        ejercioO();
        ejercioP();
        ejercioQ();
        ejercioR();
        ejercioS();
        ejercioT();
        ejercioU();
        ejercioV();
        ejercioW();
        ejercioX();

    }

    public static void ejercioK() {

    }

    public static void ejercioL() {
        System.out.println("t tiene " + aux.length + " filas");
    }

    public static void ejercioM() {
        System.out.println("t tiene " + aux[0].length + " columnas");
    }

    public static void ejercioN() {
        System.out.println("Tiene " + aux.length * aux[0].length + " elementos");
    }

    public static void ejercioO() {
        for (int j = 0; j < aux[1].length; j++) {
            int elemento = aux[1][j];
            System.out.println("Elemento en la fila 1, columna " + j + ": " + elemento);
        }
    }

    public static void ejercioP() {
        for (int i = 0; i < aux.length; i++) {
            int elemento = aux[i][1];
            System.out.println("Elemento en la fila " + i + ", columna 2: " + elemento);
        }
    }

    public static void ejercioQ() {
        aux[0][1] = 0;
    }

    public static void ejercioR() {
        aux[0][0] = 0;
        aux[0][1] = 0;
        aux[0][2] = 0;
        aux[1][0] = 0;
        aux[1][1] = 0;
        aux[1][2] = 0;
    }

    public static void ejercioS() {
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[0].length; j++) {
                aux[i][j] = 0;
            }
        }
    }

    public static void ejercioT() {
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[0].length; j++) {
                System.out.print("Ingrese el valor para aux[" + i + "][" + j + "]: ");
                aux[i][j] = teclado.nextInt();
            }
        }
    }

    public static void ejercioU() {
        int minimo = 100;
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[0].length; j++) {
                if (aux[i][j] < minimo) {
                    minimo = aux[i][j];
                }
            }
        }
    }

    public static void ejercioV() {
        System.out.printf(Arrays.toString(aux[0]));
        System.out.println();

    }

    public static void ejercioW() {
        int suma = aux[0][2] + aux[1][2];
        System.out.println("La suma de la tercera columna de aux es: " + suma);
    }

    public static void ejercioX() {

    }
}
