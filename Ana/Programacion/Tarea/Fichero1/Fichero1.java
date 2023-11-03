import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fichero1 {
    public static void main(String[] args) {
        Escribiendo accede_es = new Escribiendo();
        accede_es.escribir();
        Leer_Fichero accediendo = new Leer_Fichero();
        accediendo.leer();
    }
}

class Escribiendo {
    public void escribir() { 
        String frase = "Curso 2022 2023. Primero DAW.\nEstamos aprendiendo a programar en Java.";
        try {
            FileWriter escritura = new FileWriter("Fichero1.txt");
            escritura.write(frase);
            escritura.close();
            System.out.println("Archivo escrito correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Leer_Fichero {
    public void leer() {
        try {
            FileReader entrada = new FileReader("Fichero1.txt");
            int c;
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
