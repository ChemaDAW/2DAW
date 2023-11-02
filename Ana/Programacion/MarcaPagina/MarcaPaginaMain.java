
import java.util.Scanner;

public class MarcaPaginaMain {
 public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        int menu = 0;
        int menu1 = 0;
        boolean salir = true;
        String salir1 = "";
        boolean iguales = true;
        MarcaPagina libro;
        MarcaPagina libro2;
        libro = new MarcaPagina(50);
        libro2 = new MarcaPagina();

        do {
            System.out.printf(
                    "\tQue opciones quieres coger\n1-Pasar pagina libro 1\n2-Pasar pagina libro 2\n3-Ver informacion de las paginas\n4-Comprobar si son iguales\n5-Salir\n");
            menu1 = teclado.nextInt();
            switch (menu1) {
                case 1:
                    libro.otraPagina();
                    libro.rango();
                    libro.mostrar();
                    ;
                    break;
                case 2:
                    libro2.otraPagina();
                    libro2.rango();
                    libro2.mostrar();
                    break;
                case 3:
                    libro.mostrar();
                    libro2.mostrar();
                    break;
                default:
                    System.out.println("Selecciona del 0-5");
                    break;
                case 5:
                    teclado.nextLine();
                    System.out.println("Si quieres salir pon s");
                    salir1 = teclado.nextLine();
                    salir1 = salir1.toLowerCase();
                case 4:
                   libro.compararLibro(libro2);
                    
                    break;
            }
        } while (!salir1.equals("s"));
        teclado.close();
    }
 }   

