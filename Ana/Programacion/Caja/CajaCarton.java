
public class CajaCarton extends Caja {
    private int superficie;
    public CajaCarton(){ 
        super();
        calcularSuperficie();
    }
    public CajaCarton(int ancho,int alto,int fondo,Unidad unidad,double volumen){
        super(ancho, alto, fondo, unidad, volumen);
        super.getVolumen();
        calcularSuperficie();
    }

    public void calcularSuperficie(){
        this.superficie=2*getFondo()*getAlto();
        this.superficie=this.superficie+2*getFondo()*getAlto();
        this.superficie=this.superficie+2*getAlto()*getAncho();
    }

    @Override
    public String toString(){
        return super.toString()+"superficie: "+this.superficie;
    }


}
