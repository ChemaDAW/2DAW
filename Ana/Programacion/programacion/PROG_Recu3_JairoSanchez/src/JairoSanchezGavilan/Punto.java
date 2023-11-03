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
class Punto {
    
    
    public float coordenadaX = 0;
    public float coordenadaY = 0;

    public Punto() {
    }
    public Punto(float coordenadaX,float coordenadaY){
    
    this.coordenadaX = coordenadaX;
    this.coordenadaY = coordenadaY;
    
    }

    public float getCoordenadaX() {
        return coordenadaX;
    }

    public float getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaX(float coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public void setCoordenadaY(float coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    @Override
    public String toString() {
        return "Punto: " + "coordenadaX = " + this.coordenadaX + " coordenadaY = " + this.coordenadaY ;
    }
    
}
