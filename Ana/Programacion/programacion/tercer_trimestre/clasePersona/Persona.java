package clasePersona;

public class Persona {
    static public String nombre;
    String dni;
    int edad;
    double estatura;
    static String hoy = "lunes";

    // METODOS DE LA CLASE
    void saludar() {
        System.out.println("Hola,mi nombre es " + nombre);
    }

    void cumplirEdad() {
        this.edad++;
    }

    // CONSTRUCTORES DE LA CLASE
    public Persona() {
        this.dni = "00000";
        this.nombre = "pepe";
        this.edad = 16;
        this.estatura = 1.50;
    }

    public Persona(String nombre, int edad, double estatura, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.dni = dni;
    }

    public Persona(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

}