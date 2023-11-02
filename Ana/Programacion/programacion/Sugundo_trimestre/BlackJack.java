import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> playerCards = new ArrayList<>();
    static ArrayList<Integer> dealerCards = new ArrayList<>();

    public static void main(String[] args) {
        // Distribuir cartas iniciales
        playerCards.add(getRandomCard());
        dealerCards.add(getRandomCard());
        playerCards.add(getRandomCard());
        dealerCards.add(getRandomCard());

        // Mostrar mano inicial del jugador
        System.out.println("Tus cartas son: " + playerCards);
        System.out.println("La carta visible del crupier es: " + dealerCards.get(0));

        // Jugador toma una decisiÃ³n
        System.out.println("Quieres pedir ota carta (1) o plantarte (2)?");
        int choice = sc.nextInt();
        while (choice == 1) {
            playerCards.add(getRandomCard());
            System.out.println("Tus cartas son ahora: " + playerCards);
            if (getHandValue(playerCards) > 21) {
                System.out.println("Lo siento, has perdido.");
                return;
            }
            System.out.println("Quieres pedir otra carta (1) o plantarte (2)?");
            choice = sc.nextInt();
        }

        // Mostrar mano completa del crupier
        System.out.println("Las cartas completas del crupier son: " + dealerCards);
        while (getHandValue(dealerCards) < 17) {
            dealerCards.add(getRandomCard());
            System.out.println("Las cartas del crupier ahora son: " + dealerCards);
        }

        // Determinar ganador
        int playerValue = getHandValue(playerCards);
        int dealerValue = getHandValue(dealerCards);
        if (dealerValue > 21) {
            System.out.println("Felicidades, has ganado!");
        } else if (playerValue > dealerValue) {
            System.out.println("Felicidades, has ganado!");
        } else if (playerValue == dealerValue) {
            System.out.println("Es un empate.");
        } else {
            System.out.println("Lo siento, has perdido.");
        }
    }

    public static int getRandomCard() {
        return (int) (Math.random() * 10 + 1);
    }

    public static int getHandValue(ArrayList<Integer> hand) {
        int total = 0;
        for (int card : hand) {
            total += card;
        }
        return total;
    }
}