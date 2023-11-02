package ClasePuntoComposicion;

public class Rectangulo {
    private Punto esquinaSuperiorIzquierda;
    private Punto esquinaInferiorDerecha;

    // Constructor de la clase Rectangulo que recibe dos objetos de tipo Punto
    public Rectangulo(Punto esquinaSuperiorIzquierda, Punto esquinaInferiorDerecha) {
        this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
        this.esquinaInferiorDerecha = esquinaInferiorDerecha;
    }

    // Métodos getter para obtener las esquinas del rectángulo
    public Punto getEsquinaSuperiorIzquierda() {
        return esquinaSuperiorIzquierda;
    }

    public Punto getEsquinaInferiorDerecha() {
        return esquinaInferiorDerecha;
    }

    public int calcularAltura() {
        int altura = esquinaInferiorDerecha.getY() - esquinaSuperiorIzquierda.getY();
        return Math.abs(altura); // Devolvemos el valor absoluto de la altura para evitar resultados negativos
    }

    // Método para calcular el área del rectángulo
    public int calcularArea() {
        int ancho = calcularAncho();
        int altura = calcularAltura();
        int area = ancho * altura;
        return area;
    }

    // Método para verificar si el rectángulo es cuadrado
    public boolean esCuadrado() {
        int ancho = calcularAncho();
        int altura = calcularAltura();
        return ancho == altura;
    }

    public int calcularAncho() {
        int ancho = esquinaInferiorDerecha.getX() - esquinaSuperiorIzquierda.getX();
        return Math.abs(ancho); // Devolvemos el valor absoluto del ancho para evitar resultados negativos
    }

}
