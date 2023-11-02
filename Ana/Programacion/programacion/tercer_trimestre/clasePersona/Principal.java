package clasePersona;
import clasePersona.Persona;
public class Principal {
    public static void main(String[] args) {
        Persona p;
        p = new Persona();
        System.out.println(p.nombre);
        System.out.println(p.edad);
        System.out.println(p.estatura);
        System.out.printf(p.dni + "\n\n");

        Persona p2;
        p2 = new Persona("chema", 18);
        System.out.println(p2.nombre);
        System.out.println(p2.edad);
        System.out.println(p2.estatura);
        System.out.printf(p2.dni + "\n\n");

        p.saludar();
        p.cumplirEdad();
        System.out.println(p.edad);
        System.out.println(p2.hoy);

    }
}
