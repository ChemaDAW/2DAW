package CalendarioPaquete;

import java.util.*;

public class CalendarioChemaMain {

    public static void main(String[] args) {
        final String Rojo = "\u001B[31m";
        Scanner teclado = new Scanner(System.in);
        CalendarioExacto calendario1;
        CalendarioExacto calendario2;
        CalendarioExacto calendario3;
        ArrayList<CalendarioExacto> calendarios;
        calendarios = new ArrayList<>();
        calendario1 = new CalendarioExacto(5, 20);
        calendario2 = new CalendarioExacto();
        calendario3 = new CalendarioExacto(12, 11, 12, 5, 2100);
        calendarios.add(calendario1);
        calendarios.add(calendario2);
        calendarios.add(calendario2);

        int menu;
        int cantidad = 3;
        int eleccion = 0;
        int incrementoMinutos = 3;
        String salir = "";
        do {
            System.out.println("Bienvenido al calendario¿Que opcion quieres escoger?");
            System.out.printf(
                    "1-Incrementar dia en calendario1\n2-Incrementar mes en calendario1\n3-Incrementar año en calendario1\n4-Incrementar hora en calendario1\n5-Incrementar minutos en calendario1\n6-Incrementar dia en calendario2\n7-Incrementar mes en calendario2\n8-Incrementar año en calendario2\n9-Incrementar hora en calendario2\n10-Incrementar minutos en calendario2\n11-Mostrar fechas\n12Comprobar si son bisiestos\n13-Comprobar si son iguales\n14-salir\n");
            menu = teclado.nextInt();
            switch (menu) {
                case 1:
                    calendario1.incrementarDia();
                    break;
                case 2:
                    calendario1.incrementarMes();
                    break;
                case 3:
                    calendario1.incrementarAnno(cantidad);
                    break;
                case 4:
                    calendario1.incrementarHora();
                    break;
                case 5:
                    calendario1.incrementarMinuto(incrementoMinutos);
                    break;
                case 6:
                    calendario2.incrementarDia();
                    break;
                case 7:
                    calendario2.incrementarMes();
                    break;
                case 8:
                    calendario2.incrementarAnno(cantidad);
                    break;
                case 9:
                    calendario2.incrementarHora();
                    break;
                case 10:
                    calendario2.incrementarMinuto(incrementoMinutos);
                    break;
                case 11:
                    System.out.printf("Calendario 1:\t");
                    calendario1.mostrarInformacion();
                    System.out.printf("\nCalendario 2:\t");
                    calendario2.mostrarInformacion();
                    System.out.printf("\nCalendario 3:\t");
                    calendario3.mostrarInformacion();
                    break;

                case 12:
                    System.out.printf("Calendario 1:\t");
                    if (calendario1.comprobarBisiesto()) {
                        System.out.println("Es bisiesto");
                    } else {
                        System.out.println("No es bisiesto");
                    }
                    System.out.printf("\nCalendario 2:\t");
                    if (calendario2.comprobarBisiesto()) {
                        System.out.println("Es bisiesto");
                    } else {
                        System.out.println("No es bisiesto");
                    }
                    System.out.printf("\nCalendario 3:\t");
                    if (calendario3.comprobarBisiesto()) {
                        System.out.println("Es bisiesto");
                    } else {
                        System.out.println("No es bisiesto");
                    }
                    break;
                case 13:
                    System.out.println(
                            "Opcion 1:Comparar calendario2 \nOpcion 2-Comparar calendario3");
                    eleccion = teclado.nextInt();
                    switch (eleccion) {
                        case 1:
                            if (calendario2.iguales(calendario1)) {
                                System.out.println("Son iguales");
                            } else {
                                System.out.println("No son iguales");
                            }
                            break;
                        case 2:
                            if (calendario3.iguales(calendario1)) {
                                System.out.println("Son iguales");
                            } else {
                                System.out.println("No son iguales");
                            }
                            break;
                        default:
                            break;
                    }

                    break;
                case 14:
                    teclado.nextLine();
                    System.out.println(Rojo + "Si quieres salir introduce una S");
                    salir = teclado.nextLine();
                    salir = salir.toLowerCase();
                    break;
                default:
                    System.out.println("Solo numeros del 1 al 14");
                    break;
            }
        } while (!salir.equals("s"));

    }

}
