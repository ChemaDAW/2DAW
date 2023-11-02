
import java.util.Scanner;

public class morse_chema// Hecho por Jose Maria Fernandez Garzon
{// CLASS
    static Scanner teclado = new Scanner(System.in);

    public static void main(String args[]) {// MAIN
        menu();
    }

    public static void menu() {// Metodo del menu del principio
        // Declaracion de variables
        boolean salir = false;
        char salir1 = 'a';
        int menu;
        // codigo del metodo
        while (!salir) {

            System.out.printf("1. Traducion de castellano a morse\n");// Opcion 1
            System.out.printf("2. Traduccion de morse a castellano\n");// Opcion 2
            System.out.printf("3. Salir\n");// Salir de programa

            System.out.printf("¿Que opcion quieres?\n");
            menu = teclado.nextInt();

            switch (menu) {
                case 1:// Opcion 1
                    castMorse();
                    break;
                case 2:// Opcion 2
                    morseCast();
                    break;
                case 3:// Salir
                    System.out.printf("Quieres salir s/n\n");
                    salir1 = teclado.next().charAt(0);
                    if (salir1 == 's' && salir1 == 's')// Confirmacion de salida
                        salir = true;
                    else
                        salir = false;
                    break;
                default:// DEdault por si el usuario no escoge una opcion correcta
                    System.out.printf("Solo numeros del 1 al 4,decide que quieres hacer\n");
            }

        }
        teclado.close();// Cerramos el teclado

    }

    public static void morseCast() {
        // Declaracion de variables
        String convMorse[] = new String[36]; // Creamos un array para almacenar todos los codigos morse
        String frase = new String();// Creamos la variable frase para almacenar el codigo morse
        System.out.printf("\t\tBienvenido al conversor de morse a castellano\n");
        System.out.printf("Dime el codigo morse que quieres traducir\n");
        frase = teclado.nextLine();// Alamacenamos en la variable
        frase = teclado.nextLine();// Alamacenamos en la variable

        String caracteres = "abcdefghijklmnopqrstuvwxyz0123456789";// Ponemos todo el abecedario y numeros
        String castellano = new String();// Creamos la variable que nos va a servir para almacenar el resultado de la
                                         // conversion
        // Codigo del metodo

        // Metemos todos los codigos morse en el array por orden
        convMorse[0] = ".-";
        convMorse[1] = "-...";
        convMorse[2] = "-.-.";
        convMorse[3] = "-..";
        convMorse[4] = ".";
        convMorse[5] = "..-.";
        convMorse[6] = "--.";
        convMorse[7] = "....";
        convMorse[8] = "..";
        convMorse[9] = ".---";
        convMorse[10] = "-.-";
        convMorse[11] = ".-..";
        convMorse[12] = "--";
        convMorse[13] = "-.";
        convMorse[14] = "---";
        convMorse[15] = ".--.";
        convMorse[16] = "--.-";
        convMorse[17] = ".-.";
        convMorse[18] = "...";
        convMorse[19] = "-";
        convMorse[20] = "..-";
        convMorse[21] = "...-";
        convMorse[22] = ".--";
        convMorse[23] = "-..-";
        convMorse[24] = "-.--";
        convMorse[25] = "--..";
        convMorse[26] = ".----";
        convMorse[27] = "..---";
        convMorse[28] = "...--";
        convMorse[29] = "....-";
        convMorse[30] = ".....";
        convMorse[31] = "-....";
        convMorse[32] = "--...";
        convMorse[33] = "---..";
        convMorse[34] = "----.";
        convMorse[35] = "-----";

        String separador[] = frase.split(" ");// Aqui separamos donde exista un espacio en blanco
        int maximo = separador.length;// Cogemos la longitud se sera su maximo
        for (int i = 0; i < maximo; i++)// Recorremos la frase entera
        {
            for (int e = 0; e < 36; e++)// Recorremos el array entero que son 36
            {
                if (separador[i].equals(convMorse[e])) // Con el split conseguimos que se separen el morse entonces
                                                       // buscamos con el equal si coincide
                {
                    castellano += caracteres.charAt(e);// Si coincide lo almacenamos en castellano
                    break;
                }
            }

        }
        System.out.printf("La frase en castellano es: \n" + castellano + "\n");// lo monstramos por pantalla

    }

    public static void castMorse() {
        // Declaracion de variables
        String frase = new String();// Creamos la variable para almacenar la frase
        // Codigo del metodo
        System.out.printf("\t\tBienvenido al conversor de castellano a codigo morse\n");
        System.out.println("Dime la frase y te la convierto en morse:");
        frase = teclado.nextLine();
        frase = teclado.nextLine();
        frase.toLowerCase();// Aqui se convierte toda la frase en minuscula para que nos sea mas facil
        frase = frase.replace(" ", "");// Quitamos los espacios con un replace
        // A partir de aqui remplazamos los caracteres normales por los morse
        frase = frase.replace("a", ".-  ");
        frase = frase.replace("b", "-...  ");
        frase = frase.replace("c", "-.-.  ");
        frase = frase.replace("d", "-..  ");
        frase = frase.replace("e", ".  ");
        frase = frase.replace("f", "..-.  ");
        frase = frase.replace("g", "--.  ");
        frase = frase.replace("h", "....  ");
        frase = frase.replace("i", "..  ");
        frase = frase.replace("j", ".---  ");
        frase = frase.replace("k", "-.-  ");
        frase = frase.replace("l", ".-..  ");
        frase = frase.replace("m", "--  ");
        frase = frase.replace("n", "-.  ");
        frase = frase.replace("o", "---  ");
        frase = frase.replace("p", ".--.  ");
        frase = frase.replace("q", "--.-  ");
        frase = frase.replace("r", ".-.  ");
        frase = frase.replace("s", "...  ");
        frase = frase.replace("t", "-  ");
        frase = frase.replace("u", "..-  ");
        frase = frase.replace("v", "...-  ");
        frase = frase.replace("w", ".--  ");
        frase = frase.replace("x", "-..-  ");
        frase = frase.replace("y", "-.--  ");
        frase = frase.replace("z", "--..  ");
        frase = frase.replace("0", ".----  ");
        frase = frase.replace("1", "..---  ");
        frase = frase.replace("2", "...--  ");
        frase = frase.replace("3", "....-  ");
        frase = frase.replace("4", ".....  ");
        frase = frase.replace("5", "-....  ");
        frase = frase.replace("6", "--...  ");
        frase = frase.replace("7", "---..  ");
        frase = frase.replace("8", "----.  ");
        frase = frase.replace("9", "-----  ");
        // Escribimos la frase
        System.out.printf("La frase en codigo morse es: \n\n" + frase + "\n\n");

    }

}

// FINMAIN
