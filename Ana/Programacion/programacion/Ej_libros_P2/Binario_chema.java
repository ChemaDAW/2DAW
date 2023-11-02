import java.util.Scanner;

public class Binario_chema//HECHO POR JOSE MARIA FERNANDEZ GARZON
{
     public static void main (String args[])
     {
     //DECLARACION DE VARIABLES
   int decimal,modulo;
    Scanner teclado=new Scanner(System.in);
    String binario="";
    //DESARROLO DEL PROGRAMA
    System.out.println("Ingresa el numero decimal");
    decimal=teclado.nextInt();

    while(decimal>0)
    {
        modulo=(decimal%2);
        binario=modulo+binario;
        decimal=decimal/2;
    }
    System.out.println("El numero en decimal es "+binario);
      
    
    teclado.close();
    }//FIN_MAIN
}//FIN_CLASS


