import java.util.*;

public class Arrays_Ej6 {
    static Scanner teclado = new Scanner(System.in);
    static int ventas[][] = new int[3][5];

    public static void main(String[] args) {
        for (int fila = 0; fila < ventas.length; fila++) {
            for (int col = 0; col < ventas[fila].length; col++) {
                ventas[fila][col] = 0;
            }
        }
        for (int fila = 0; fila < ventas.length; fila++) {
            for (int col = 0; col < ventas[fila].length; col++) {
                System.out.print(ventas[fila][col]);
            }
            System.out.println();
        }
    }
}
