import java.util.Scanner;

public class Ej20_chema //HECHO POR JOSE MARIA FERNANDEZ GARZON
{
     public static void main (String args[])
     {
     //DECLARACION DE VARIABLES
    Scanner teclado=new Scanner(System.in);
    float num1=0,suma=0;
    //Desarrollamos el programa
    
    do{
        suma+=num1;
        System.out.println("cuanto dinero dispones en algun sitio ");
        num1=teclado.nextFloat();
    }while(num1!=0);
    
   
    System.out.println("La suma de todo lo que tienes es "+suma);


        
        

    
    
    }//FIN_MAIN
}//FIN_CLASS


