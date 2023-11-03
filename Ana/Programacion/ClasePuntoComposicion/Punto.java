package ClasePuntoComposicion;

public class Punto {

    private int x;
    private int y;

    public Punto() {
        x = 0;
        y = 0;
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void desplazarXY(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public void desplazarX(int x) {
        this.x += x;
    }

    public void desplazarY(int y) {
        this.y += y;
    }

    @Override
    public String toString() {
        return "x:\t:" + this.x + "\nY:\t" + this.y;
    }

    // Getters y Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}