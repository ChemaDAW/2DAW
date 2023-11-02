import java.util.Random;
import java.util.Scanner;

public class Roulette {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int balance = 10000;
        int bet;
        int guess;
        int result;

        while (balance > 0) {
            System.out.println("Tienes: " + balance + "$");
            System.out.println("Cuanto quieres apostar: ");
            bet = scan.nextInt();

            if (bet > balance) {
                System.out.println("No tienes tanto dinero. Dale otra vez.");
                continue;
            }

            System.out.println("Introduce al numero que quieres apostar (0-36): ");
            guess = scan.nextInt();

            result = random.nextInt(37);
            System.out.println("La bola a caido en el : " + result);

            if (guess == result) {
                balance += bet * 36;
                System.out.println("Que clase has ganado " + bet * 36 + "$");
            } else {
                balance -= bet;
                System.out.println("has perdido " + bet + "$");
            }
        }
        System.out.println("No tienes mas dinero");
    }
}