import java.util.*;

public class Basicos_Ej1 {
    static Scanner teclado = new Scanner(System.in);
    static int num1 = 0, num2 = 0;

    public static void main(String[] args) {
        // Creacion de variables
        char salir = ' ';
        int opcion = 0;
        // Codigo del programa
        pedirNumero();
        do {
            System.out.println("Que quieres coger:\n0-Salir\n1-Sumar\n2-Restar\n3-Multiplicar\n4-Dividir\n5-Resto");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("¿Seguro que quieres salir (S/N)?");
                    salir = teclado.next().charAt(0);
                    salir = Character.toLowerCase(salir);
                    break;
                case 1:
                    System.out.println(num1 + num2);
                    break;
                case 2:
                    System.out.println(num1 - num2);
                    break;
                case 3:
                    System.out.println(num1 * num2);
                    break;
                case 4:
                    System.out.println(num1 / num2);
                    break;
                case 5:
                    System.out.println(num1 % num2);
                    break;
                default:
                    System.out.println("Eror");
                    break;
            }
        } while (salir != 's');
    }

    public static void pedirNumero() {
        System.out.println("Dime el primer numero");
        num1 = teclado.nextInt();
        System.out.println("Dime el segundo numero");
        num2 = teclado.nextInt();
    }
}
