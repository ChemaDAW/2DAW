import java.util.*;
import java.io.*;
public class Fichero7 {
    public static void main(String[] args) {
        Administrador jefe=new Administrador("Chema",80000,2005,12,15);
        Empleado[] personal=new Empleado[3];
        personal[0]=jefe;
        personal[1]=new Empleado("Luisa",2000,2004,12,15);
        personal[2]=new Empleado("Roberto",1999,2004,12,15);
        try {
            ObjectOutputStream escribiendo_fichero=new ObjectOutputStream(new FileOutputStream("<Escritorio>/TemaFicherosJava/FicheroSerializado.dat")) ;
            escribiendo_fichero.writeObject(personal);
            escribiendo_fichero.close();
            ObjectInputStream recuperando_fichero=new ObjectInputStream(new FileInputStream("<Escritorio>/TemaFicherosJava/FicheroSerializado.dat"));
            Empleado[] personal_recuperado=(Empleado[])recuperando_fichero.readObject();
            recuperando_fichero.close();
            for(Empleado e:personal_recuperado){
                System.out.println(e);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

class Empleado implements Serializable{
    public Empleado(String n,double s,int agno,int mes,int dia){
    nombre=n;
    sueldo=s;
    GregorianCalendar calendario=new GregorianCalendar(agno, mes, dia);
    fechaContrato=calendario.getTime();
    }
    public String toString(){
        return "Nombre="+this.nombre+",sueldo= "+this.sueldo+", fecha de contrato= "+this.fechaContrato;
    }
   private String nombre;
   private double sueldo;
   private Date fechaContrato;
}

class Administrador extends Empleado{
    public Administrador(String n,double s,int agno,int mes,int dia){
        super(n, s, agno, mes, dia);
        incentivo=0;
    }
    public String toString(){
        return super.toString()+"Incentivo="+this.incentivo;
    }
    private double incentivo;

}