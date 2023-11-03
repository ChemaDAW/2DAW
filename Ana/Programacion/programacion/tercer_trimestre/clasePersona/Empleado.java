package clasePersona;

public class Empleado extends Persona {
    double salario;

    public Empleado() {
        super();
        this.salario = 1000;
    }

    public Empleado(String nombre, int edad, double estatura, String dni, double salario) {
        super(nombre, edad, estatura, dni);
        this.salario = salario;
    }

    // METODOS
    void incrementarSalario(int incremento) {
        this.salario += incremento;
    }

}
