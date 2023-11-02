import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fichero2 {
    public static void main(String[] args) {
        Leer_Fichero2 accediendo = new Leer_Fichero2();
        accediendo.leer2();
    }
}

class Leer_Fichero2 {
    public void leer2() {
        try {
            FileReader entrada = new FileReader("C:\\Users\\chema\\Documents\\Ficheros\\salida.txt");
            int c=0;
            while ((c = entrada.read()) != -1) {
                char letra = (char) c;
                System.out.print(letra);
            }
            entrada.close();
        } catch (IOException e) {
            System.out.println("Archivo no encontrado.");
        }
    }
}
