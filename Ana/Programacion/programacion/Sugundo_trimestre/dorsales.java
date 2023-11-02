import java.util.ArrayList;
import java.util.Scanner;
public class dorsales
public class Main {

static ArrayList<Integer> dorsalList = new ArrayList<>();
static ArrayList<Integer> menorEdadList = new ArrayList<>();
static ArrayList<Integer> positivoDopajeList = new ArrayList<>();
static ArrayList<Integer> noPagadoList = new ArrayList<>();

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Introduzca el dorsal de cada corredor cuando llegue a la meta (introduzca -1 para indicar que la carrera ha finalizado):");
int dorsal = sc.nextInt();
while (dorsal != -1) {
dorsalList.add(dorsal);
dorsal = sc.nextInt();
}

System.out.println("Introduzca los dorsales de los corredores menores de edad (-1 para finalizar):");
int menorEdad = sc.nextInt();
while (menorEdad != -1) {
  int index = dorsalList.indexOf(menorEdad);
  dorsalList.remove(index);
  dorsalList.add(index - 1, menorEdad);
  menorEdad = sc.nextInt();
}

System.out.println("Introduzca los dorsales de los corredores que han dado positivo en el test antidopaje (-1 para finalizar):");
int positivoDopaje = sc.nextInt();
while (positivoDopaje != -1) {
  dorsalList.remove(new Integer(positivoDopaje));
  positivoDopaje = sc.nextInt();
}

System.out.println("Introduzca los dorsales de los corredores que no han pagado su inscripcion (-1 para finalizar):");
int noPagado = sc.nextInt();
while (noPagado != -1) {
  dorsalList.remove(new Integer(noPagado));
  dorsalList.add(noPagado);
  noPagado = sc.nextInt();
}

System.out.println("Los dorsales de los corredores que han conseguido las medallas de oro, plata y bronce son:");
System.out.println("Oro: " + dorsalList.get(0));
System.out.println("Plata: " + dorsalList.get(1));
System.out.println("Bronce: " + dorsalList.get(2));
}
}