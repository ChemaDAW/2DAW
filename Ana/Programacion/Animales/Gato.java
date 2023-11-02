package Animales;

import java.util.*;

class Gato {
    private String nombre;
    private int edad;
    private String sexo;

    public Gato() {
        this.nombre = "Garfield";
        this.edad = 2;
        this.sexo = "HERMAFRODITA";
    }

    public Gato(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void jugarCon(Gato otroGato) {
        System.out.println(nombre + " está jugando con " + otroGato.getNombre());
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void jugar() {
        System.out.println("El gato " + this.nombre + " está jugando");
    }

}