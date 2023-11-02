import java.util.Scanner;

public class Wordle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = { "palabra1", "palabra2", "palabra3" };
        int randomIndex = (int) (Math.random() * words.length);
        String secretWord = words[randomIndex];
        char[] secretWordArray = secretWord.toCharArray();
        char[] progress = new char[secretWord.length()];
        for (int i = 0; i < progress.length; i++) {
            progress[i] = '_';
        }
        int tries = 0;
        while (tries < 10) {
            System.out.print("Adivina una letra: ");
            char guess = sc.next().charAt(0);
            boolean correctGuess = false;
            for (int i = 0; i < secretWordArray.length; i++) {
                if (secretWordArray[i] == guess) {
                    progress[i] = guess;
                    correctGuess = true;
                }
            }
            if (correctGuess) {
                System.out.println("Correcto!");
                System.out.println(progress);
            } else {
                System.out.println("Incorrecto.");
                tries++;
                System.out.println("Tienes " + (10 - tries) + " intentos restantes.");
            }
            if (!new String(progress).contains("_")) {
                System.out.println("Felicidades! Adivinaste la palabra: " + secretWord);
                break;
            }
        }
        if (tries == 10) {
            System.out.println("Lo siento, agotaste todos tus intentos. La palabra era: " + secretWord);
        }
    }
}