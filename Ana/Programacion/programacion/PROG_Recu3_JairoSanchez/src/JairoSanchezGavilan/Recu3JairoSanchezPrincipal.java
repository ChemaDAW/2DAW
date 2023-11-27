//Jairo Sánchez Gavilán 1º DAW
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JairoSanchezGavilan;

/**
 *
 * @author Jairo
 */
import java.util.*;
public class Recu3JairoSanchezPrincipal {
    static Scanner teclado = new Scanner (System.in);
    public static void main(String[] args) {
       ArrayList <Esfera> esferas = new ArrayList<>();
               
        int opcion;
        boolean salir=false;
        float coordY = 0;
        float coordX = 0;
        float radio = 0;
        int cantidadEsferas = 0;
        int opcionEsfera = 0;
        int esfera1 = 0;
        int esfera2 = 0;
        boolean coordenadaValida = true;
        do {
            System.out.println("OPCION 0. SALIR");
            System.out.println("OPCION 1. CREAR ESFERAS");
            System.out.println("OPCION 2. MOSTRAR LISTA DE ESFERAS");
            System.out.println("OPCION 3. CALCULAR PERIMETRO DE ESFERA");
            System.out.println("OPCION 4. CALCULAR AREA DE ESFERA");
            System.out.println("OPCION 5. COMPARAR 2 ESFERAS");


            System.out.print("Opcion: ");
            opcion = pedirNum();
            switch (opcion) {
                case 0: // salir
                    salir=confirmarSalida();
                    break;
                case 1: // add arraylist
                    System.out.println("Cuantas esferas quieres crear? ");
                    cantidadEsferas = teclado.nextInt();
                    for (int i = 0; i < cantidadEsferas; i++) {
                    System.out.println("Crear esferas: ");
                    System.out.println("Límites: X (0-30), Y(0-30) Y RADIO (0-12");           
                    System.out.println("Coordenada Y: ");
                    coordY = teclado.nextFloat();
                     if (coordY >30 || coordY < 0){
                        coordenadaValida = false;
                    }
                    System.out.println("Coordenada X: ");
                    coordX = teclado.nextFloat();
                     if (coordX >30 || coordX < 0){
                        coordenadaValida = false;
                    }
                    System.out.println("Radio: ");
                    radio = teclado.nextFloat();
                    if (radio >12 || radio < 0){
                        coordenadaValida = false;
                    }
                    if (coordenadaValida == false){
                        System.out.println("1 de los datos introducidos sale del rango, vuelve a intentarlo");
                        break;
                    }
                    Punto p = new Punto(coordX,coordY);
                    esferas.add(new Esfera (p,radio));
                    }

                    break;
                case 2:
                    if (esferas.size() == 0){
                        System.out.println("No hay ningun elemento dentro de la lista aún");
                        break;
                    }
                    System.out.println("Mostrar ArrayList de Esferas: ");
                    System.out.println(esferas.toString()); // MUESTRA DEL ARRAYLIST CON TOSTRING
                    break;
                case 3: // perimetro
                    if (esferas.size() == 0){
                        System.out.println("No hay ningun elemento dentro de la lista aún");
                        break;
                    }
                    for (int i = 0; i < esferas.size(); i++) {
                        System.out.println(i + ". " + esferas.get(i));
                    }
                    System.out.println("¿El perimetro de que esfera quieres calcular?");
                    opcionEsfera = teclado.nextInt();
                    System.out.println("PERIMETRO: ");
                    System.out.println(esferas.get(opcionEsfera).obtenerPerimetro());
                    break;
                case 4: // area
                    if (esferas.size() == 0){
                        System.out.println("No hay ningun elemento dentro de la lista aún");
                        break;
                    }
                    for (int i = 0; i < esferas.size(); i++) { // MUESTRA DEL ARRAYLIST SIN TOSTRING
                        System.out.println(i + ". " + esferas.get(i));
                    }
                    System.out.println("¿El area de que esfera quieres calcular?");
                    opcionEsfera = teclado.nextInt();
                    System.out.println("AREA: ");
                    System.out.println(esferas.get(opcionEsfera).obtenerArea()); 
                    break;
                case 5:
                        if (esferas.size() == 0){
                        System.out.println("No hay ningun elemento dentro de la lista aún");
                        break;
                    }
                        System.out.println("Lista de esferas: ");
                    for (int i = 0; i < esferas.size(); i++) {   // MUESTRA DEL ARRAYLIST SIN TOSTRING
                        System.out.println(i + ". " + esferas.get(i));
                    }
                    System.out.println("¿Que 2 esferas quieres comparar?");
                    esfera1 = teclado.nextInt();
                    System.out.println("¿Que otra esfera quieres comparar?");
                    esfera2 = teclado.nextInt();
                    esferas.get(esfera1).compararEsfera(esferas.get(esfera2));
                 break;
                default: // default
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
        
}
