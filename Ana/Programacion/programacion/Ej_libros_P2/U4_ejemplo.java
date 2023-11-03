import java.util.Scanner;

public class U4_ejemplo// HECHO POR JOSE MARIA FERNANDEZ GARZON
{
  public static void main(String args[]) {
    // Definimos las varibales
    char c, d;
    int num, aux;
    // Desarrollamos el programa
    c = 'w';
    System.out.println("El caracter es " + c);
    d = 98;
    c = '\u2662'; // usamos el code point en decimal
    System.out.println("Ahora el caracter es " + c + " y " + d);

    // Comillas
    c = '\'';
    System.out.println("Ahora mostramos unas comillas " + c);

    // casting
    num = 'a';
    System.out.println(num);
    aux = '\u0062';
    System.out.println(aux);
    d = 'b';
    System.out.println(d);

    // Forzamos las conversiones con el casting
    System.out.println("Vamos a hacer un casting a enteros");
    System.out.println((int) d);
    num = 97;
    System.out.printf("Otra forma de hacer un casting a enteros\n");

    System.out.println((char) num);
    System.out.printf("Otra forma de hacer un casting a char\n");
    d = (char) num;
    System.out.println("Valor de num " + d);
    System.out.printf("Otra forma de hacer un casting a char\n");

  }// FIN_MAIN
}// FIN_CLASS
