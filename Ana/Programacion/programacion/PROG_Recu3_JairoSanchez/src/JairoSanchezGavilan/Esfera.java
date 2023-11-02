// Jairo Sánchez Gavilán 1º DAW
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JairoSanchezGavilan;

/**
 *
 * @author Jairo
 */
class Esfera {

    public Punto punto; // Relación de Composición dado que una ESFERA TIENE UN PUNTO
    float perimetro;
    float area;
    float radio;

    public Esfera() {
        this.perimetro = 0;
        this.area = 0;
    }

    public Esfera(Punto punto, float radio) {
        this.punto = punto;
        this.radio = radio;
    }

    public Punto getPunto() {
        return punto;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }

    public float obtenerPerimetro() {
        this.perimetro = 2 * (float) Math.PI * this.radio;
        return this.perimetro;
    }

    public float obtenerArea() {
        this.area = 4 * (float) Math.PI * (float) Math.pow(this.radio, 2);
        return this.area;
    }

    public void compararEsfera(Esfera esfera) {
        boolean iguales = false;
        double d = 0;
        double diferenciaCoordenadaX;
        double diferenciaCoordenadaY;

        diferenciaCoordenadaX = Math.pow(this.punto.getCoordenadaX() - esfera.getPunto().getCoordenadaX(), 2);
        diferenciaCoordenadaY = Math.pow(this.punto.getCoordenadaY() - esfera.getPunto().getCoordenadaY(), 2);
        d = Math.sqrt(diferenciaCoordenadaX + diferenciaCoordenadaY);
        if (d == this.radio + esfera.radio) {
            System.out.println("Se cortan en 1 punto");
        }
        if (d < this.radio + esfera.radio) {
            System.out.println("Se cortan en 2 puntos");
        }
        if (d > this.radio + esfera.radio) {
            System.out.println("No se cortan ");
        }
    }

    @Override
    public String toString() {
        return "Esfera{" + "punto=" + punto + ", perimetro=" + perimetro + ", area=" + area + ", radio=" + radio + '}';
    }

}
