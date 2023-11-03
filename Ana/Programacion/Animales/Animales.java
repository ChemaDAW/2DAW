package Animales;

public class Animales {
    // Atributos
    protected static Sexo sexo;
    private static int cantidadAnimales = 0;

    // Constructores
    public Animales() {
        sexo = Sexo.MACHO;
        this.cantidadAnimales++;
    }

    public Animales(Sexo sexo) {
        sexo = Sexo.MACHO;
        this.cantidadAnimales++;
    }

    // Metodos
    public void duerme() {
        System.out.println("ZzZzZzZzZzZzZ");
    }

    // Getter y Setters
    public Sexo getSexo() {
        return this.sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public int getCantidadAnimales() {
        return this.cantidadAnimales;
    }

}