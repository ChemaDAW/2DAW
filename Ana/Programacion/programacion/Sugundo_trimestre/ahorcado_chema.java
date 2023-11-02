import java.util.Scanner;

public class ahorcado_chema {

    public static void main(String[] args) {
        String palabra;
        String aux = " ";
        char letra;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserte una palabra: ");
        palabra = scanner.nextLine();
        System.out.print("La palabra insertada es " + palabra);
        do {
            System.out.print("Inserte un letra: ");
            letra = scanner.nextLine().charAt(0);

            for (int pos = 0; pos < palabra.length(); pos++) {
                if (palabra.charAt(pos) == letra) {
                    aux = aux + letra.charAt(pos);
                    System.out.println(letra);
                } else {
                    System.out.println("_");
                }
            }
        } while (aux != palabra);
        System.out.println("Muy bien jugado");
    }
}