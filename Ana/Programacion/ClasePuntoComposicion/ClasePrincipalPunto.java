package ClasePuntoComposicion;

import javax.sql.rowset.spi.SyncResolver;

public class ClasePrincipalPunto {
    public static void main(String[] args) {
        Punto ejemplo = new Punto(5, 3);
        Punto ejemplo1 = new Punto(4, 2);
        System.out.println(ejemplo.toString());
        System.out.println("Incrementando X y Y");
        ejemplo.desplazarXY(2, 3);
        System.out.println(ejemplo.toString());

        System.out.println("Incrementando X ");
        ejemplo.desplazarX(2);
        System.out.println(ejemplo.toString());

        System.out.println("Incrementando Y");
        ejemplo.desplazarY(3);
        System.out.println(ejemplo.toString());

        Rectangulo rectangulo = new Rectangulo(ejemplo, ejemplo1);
        int altura = rectangulo.calcularAltura();
        System.out.println("Altura del rectángulo: " + altura);

        // Calculamos y mostramos el área del rectángulo
        int area = rectangulo.calcularArea();
        System.out.println("Área del rectángulo: " + area);

        // Verificamos si el rectángulo es cuadrado
        boolean esCuadrado = rectangulo.esCuadrado();
        if (esCuadrado) {
            System.out.println("El rectángulo es cuadrado.");
        } else {
            System.out.println("El rectángulo no es cuadrado.");
        }
    }
}
