import java.util.Scanner;

public class Ej15_chema_pascal//HECHO POR JOSE MARIA FERNANDEZ GARZON
{
     public static void main (String args[])
     {
     //DECLARACION DE VARIABLES
    int n,e;
    Scanner teclado=new Scanner(System.in);
    //DESARROLO DEL PROGRAMA
   System.out.print("Ingrese el numero de filas: ");
   n=teclado.nextInt();
   for(int i=0;i<n;i++)
        {
        e=1;
        for(int j=0;j<=i;j++){
            System.out.print(e+" ");
             e=e*(i-j)/(j+1);
                            }
        System.out.println("");
        }

    
    teclado.close();
    }//FIN_MAIN
}//FIN_CLASS


