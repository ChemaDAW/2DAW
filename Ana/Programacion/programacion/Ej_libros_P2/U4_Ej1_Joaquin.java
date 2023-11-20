import java.util.Scanner;

public class U4_Ej1_Joaquin {
  public static void main(String []args){
    //Declaración variables
       Scanner teclado=new Scanner(System.in);
       int n;
       boolean vocal=true;
    //Desarrollo del programa 
    eco();
    enteros();
    mayor();
    primo=esPrimo();   
    }// Fin_main

   public static void eco() {
      int n;
      n = teclado.nextInt();
      for (int i = 1; i != n; i++) {
         System.out.println("Eco");
      } // Fin_for
   }// Fin_Eco

   public static void enteros() {
      int primero, segundo, menor;
      primero = teclado.nextInt();
      segundo = teclado.nextInt();
      if (segundo < primero) {
         menor = segundo;
      } else {
         menor = primero;
         primero = segundo;
      }
      for (int i = menor; i != primero; i++) {
         System.out.println(menor);
      } // Fin_for
   }// Fin_enteros

   public static void mayor() {
      int primero, segundo, mayor;
      primero = teclado.nextInt();
      segundo = teclado.nextInt();
      if (segundo > primero) {
         mayor = segundo;
      } else {
         mayor = primero;
      }
      System.out.println(mayor);
   }// Fin_enteros

   public static void vocal() {
      teclado.nextLine();
   }// Fin vocal

   public static boolean esPrimo(int n){
    boolean primo=true;
    int contador=0;
    for(byte i=1;(i<=numero);i++){
       if(numero%i==0){
          contador++;
       }
    }
    primo=((contador==2)?true:false);
       System.out.println("El numero es primo: "+primo);
    }// Fin esPrimo
}// Fin_class
