import java.util.Scanner;

public class U4_R1 //HECHO POR JOSE MARIA FERNANDEZ GARZON
{
    public static void main (String args[])
    {
        Scanner teclado=new Scanner(System.in);
        boolean victor;
        boolean primo1;
        eco();

        enteros();

        mayor();

        System.out.println("Dime un caracter y te dire si es una vocal");
        char caracter=teclado.nextLine().charAt(0);
        victor=vocales(caracter);
        if(victor)
            System.out.println("Es vocal");
        else
        {
        System.out.println("Es consonante");
        }
  
         System.out.println("Dime un numero y te dire si es primo");
        int n=teclado.nextInt();
         primo1=esPrimo(n); 
         if(primo1)
            System.out.println("Es primo");
        else
        {
        System.out.println("No es primo");
        }


    
    
    }//FIN_MAIN
    public static void eco()
    {
        Scanner teclado=new Scanner(System.in);
        int n;
        System.out.println("Dime un numero y te pondre ecos segun el numero");
        n=teclado.nextInt();
        for(int i=1;i<=n;i++)
        {
        System.out.println("Eco");
        }
    }
    public static void enteros()
    {
        Scanner teclado=new Scanner(System.in);
        int num1,num2;
        System.out.println("Dime el primer numero");
        num1=teclado.nextInt();
        System.out.println("Dime el segundo numero,y te dire los numero que hay entre ellos");
        num2=teclado.nextInt();
        if(num2>num1)
        {
            for(int aux=num1;aux<=num2;aux++)
            System.out.println(aux);
        }
        else
        {
            for(int aux2=num2;aux2<=num1;aux2++)
            System.out.println(aux2);
        }
    }
    public static void mayor()
    {
        Scanner teclado=new Scanner(System.in);
        int num1,num2;
        System.out.println("Dime el primer numero");
        num1=teclado.nextInt();
        System.out.println("Dime el segundo numero,y te dire cual es el mayor");
        num2=teclado.nextInt();
        if(num2>num1)
        {
            System.out.println("El mayor es "+num2);
        }
        else
        {
            System.out.println("El mayor es "+num1);
        }
    }
    public static boolean vocales(char caracter)
    {
        boolean vocal=true;
        if(caracter=='a' || caracter=='e'|| caracter=='i'|| caracter=='o'||caracter=='u')
        {
            vocal=true;
        }
        else
        {
            vocal=false;
        }
        return vocal;
    }
        
        public static boolean esPrimo(int n)
        {
            boolean primo=true;
            int contador=0;
            for(byte i=1;(i<=n);i++)
            {
               if(n%i==0)
               {
                  contador++;
               }
            }
            if(contador==2)
            {
                primo=true;
            }
            else
            {
                primo=false;
            }
            if(n==4||n==1)
            {
                primo=false;
            }
            return primo;
        }
        
    

    
}//FIN_CLASS


