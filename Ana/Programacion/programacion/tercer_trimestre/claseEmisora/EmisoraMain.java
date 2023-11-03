package claseEmisora;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class EmisoraMain {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menu = 0;
        int menu1 = 0;
        boolean salir = true;
        String salir1 = "";
        boolean iguales = true;
        Emisora chema;
        Emisora chema2;
        chema = new Emisora(90);
        chema2 = new Emisora();

        do {
            System.out.printf(
                    "\tQue opciones quieres coger\n1-Bajar la emisora\n2-Subir la emisora\n3-Ver informacion emisora\n4-Comprobar si son iguales\n5-Salir\n");
            menu1 = teclado.nextInt();
            switch (menu1) {
                case 1:
                    chema.bajarEmisora(chema.sintonizador);
                    ;
                    break;
                case 2:
                    chema.subirEmisora(chema.sintonizador);
                    break;
                case 3:
                    chema.informacion();
                    chema2.informacion();
                    break;
                default:
                    System.out.println("Selecciona del 1-4");
                    break;
                case 5:
                    teclado.nextLine();
                    System.out.println("Si quieres salir pon s");
                    salir1 = teclado.nextLine();
                    salir1 = salir1.toLowerCase();
                case 4:
                    chema.compararEmisoras(chema2, chema);
                    iguales = chema.compararEmisoras(chema2, chema);
                    if (iguales) {
                        System.out.println("Son iguales");
                    } else {
                        System.out.println("Son diferentes");
                    }
                    break;

            }
        } while (!salir1.equals("s"));
        teclado.close();
    }

}
