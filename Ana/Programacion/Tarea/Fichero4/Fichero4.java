import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fichero4 {
    public static void main(String[] args) {
        Leer_Fichero4 accediendo = new Leer_Fichero4();
        accediendo.leer4();
    }
}

class Leer_Fichero4 {
    public void leer4() {
        try {
            FileReader entrada4 = new FileReader("salida.txt");
            BufferedReader mibuffer=new BufferedReader(entrada4);
            String linea="";
            while (linea!=null) {
                linea=mibuffer.readLine();
                if(linea!=null){
                    System.out.print(linea);
                }
                
            }
            entrada4.close();
        } catch (IOException e) {
            System.out.println("Archivo no encontrado.");
        }
    }
}
 
