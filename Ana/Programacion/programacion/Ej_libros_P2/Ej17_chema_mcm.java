import java.util.Scanner;

public class Ej17_chema_mcm//HECHO POR JOSE MARIA FERNANDEZ GARZON
{
     public static void main (String args[])
     {
     //Definimos las varibales
    int num1;
    int num2;
    Scanner teclado=new Scanner(System.in);

    //Desarrollamos el programa
    System.out.println("Indica el primer numero: ");
    num1=teclado.nextInt();
    System.out.println("Indica el segundo numero: ");
    num2=teclado.nextInt();
    
    while(num1 != num2)
    { 
        if(num1>num2) 
        {
            num1= num1-num2;
        } else 
        {
            num2= num2-num1;
        }
    }
    
    System.out.println("El Máximo Común Divisor es:" + num1);

    teclado.close();

    
    }//FIN_MAIN
}//FIN_CLASS


