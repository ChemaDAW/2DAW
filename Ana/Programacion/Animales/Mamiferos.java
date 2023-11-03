package Animales;

public class Mamiferos extends Animales {
    String tipo;

    // Constructores
    public Mamiferos() {
        super(Sexo.MACHO);
        this.tipo = "tierra";
    }

    public Mamiferos(Sexo sexo, String tipomamifero) {
        super(sexo);
        this.tipo = tipomamifero;
    }

    public Mamiferos(Sexo sexo) {
        super(sexo);
        this.tipo = "tierra";
    }

    public void duerme() {
        super.duerme();
    }

    public void comer(String comida) {
        comida.toLowerCase();
        if (this.tipo != "acuatico" && comida != "algas") {
            System.out.println("que rica");
        } else {
            if (this.tipo == "acuatico" && comida == "algas") {
                System.out.println("mmm que rico");
            } else {
                System.out.println("No me gusta");
            }
        }
    }

    public void nadar() {
        if (this.tipo == "acuatico") {
            System.out.println("Estoy preparado para nadar");
        } else {
            System.out.println("No se nadar");
        }
    }

    public void correr() {
        if (this.tipo != "acuatico") {
            System.out.println("Estoy preparado para correr");
        } else {
            System.out.println("No se correr");
        }
    }
    public Mamifero(Mamifero mamifero) {
        this.sexo = otro.sexo;
        this.tipo = otro.tipo;
    }

}