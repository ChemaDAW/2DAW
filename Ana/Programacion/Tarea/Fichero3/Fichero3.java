import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fichero3 {
    public static void main(String[] args) {
        Escribiendo3 accede_es = new Escribiendo3();
        accede_es.escribir3();
    }
}

class Escribiendo3 {
    public void escribir3() {
        String frase = "Contenido de salida.txt\n:Estamos escribiendo a traves de streams de datos.\nIES Murgi ( El Ejido) Almeria\nCurso 2022 2023.\nCFGS DAW.\n";
        try {
            FileWriter escritura = new FileWriter("salida.txt");
            escritura.write(frase);
            escritura.close();
            System.out.println("Archivo escrito correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

