enum Unidad{
    centimetros,metros
}
public class Caja {
    private int ancho;
    private int alto;
    private int fondo;
    private Unidad unidad;
    private double volumen;
    public int getAncho() {
        return ancho;
    }
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    public int getAlto() {
        return alto;
    }
    public void setAlto(int alto) {
        this.alto = alto;
    }
    public int getFondo() {
        return fondo;
    }
    public void setFondo(int fondo) {
        this.fondo = fondo;
    }
    public Unidad getUnidad() {
        return unidad;
    }
    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }
    public Caja(){
        this.alto=20;
        this.ancho=20;
        this.fondo=20;
        this.unidad=unidad.centimetros;
    }
    public Caja(int ancho,int alto,int fondo,Unidad unidad,double volumen){
        this.alto=alto;
        this.ancho=ancho;
        this.fondo=fondo;
        this.unidad=unidad;
        this.volumen=volumen;
    }

    public double getVolumen(){
        this.volumen=this.alto*this.ancho*this.fondo;
        return volumen;
    }

    @Override
    public String toString(){
        return "ancho: "+this.ancho+"\n alto: "+this.alto+"\nfondo: "+this.fondo+"\nVolumen: "+this.volumen+"\nunidad: "+this.unidad+"\n";
    }

  
}

