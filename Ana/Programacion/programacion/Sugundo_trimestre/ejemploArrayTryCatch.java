
import java.util.*;

public class ejemploArrayTryCatch {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String args[]) {
        // declaracion de variables
        String arrayStrings[] = { "victor", "chema", "paco", "jairo", "pablo" };
        char arraysCaracteres[] = { 'a', 'b', 'c', 'd', 'e' };
        int arraysNumeros[] = { 3, 4, 5, 7, 1, 5, 9, 8, -4 };
        // codigo del programa
        Arrays.sort(arrayStrings);
        int posicion = java.util.Arrays.binarySearch(arrayStrings, "pablo");
        System.out.println(arrayStrings[posicion]);
        System.out.println(Arrays.toString(arraysCaracteres));
        System.out.println(Arrays.toString(arraysNumeros));
        Arrays.sort(arraysNumeros);
        System.out.println(Arrays.toString(arraysNumeros));
        int[] arrayClonado = arraysNumeros.clone();
        int[] arrayClonado2 = arraysNumeros;
        arraysNumeros[2] = -54;

        System.out.println(Arrays.toString(arrayClonado2));

        System.out.println(arraysNumeros == arrayClonado);
        System.out.println(arraysNumeros == arrayClonado2);
        System.out.println(Arrays.equals(arraysNumeros, arrayClonado));
        System.out.println(Arrays.equals(arraysNumeros, arrayClonado2));

    }
}
