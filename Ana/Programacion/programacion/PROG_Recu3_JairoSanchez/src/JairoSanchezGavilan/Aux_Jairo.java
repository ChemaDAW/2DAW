/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author jairo
 */
public class Aux_Jairo {
  //colores
    static final String ROJO = "\u001B[31m";
    static final String VERDE = "\u001B[32m";
    static final String AZUL = "\u001B[36m";
    static final String AMARILLO = "\u001B[33m";
    static final String RESET = "\u001B[0m";
    //peticiones
    public static char pedirLetra() {
        return new Scanner(System.in).next().charAt(0);
    }
    public static int pedirNum() {
        int num;
        try {
            num = new Scanner(System.in).nextInt();
            return num;
        } catch (InputMismatchException e) {
            System.out.println("¡Introduce un número entero!");
            return pedirNum();
        }
    }
    //menu y salida
    public static void usarMenu() {
        int opcion;
        boolean salir=false;
        do {
            //MOSTRAR OPCIONES MENU
            System.out.print("Opcion: ");
            opcion = pedirNum();
            switch (opcion) {
                case 0:
                    salir=confirmarSalida();
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("No válido.");
            }
        }while(salir!=true);
    }
    public static boolean confirmarSalida() {
        boolean salir;
        char c;
        System.out.println("Seguro que quieres salir? s=salir");
        c = new Scanner(System.in).next().charAt(0);
        c=Character.toLowerCase(c);
        salir = c=='s';
        return salir;
    }
}  

