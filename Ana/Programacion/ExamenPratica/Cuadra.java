package ExamenPratica;

import javax.crypto.Cipher;
import java.util.*;

public class Cuadra {
    String CIF = "";
    String nombre = "";
    String residencia = "";
    ArrayList<Caballos> residentes;

    public Cuadra(String cif, String nombre, String residencia) {
        this.CIF = cif;
        this.nombre = nombre;
        this.residencia = residencia;
        this.residentes = new ArrayList<>();
    }

    public Cuadra(String CIF, String nombre, String residencia, ArrayList<Caballos> residentes) {
        this(CIF, nombre, residencia);
        this.residentes = residentes;
    }

    // Constructor por defecto
    public Cuadra() {
        this("12345678Z", "La Cuadra", "Almería");
    }

    // Constructor copia

    // Métodos de clase
    public String getCIF() {
        return this.CIF;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getResidencia() {
        return this.residencia;
    }

    public void setResidentes(ArrayList<Caballos> residentes) {
        this.residentes = residentes;
    }

    public ArrayList<Caballos> getResidentes() {
        return this.residentes;
    }

    public Caballos getResidente(int posicion) {
        return this.residentes.get(posicion);
    }

    @Override
    public String toString() {
        return "CIF:\t" + this.CIF + "\nNombre:\t" + this.nombre + "\nResidencia:\t" + this.residencia + "\n";

    }
}
