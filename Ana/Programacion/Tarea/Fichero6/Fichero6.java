import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Fichero6 {
    public static void main(String[] args) {
        int contador=0;
        int datos_entrada[]=new int[74130];
        try {
            FileInputStream archivo_lectura=new FileInputStream("C:\\Users\\chema\\Desktop\\IesMurgi.jpeg");
            boolean final_ar=false;
            while(!final_ar){
                int byte_entrada=archivo_lectura.read();
                if(byte_entrada!=-1){
                    datos_entrada[contador]=byte_entrada;
                }
                else{
                    final_ar=false;
                    System.out.println(datos_entrada[contador]);
                    contador++;
                }
                archivo_lectura.close();
            }
        } catch (Exception e) {
           System.out.println("Error al acceder a la imagen");
        }
        crea_fichero(datos_entrada);
    }
static void crea_fichero(int datos_nuevos_fichero[]){
    try {
        FileOutputStream fichero_nuevo=new FileOutputStream("C:\\Users\\chema\\Desktop\\copia_IesMurgi.jpeg");
        for(int i=0;i<datos_nuevos_fichero.length;i++){
            fichero_nuevo.write(datos_nuevos_fichero[i]);

        }
        fichero_nuevo.close();


    } catch (Exception e) {
        // TODO: handle exception
    }
}
}
