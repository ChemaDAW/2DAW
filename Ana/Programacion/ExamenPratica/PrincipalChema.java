package ExamenPratica;

import java.util.*;

public class PrincipalChema {
    static ArrayList<Cuadra> cuadras = new ArrayList<>();
    static ArrayList<Carrera> carreras = new ArrayList<>();
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int menu = 1;
        String salir = "";
        do {
            if (menu == 0) {// Confirmación para salir del programa
                System.out.println("Has elegido salir, ¿estas seguro? (s/n)");
                salir = teclado.nextLine();
                salir = salir.toLowerCase();
                menu++;
            } else {
                do {
                    System.out.println(
                            "#################################################################################");
                    System.out.println(
                            "# Bienvenido a este maravilloso programa, elige una de las siguientes opciones: #");
                    System.out.println(
                            "# [1] Alta de cuadra                                                            #");
                    System.out.println(
                            "# [2] Alta de caballo en una cuadra                                             #");
                    System.out.println(
                            "# [3] Alta de carrera                                                           #");
                    System.out.println(
                            "# [4] Listado de carreras y ganadores                                           #");
                    System.out.println(
                            "# [5] Consulta de cuadra con más carreras ganadas                               #");
                    System.out.println(
                            "# [6] Eliminar cuadra                                                           #");
                    System.out.println(
                            "# [7] Eliminar caballo                                                          #");
                    System.out.println(
                            "# [8] Eliminar carrera                                                          #");
                    System.out.println(
                            "# [0] Salir                                                                     #");
                    System.out.println(
                            "#################################################################################");
                    menu = teclado.nextInt();
                    switch (menu) {
                        case 0:
                            continue;
                        case 1:
                            altaCuadra();
                            break;
                        case 2:
                            altaCaballo();
                            break;
                        case 3:
                            // altaCarrera();
                            break;
                        case 4:
                            // listarCarreras();
                            break;
                        case 5:
                            // consultarCuadraGanadora();
                            break;
                        case 6:
                            // elminarCuadra();
                            break;
                        case 7:
                            // elminarCaballo();
                            break;
                        case 8:
                            // elminarCarrera();
                            break;
                        default:
                            System.out.println("¡Introduce un número que corresponda a una de las opciones del menú!");
                            break;
                    }// Fin switch
                } while (menu != 0);
            }
        } while (salir.equals("s"));

    }

    public static void altaCuadra() {
        Scanner teclado = new Scanner(System.in);
        String CIF, nombre, lugar;
        System.out.println("¿Cual es el CIF de la cuadra que quieres añadir?");
        CIF = teclado.nextLine();
        System.out.println("¿Cual es el nombre de la cuadra que quieres añadir?");
        nombre = teclado.nextLine();
        System.out.println("¿Cual es el lugar de la cuadra que quieres añadir?");
        lugar = teclado.nextLine();
        cuadras.add(new Cuadra(CIF, nombre, CIF));
    }

    public static void altaCaballo() {
        String nombre = "";
        String jinete = "";
        int numCuadra = 0;
        System.out.println("¿Cual es el nombre del caballo?");
        teclado.nextLine();
        nombre = teclado.nextLine();
        System.out.println("¿Cual es el jinete?");
        nombre = teclado.nextLine();
        cuadras.
        try {
            System.out.println("Indica la cuadra donde se dará de alta este caballo (0-" + (cuadras.size() - 1) + "):");
            numCuadra = teclado.nextInt();
            cuadras.get(numCuadra).getResidentes().add(new Caballos(nombre, jinete));
        } catch (Exception e) {
            System.out.println("Esa cuadra no existe");
        }
    }

    /*
     * public static void altaCarrera() {
     * String fecha = "";
     * String lugar = "";
     * int tamanoCuadra = cuadras.size() - 1;
     * int numCuadra = 0;
     * int numCaballo = 0;
     * System.out.println("¿En que lugar es la carrera?");
     * teclado.nextLine();
     * lugar = teclado.nextLine();
     * System.out.println("¿En que fechas es?");
     * fecha = teclado.nextLine();
     * try {
     * System.out.println("¿En que cuadra esta el caballo 0-" + (cuadras.size() - 1)
     * + "?");
     * numCuadra = teclado.nextInt();
     * cuadras.get(numCuadra);
     * } catch (Exception e) {
     * System.out.println("Esa cuadra no existe");
     * }
     * try {
     * System.out.println(
     * "Indica el caballo participante (0-" +
     * (cuadras.get(numCuadra).getResidentes().size() - 1) + "):");
     * numCaballo = teclado.nextInt();
     * carreras.get(numCaballo).participantes.add(cuadras.get(numCaballo).
     * getResidente(numCaballo));
     * } catch (Exception e) {
     * System.out.println(carreras.get(numCaballo).participantes);
     * }
     * }
     */

}
