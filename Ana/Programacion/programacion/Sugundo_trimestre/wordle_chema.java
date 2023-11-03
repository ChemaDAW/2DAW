
import java.util.Scanner;

public class wordle_chema {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabraSecreta, palabraIntento;
        boolean acertado = false;
        int longitudPalabra;
        String[] palabras1 = {
                "agua",
                "aire",
                "alma",
                "amor",
                "arte",
                "bien",
                "boca",
                "boda",
                "bola",
                "brazo",
                "cama",
                "casa",
                "café",
                "calor",
                "cama",
                "cara",
                "carne",
                "carta",
                "causa",
                "cielo",
                "clase",
                "color",
                "corte",
                "cruce",
                "cuero",
                "cuerpo",
                "dar",
                "día",
                "dibujo",
                "diente",
                "dinero",
                "dolor",
                "duda",
                "eje",
                "energía",
                "espada",
                "espejo",
                "estado",
                "estilo",
                "fama",
                "faro",
                "fase",
                "fe",
                "felicidad",
                "fiesta",
                "flor",
                "foco",
                "fuego",
                "fuente",
                "gana",
                "gota",
                "grano",
                "grupo",
                "guerra",
                "gusto",
                "hecho",
                "hielo",
                "hijo",
                "honor",
                "idea",
                "imagen",
                "inicio",
                "insecto",
                "juego",
                "lado",
                "luz",
                "maíz",
                "mano",
                "miedo",
                "mesa",
                "meta",
                "milagro",
                "mundo",
                "nación",
                "nariz",
                "naturaleza",
                "navío",
                "noche",
                "nube",
                "nudo",
                "nuevo",
                "ojo",
                "onda",
                "oro",
                "paciencia",
                "pago",
                "paz",
                "pelo",
                "pensar",
                "peor",
                "pequeño",
                "perro",
                "peso",
                "pie",
                "piel",
                "placer",
                "poder",
                "poema",
                "polvo",
                "puerta",
                "punto",
                "querer",
                "quien",
                "razón",
                "red",
                "regla",
                "retorno",
                "rey",
                "riesgo",
                "ropa",
                "rosa",
                "saber",
                "sangre",
                "seco",
                "señal",
                "ser",
                "siete",
                "siglo",
                "silla",
                "sol",
                "sonido",
                "suelo",
                "techo",
                "tema",
                "tiempo",
                "tinta",
                "título",
                "torre",
                "trabajo",
                "tradición",
                "traje",
                "trigo",
                "turismo",
                "uno",
                "uso",
                "valor",
                "vida",
                "vino",
                "visión",
                "voz",
                "yoga",
                "zona" };
        int numPalabraSecreta = (int) (Math.random() * 100 + 1);
        palabraSecreta = palabras1[numPalabraSecreta];
        palabraSecreta.toLowerCase();
        longitudPalabra = palabraSecreta.length();
        int intentos = longitudPalabra;
        System.out.println(
                "La palabra secreta tiene " + longitudPalabra + " ,no introduzcas palabras de mas,tienes " + intentos);
        while (intentos != 0) {
            System.out.println("INTENTOS = " + intentos);
            do {
                System.out.print("Ingresa tu intento: ");
                palabraIntento = teclado.next().toLowerCase();
            } while (palabraIntento.length() != longitudPalabra);

            if (palabraIntento.equals(palabraSecreta)) {
                System.out.println("¡Felicidades, has acertado la palabra secreta!");
                acertado = true;
                break;// Este break es para que termine de preguntar si acierta palabra (POR JAIRO E
                      // ISMAEL, DE NADA TT)
            } else {
                for (int i = 0; i < palabraIntento.length(); i++) {
                    if (palabraIntento.charAt(i) == palabraSecreta.charAt(i)) {
                        System.out.print("\u001B[32m" + palabraIntento.charAt(i) + "\u001B[0m");
                    } else if (palabraSecreta.contains(String.valueOf(palabraIntento.charAt(i)))) {
                        System.out.print("\u001B[33m" + palabraIntento.charAt(i) + "\u001B[0m");
                    } else {
                        System.out.print("\u001B[31m" + palabraIntento.charAt(i) + "\u001B[0m");
                    }
                }
                System.out.println("");
            }
            intentos--;
        }
        System.out.println("La palabra secreta era " + palabraSecreta);

        teclado.close();
    }
}
