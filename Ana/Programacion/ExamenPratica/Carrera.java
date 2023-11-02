package ExamenPratica;

import java.util.*;

public class Carrera {
    String fecha = "";
    ArrayList<Caballos> participantes = new ArrayList<>();
    String lugar = "";

    public Carrera() {
        this.fecha = "32/32/32";
        this.fecha = "Almeria";
    }

    public Carrera(String fecha, String lugar) {
        this.fecha = fecha;
        this.lugar = lugar;
    }

    // GETTERS Y SETTERS
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public ArrayList<Caballos> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Caballos> participantes) {
        this.participantes = participantes;
    }
}
