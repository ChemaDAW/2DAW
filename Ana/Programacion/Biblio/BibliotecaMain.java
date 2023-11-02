import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaMain {
        static Scanner teclado = new Scanner(System.in);   
        static ArrayList <Libro> libro=new ArrayList<>();
        static ArrayList bibliotecas=new ArrayList<>();
        static ArrayList <Biblioteca>bibliotecas1=new ArrayList<>();
        public static void main(String[] args) {
        int menu=0;
        Libro libro1=new Libro("El rey de la ");
        Libro libro3=new Libro("El rey de la selva");
        Libro libro2=new Libro("El rey de  ");
        libro.add(libro1);
        libro.add(libro2);
        libro.add(libro3);
        System.out.println(libro.toString());
        do {
            
       
        do {
        try {   
        System.out.println("¿Que libro quieres añadir a la biblioteca 0-?"+libro.size()+"introduce un -1 para acabar");
            menu=teclado.nextInt();
            bibliotecas.add(libro.get(menu));
        } catch (Exception e) {
            System.out.println("no hay tantos libros");
        }    

        } while (menu!=50);
            Biblioteca biblio=new Biblioteca();
            bibliotecas1.add(biblio);
         } while (menu==32);
         System.out.println(biblio.toString());
        }
    }
