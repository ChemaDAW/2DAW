//melendi(saiko)
package claseEmisora;

import java.util.*;

public class Emisora {
    double sintonizador;

    // METODOS DE LA CLASE
    public void subirEmisora(double sintonizador) {
        this.sintonizador += 0.5;
        rango();
    }

    public void bajarEmisora(double sintonizador) {
        this.sintonizador -= 0.5;
        rango();
    }

    public void informacion() {
        System.out.println("Estas en el " + this.sintonizador + " fm");
    }

    private void rango() {
        if (this.sintonizador == 108.5) {
            this.sintonizador = 80;
        }
        if (this.sintonizador == 79.5) {
            this.sintonizador = 108;
        }
    }

    public boolean compararEmisoras(Emisora chema2, Emisora chema) {
        return chema.sintonizador == chema2.sintonizador;
    }

    // CONSTRUCTORES DE LA CLASE
    public Emisora() {
        this.sintonizador = 80;
    }

    public Emisora(double mhz) {
        this.sintonizador = mhz;
    }

}
