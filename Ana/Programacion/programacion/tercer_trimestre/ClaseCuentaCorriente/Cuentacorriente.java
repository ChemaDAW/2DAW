/*Almacenar los datos (dni,nombre,saldo)
(crear cuenta(dni,nombre del titular,saldo inicial=0)
sacar dinero(si ha sido posible llevar el metodo)
ingresar dinero()
mostrar info
*/
package ClaseCuentaCorriente;

import clasePersona.*;

import java.util.Scanner;

public class Cuentacorriente {
    String nombre;
    String dni;
    int saldo;
    Scanner teclado = new Scanner(System.in);

    // METODOS DE LA CLASE
    private void sacarDinero(int dineroSacar) {
        if (dineroSacar > saldo) {
            System.out.println("No se ha podido realizar la operacion");
        } else {
            this.saldo = saldo - dineroSacar;
        }
    }

    private void ingresarDinero(int dineroMeter) {
        this.saldo = saldo + dineroMeter;
    }

    public void informacion() {
        System.out.println("Hola buenas " + this.nombre);
        System.out.println("Tu dni es " + this.dni);
        System.out.printf("Tu saldo es " + saldo + "\n\n");
    }

    // CONSTRUCTORES DE LA CLASE
    public Cuentacorriente() {
    }

    public Cuentacorriente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = 0;
    }

    public Cuentacorriente(String nombre, String dni, int saldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = saldo;
    }

    // MAIN
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dineroSacar = 50;
        int dineroMeter = 20;
        int menu = 0;
        int menu1 = 0;
        int intentos = 0;
        Cuentacorriente nueva;

        Cuentacorriente chema;
        chema = new Cuentacorriente("chema", "54309658", 5);

        Cuentacorriente angel;
        angel = new Cuentacorriente("angel", "54309465", 534);

        while (intentos <= 3) {
            System.out
                    .printf("\tQue opciones quieres coger\n1-Entrar como chema\n2-Entrar como angel\n3-Crear cuenta\n");
            menu = teclado.nextInt();
            switch (menu) {
                case 1:
                    System.out.printf(
                            "\tQue opciones quieres coger\n1-Ingresar dinero\n2-Sacar dinero\n3-Ver informacion\n");
                    menu1 = teclado.nextInt();
                    switch (menu1) {
                        case 1:
                            chema.ingresarDinero(dineroMeter);
                            break;
                        case 2:
                            chema.sacarDinero(dineroSacar);
                            break;
                        case 3:
                            chema.informacion();
                            break;
                    }
                    break;
                case 2:
                    System.out.printf(
                            "\tQue opciones quieres coger\n1-Ingresar dinero\n2-Sacar dinero\n3-Ver informacion\n");
                    menu1 = teclado.nextInt();
                    switch (menu1) {
                        case 1:
                            angel.ingresarDinero(dineroSacar);
                            break;
                        case 2:
                            angel.sacarDinero(dineroSacar);
                            break;
                        case 3:
                            angel.informacion();
                            break;
                    }
                    break;
                case 3:
                    nueva = new Cuentacorriente("jairo", "546505");
                    nueva.informacion();
                    break;

            }
            intentos++;
        }
        teclado.close();

    }

}