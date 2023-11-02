package Animales;

public class Perro extends Mamiferos {
    private Raza raza;

    public Perro() {
        this.sexo = Sexo.HEMBRA;
        this.raza = Raza.SIAMES;
        this.tipo = "tierra";
    }

    public Perro(Raza raza) {
        this.sexo = Sexo.HEMBRA;
        this.raza = raza;
        this.tipo = "tierra";
    }

    public Perro(Sexo sexo) {
        this.sexo = sexo;
        this.tipo = "tierra";
        raza = Raza.SIAMES;
    }

    public Perro(Sexo sexo, Raza raza) {
        super(sexo);
        this.raza = raza;
        this.tipo = "tierra";
    }

    @Override
    public String toString() {
        return "tipo " + this.tipo;
    }

    public void ladrar() {
        System.out.println("guau");
    }

    public void grunnir() {
        System.out.println("aaaarrrrrrrrrrr");
    }

    public void comer(String comida) {
        if (comida == "pienso") {
            System.out.println("Esta buena");
        } else {
            System.out.println("no me gusta");
        }
    }

    public void jugarCon(Perro jugaPerro) {
        if (this.sexo == Sexo.MACHO && jugaPerro.sexo == Sexo.MACHO) {
            System.out.println("juegan");
        } else {
            System.out.println("no juegan");
        }
    }
}
