import java.util.Scanner;

public class EJ18_chema // HECHO POR JOSE MARIA FERNANDEZ GARZON
{
    public static void main(String args[]) {
        // DECLARACION DE VARIABLES
        Scanner teclado = new Scanner(System.in);
        int num1, num2, mcm, mcd = 0;
        // Desarrollamos el programa
        System.out.println("Indica el primer numero: ");
        num1 = teclado.nextInt();
        System.out.println("Indica el segundo numero: ");
        num2 = teclado.nextInt();
        teclado.close();
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }

        mcm = num1 / mcd * num2;
        System.out.println("El Máximo Común Divisor es:" + mcm);

    }// FIN_MAIN
}// FIN_CLASS
