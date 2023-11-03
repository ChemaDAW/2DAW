import java.util.ArrayList;

public class SistemaGestionEmpleados {
    static ArrayList<Empleado> ArrayEmpleado = new ArrayList<>();

    public static void main(String[] args) {
        Empleado carlos = new Empleado("hola", 19, 1000);
        Empleado carlos2 = new Empleado("Chema", 18, 1800);
        Director jairo = new Director("jairo", 18, 3000, 10.32, "Informatica");
        Gerente angel = new Gerente("Angel", 20, 1800, "Marketing");
        AgregarEmpleado(carlos);
        AgregarEmpleado(carlos2);
        AgregarEmpleado(jairo);
        AgregarEmpleado(angel);
        CalcularSalarioTotal();
        CalcularSalarioPromedio();
    }

    static public void AgregarEmpleado(Empleado empleado) {
        ArrayEmpleado.add(empleado);
    }

    static public void CalcularSalarioTotal() {
        int salarioTotal = 0;
        for (int i = 0; i < ArrayEmpleado.size(); i++) {
            salarioTotal += ArrayEmpleado.get(i).getSalario();
        }
        System.out.println("El salario total es de: " + salarioTotal);
    }

    static public void CalcularSalarioPromedio() {
        int salarioTotal = 0;
        for (int i = 0; i < ArrayEmpleado.size(); i++) {
            salarioTotal += ArrayEmpleado.get(i).getSalario();
        }
        int salarioPromedio = salarioTotal / ArrayEmpleado.size();
        System.out.println("La media de salario es: " + salarioPromedio);
    }
}
