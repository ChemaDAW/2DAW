
import java.util.Arrays;
import java.util.Scanner;

public class Ej6_4// HECHO POR JOSE MARIA FERNANDEZ GARZON
{
    private static final String ArrayUtils = null;

    public static void main(String args[]) {
        // Declaracion de variables
        int dorsal, contador = -1, numeroMenores;
        String dorsales = "";
        Scanner teclado = new Scanner(System.in);
        String dorsal1, aux;
        char menor = 'a';

        // Codigo del programa
        do {
            System.out.println("Dime los dorsales,cuando introduzcas un -1 para");
            dorsal = teclado.nextInt();
            dorsales = dorsales + " " + dorsal;
            contador++;
        } while (dorsal != -1);
        String dorsalesArray[] = new String[contador];
        dorsalesArray = dorsales.split(" ");

        for (int i = 2; i <= contador; i++) {
            System.out.println("¿El dorsal " + dorsalesArray[i] + " es menor S/N?");
            menor = teclado.next().charAt(0);
            if (menor == 'S' || menor == 's') {
                aux = dorsalesArray[i - 1];
                dorsalesArray[i - 1] = dorsalesArray[i];
                dorsalesArray[i] = aux;
            }
        }
        for (int y = 1; y <= contador; y++) {
            System.out.println("¿El dorsal " + dorsalesArray[y] + " esta dopado S/N?");
            menor = teclado.next().charAt(0);
            if (menor == 'S' || menor == 's') {
                dorsalesArray[y] = "null";
            }

        }
        String[] corredoresPagan = new String[dorsalesArray.length];
        String[] corredoresNoPagan = new String[dorsalesArray.length];

        for (int j = 1; j <= contador; j++) {
            if (dorsalesArray[j] != "null") {
                System.out.println("¿El dorsal " + dorsalesArray[j] + " ha pagado S/N?");
                menor = teclado.next().charAt(0);
            }
            if (menor == 'N' || menor == 'n') {
                corredoresNoPagan[j] = dorsalesArray[j];
            } else {
                corredoresPagan[j] = dorsalesArray[j];
            }

        }
        String[] corredores = new String[corredoresPagan.length + corredoresNoPagan.length];
        System.arraycopy(corredoresPagan, 0, corredores, 0, corredoresPagan.length);
        System.arraycopy(corredoresNoPagan, 0, corredores, corredoresPagan.length, corredoresNoPagan.length);
        for (int x = 1; x <= corredores.length - 1; x++) {
            if (corredores[x] == "null") {

            } else {
                System.out.println(corredores[x]);
            }
        }

    }// FIN_MAIN
}
// FIN_CLASS
