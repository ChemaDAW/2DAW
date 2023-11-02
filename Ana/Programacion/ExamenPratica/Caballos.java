package ExamenPratica;

import java.util.*;

public class Caballos {
    String nombre = "";
    String jinete = "";

    public Caballos() {
        this.nombre = "Fairy";
        this.jinete = "Chema";
    }

    public Caballos(String nombre, String jinete) {
        this.nombre = nombre;
        this.jinete = jinete;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getJinete() {
        return jinete;
    }

    public void setJinete(String jinete) {
        this.jinete = jinete;
    }

}
