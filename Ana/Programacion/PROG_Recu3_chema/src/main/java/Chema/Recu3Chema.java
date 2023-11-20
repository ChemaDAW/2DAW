
import java.util.*;

public class Recu3Chema {
    static Scanner teclado = new Scanner(System.in);
    static ArrayList<Esfera> ArrayEsferas = new ArrayList<>();
    static ArrayList<Esfera> CalcularEsferasD = new ArrayList<>();
    static final String rojo = "\033[31m";
    static final String verde = "\033[32m";
    static final String reset = "\033[0m";

    public static void main(String[] args) {
        Punto verticeA = new Punto(0, 30);
        Punto verticeB = new Punto(0, 30);
        Esfera Esfera1 = new Esfera(verticeA, verticeB, 5);
        ArrayEsferas.add(Esfera1);
        int numEsferasCreadasMain = 1;
        int menu1;
        String salir1 = "";
        do {
            System.out.printf(verde
                    + "0-Salir\n1-Crear Esfera\n2-Calcular el permimetro de las esferas\n3-Calcular Area de las esferas\n4-Calcular puntos de corte\n5-Mostrar informacion sobre las esferas\n"
                    + reset);
            menu1 = teclado.nextInt();
            switch (menu1) {
                case 1:
                    System.out.println("Has selecionado crear una esfera");
                    anadirEsferas();
                    System.out.println(ArrayEsferas.size() - 1);
                    System.out.println(ArrayEsferas.toString());
                    numEsferasCreadasMain++;
                    break;
                case 2:
                    calcularPerimetroMain();
                    break;
                case 3:
                    calcularAreaMain();
                    break;
                case 4:
                    puntosCorte(numEsferasCreadasMain, ArrayEsferas, CalcularEsferasD);
                    break;
                case 5:
                    System.out.println(ArrayEsferas.toString());
                    break;
                case 0:
                    Esfera.totalEsferas();
                    teclado.nextLine();
                    System.out.println(rojo + "Si quieres salir pon s" + reset);
                    salir1 = teclado.nextLine();
                    salir1 = salir1.toLowerCase();
                default:
                    break;
            }
        } while (!salir1.equals("s"));
    }

    static public void anadirEsferas() {
        int x, y;
        int x2, y2;
        float radio;
        try {
            do {
                System.out.println("Dime el punto X del primer Vertice desde es 0 hasta el 30");
                x = teclado.nextInt();
            } while (x < 0 || x > 30);
            do {
                System.out.println("Dime el punto Y del primer Vertice desde es 0 hasta el 30");
                y = teclado.nextInt();
            } while (y < 0 || y > 30);
            Punto verticeAcrear = new Punto(x, y);
            do {
                System.out.println("Dime el punto X del segundo Vertice desde es 0 hasta el 30");
                x2 = teclado.nextInt();
            } while (x2 < 0 || x2 > 30);
            do {
                System.out.println("Dime el punto Y del segundo Vertice desde es 0 hasta el 30");
                y2 = teclado.nextInt();
            } while (y2 < 0 || y2 > 30);
            do {
                System.out.println("Dime el radio de la esfera desde el 0 hasta el 12");
                radio = teclado.nextFloat();
            } while (radio < 0 || radio > 12);
            Punto verticeBcrear = new Punto(x2, y2);
            Esfera Esferascreadas = new Esfera(verticeAcrear, verticeBcrear, radio);
            ArrayEsferas.add(Esferascreadas);
            System.out.println(verde + "Esferas creadas con exito gracias" + reset);
        } catch (Exception e) {
            System.out.println(rojo + "Tenias que introducir un digito" + reset);
        }
    }

    static public void calcularAreaMain() {
        for (int i = 0; i <= ArrayEsferas.size() - 1; i++) {
            System.out.println("Esfera " + i + ": " + ArrayEsferas.get(i).Area());
        }
    }

    static public void calcularPerimetroMain() {
        for (int i = 0; i <= ArrayEsferas.size() - 1; i++) {
            System.out.println("Esfera " + i + ": " + ArrayEsferas.get(i).Perimetro());
        }
    }

    static public void puntosCorte(int numEsferasCreadasMain, ArrayList ArrayEsferas, ArrayList CalcularEsferasD) {
        double d;
        int eleccion, eleccion1;
        System.out.println("Tienes estas esferas (0-" + (ArrayEsferas.size() - 1) + ")");
        System.out.println(ArrayEsferas.toString());
        do {
            System.out.println("¿Que esfera quieres coger la primera?");
            eleccion = teclado.nextInt();
        } while (eleccion < 0 || eleccion > numEsferasCreadasMain);
        do {
            System.out.println("¿Que esfera quieres coger la segunda?");
            eleccion1 = teclado.nextInt();
        } while (eleccion < 0 || eleccion > ArrayEsferas.size() - 1);
        CalcularEsferasD.add(0, ArrayEsferas.get(eleccion));
        CalcularEsferasD.add(1, ArrayEsferas.get(eleccion1));
        System.out.println("No funciona pero creo que me he quedado a nada :D");
    }
}
