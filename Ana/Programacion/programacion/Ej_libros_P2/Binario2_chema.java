import java.util.Scanner;

public class Binario2_chema//HECHO POR JOSE MARIA FERNANDEZ GARZON
{
     public static void main (String args[])
     {
     //DECLARACION DE VARIABLES
   int num,ultimoDigito, c=0,decimal=0;
    Scanner teclado=new Scanner(System.in);

    //DESARROLO DEL PROGRAMA
    System.out.println("Ingresa el numero binario");
    num=teclado.nextInt();

    while(num!=0)
    {
        ultimoDigito=num%10;
        decimal+=ultimoDigito*Math.pow(2,c);
        c++;
        num/=10;
    }
    System.out.println("El numero en decimal es "+decimal);
      
    
    teclado.close();
    }//FIN_MAIN
}//FIN_CLASS


