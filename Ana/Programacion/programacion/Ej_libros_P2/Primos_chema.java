import java.util.Scanner;

public class Primos_chema//HECHO POR JOSE MARIA FERNANDEZ GARZON
{
     public static void main (String args[])
     {
     //DECLARACION DE VARIABLES
      boolean condicion;
      int num1;
    Scanner teclado=new Scanner(System.in);
    //DESARROLO DEL PROGRAMA
       System.out.println("Dime un numero y te dire el rango de 1 hasta tu numero cuales son primos");
       num1=teclado.nextInt();
      for(int i=2;i<num1;i--)
        {
            if(num1%i==0)
            condicion=false;
            break;
           

             if(condicion){
                System.out.println(num1+" Es primo") ;  }
             else{
                System.out.println(num1+" No es primo")  ; }
        
             }
      
    
    
    }//FIN_MAIN
}//FIN_CLASS


