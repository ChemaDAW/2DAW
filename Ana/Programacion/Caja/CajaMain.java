import java.util.Scanner;

public class CajaMain {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        double volumen;
        String tusMuertosAna="";
        Caja caja1=new Caja(12, 31, 41, Unidad.centimetros, 32.42);
        CajaCarton caja2=new CajaCarton(12, 23, 42, Unidad.centimetros, 32.12);
        volumen=caja1.getVolumen();
        System.out.println("Que quieres");
        tusMuertosAna=teclado.nextLine();
        if(tusMuertosAna.equals("centimetros")){
            caja1.setUnidad(Unidad.centimetros);
        }
        else if(tusMuertosAna.equals("metros")){
            caja1.setUnidad(Unidad.metros);
        }
        else{
            System.out.println("Invalido");
        }
        System.out.println(caja1.toString());
        System.out.println(caja2.toString());

    }
}
