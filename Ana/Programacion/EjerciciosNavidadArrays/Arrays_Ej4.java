import java.util.*;

public class Arrays_Ej4 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        // Creacion de variables
        int numVendedores = 0, ventas;
        int salarios[] = new int[9];
        // Codigo del programas
        System.out.println("Indica la cantidad de vendedores");
        numVendedores = teclado.nextInt();
        int vendedores[] = new int[numVendedores];
        for (int i = 0; i < vendedores.length; i++) {
            System.out.println("Que cantidad de ganancias a tenido el vendedor " + (i + 1));
            ventas = teclado.nextInt();
            ventas = ventas * 9 / 100 + 200;
            vendedores[i] = (int) ventas;
        }
        for (int j = 0; j < vendedores.length; j++) {
            if (vendedores[j] >= 200 && vendedores[j] <= 299) {
                salarios[0]++;
            } else if (vendedores[j] >= 300 && vendedores[j] <= 399) {
                salarios[1]++;
            } else if (vendedores[j] >= 400 && vendedores[j] <= 499) {
                salarios[2]++;
            } else if (vendedores[j] >= 500 && vendedores[j] <= 599) {
                salarios[3]++;
            } else if (vendedores[j] >= 600 && vendedores[j] <= 699) {
                salarios[4]++;
            } else if (vendedores[j] >= 700 && vendedores[j] <= 799) {
                salarios[5]++;
            } else if (vendedores[j] >= 800 && vendedores[j] <= 899) {
                salarios[6]++;
            } else if (vendedores[j] >= 900 && vendedores[j] <= 999) {
                salarios[7]++;
            } else {
                salarios[8]++;
            }
        }
        imprimirTabla(salarios);
    }

    public static void imprimirTabla(int[] salarios) {
        System.out.println("Rango Salarial \t Cantidad de Vendedores");
        String[] rangos = { "200-299 €", "300-399 €", "400-499 €", "500-599 €", "600-699 €", "700-799 €",
                "800-899 €", "900-999 €", "1000 € en adelante" };

        for (int i = 0; i < salarios.length; i++) {
            System.out.println(rangos[i] + "\t\t " + salarios[i]);
        }
    }
}