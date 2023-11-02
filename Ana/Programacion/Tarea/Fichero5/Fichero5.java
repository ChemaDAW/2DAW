import java.io.FileInputStream;

public class Fichero5 {
    public static void main(String[] args) {
        try {
            FileInputStream archivo_lectura=new FileInputStream("C:\\Users\\chema\\Desktop\\IesMurgi.jpeg");
            boolean final_ar=false;
            while(!final_ar){
                int byte_entrada=archivo_lectura.read();
                if(byte_entrada==-1){
                    final_ar=true;
                    System.out.println(byte_entrada);
                }
            }
            archivo_lectura.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
