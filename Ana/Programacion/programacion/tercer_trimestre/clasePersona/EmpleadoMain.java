package clasePersona;

public class EmpleadoMain {
    public static void main(String[] args) {
        int incremento = 100;
        Empleado p;
        p = new Empleado();
        Empleado p2;
        p2 = new Empleado("chema", 18, 1.82, "485664566W", 158);
        System.out.println(p.nombre);
        System.out.println(p.edad);
        System.out.println(p.estatura);
        System.out.println(p.salario);

        p.incrementarSalario(incremento);
        p.saludar();
        p.cumplirEdad();
        System.out.println("\nSALARIO INCREMENTADO EN 100\n");
        System.out.println(p.salario);

        System.out.println(p2.nombre);
        System.out.println(p2.edad);
        System.out.println(p2.estatura);
        System.out.println(p2.salario);

        p2.incrementarSalario(incremento);
        p2.saludar();
        p2.cumplirEdad();
        System.out.println("\nSALARIO INCREMENTADO EN 100\n");
        System.out.println(p2.salario);

    }
}
