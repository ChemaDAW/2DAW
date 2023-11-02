public class EcuacionSegundoGrado {
    private double a;
    private double b;
    private double c;
 
    public EcuacionSegundoGrado(double a, double b, double c) {
       this.a = a;
       this.b = b;
       this.c = c;
    }
 
    public void resolver() {
       double discriminante = Math.pow(b, 2) - 4 * a * c;
       if (discriminante < 0) {
          System.out.println("La ecuación no tiene solución real.");
       } else {
          double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
          double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
          System.out.println("Las soluciones de la ecuación son x1 = " + x1 + " y x2 = " + x2);
       }
    }
 }
 