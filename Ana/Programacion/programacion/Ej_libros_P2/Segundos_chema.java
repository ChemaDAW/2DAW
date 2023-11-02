import java.util.Scanner;

public class Segundos_chema//HECHO POR JOSE MARIA FERNANDEZ GARZON
{
     public static void main (String args[])
     {
     //DECLARACION DE VARIABLES
   int segundos=0;
   int minutos=0;
   int horas=0;
   int segundos2=0;
   int aux=0;
    Scanner teclado=new Scanner(System.in);
    //DESARROLO DEL PROGRAMA
    System.out.println("Dime la hora");
    horas=teclado.nextInt();
     System.out.println("Dime los minutos");
    minutos=teclado.nextInt();
    System.out.println("Dime los segundos");
    segundos=teclado.nextInt();

  
    while(segundos2>-1)
       { 
         
            segundos+=segundos2;
           if(segundos>59)
                aux=segundos/60;
                minutos+=aux;
                segundos-=60*aux; 
                aux=0;
           if(minutos>59){
                aux=(minutos/60);
                horas+=aux;
                minutos-=60*aux;}
     System.out.println("La hora es "+horas+":"+minutos+":"+segundos);
     System.out.println("Dime los segundos que quieres sumar");
     segundos2=teclado.nextInt();

        
                
        }
      
    
    teclado.close();
    }//FIN_MAIN
}//FIN_CLASS


