import java.util.Scanner;
import java.util.Arrays;

public class SecretCamaraGame {
    Scanner keyboard = new Scanner(System.in);

    public static void main(String args[]) {
        menu();
    }

    public static void menu() {
        Scanner keyboard = new Scanner(System.in);
        int menuOption;
        boolean quit = false;
        char quitOption;

        while (!quit) {
            System.out.println("1. Play Secret Camera Game");
            System.out.println("2. Quit");
            System.out.println("Choose an option: ");
            menuOption = keyboard.nextInt();

            switch (menuOption) {
                case 1:
                    playSecretCameraGame();
                    break;
                case 2:
                    System.out.println("Are you sure you want to quit? (y/n)");
                    quitOption = keyboard.next().charAt(0);
                    if (quitOption == 'y' || quitOption == 'Y')
                        quit = true;
                    break;
                default:
                    System.out.println("Please choose a valid option (1-2)");
            }
        }
        keyboard.close();
    }

    public static void playSecretCameraGame() {
        Scanner keyboard = new Scanner(System.in);
        int length;
        int randomNumber;
        int userNumber;
        int attempts = 0;

        System.out.println("What length do you want the combination to be?");
        length = keyboard.nextInt();
        int secretCombination[] = new int[length];
        int userCombination[] = new int[length];

        for (int i = 0; i < secretCombination.length; i++) {
            randomNumber = (int) (Math.random() * 5 + 1);
            secretCombination[i] = randomNumber;
        }

        do {
            for (int j = 0; j < length; j++) {
                System.out.println("Enter number " + (j + 1) + " of the combination (1-5)");
                userNumber = keyboard.nextInt();
                userCombination[j] = userNumber;
            }

            for (int f = 0; f < secretCombination.length; f++) {
                if (userCombination[f] == secretCombination[f]) {
                    System.out.println("You have guessed the number " + userCombination[f] + " at position " + f);
                }
                if (userCombination[f] < secretCombination[f]) {
                    System.out.println("The number " + userCombination[f] + " at position " + f + " is lower");
                }
                if (userCombination[f] > secretCombination[f]) {
                    System.out.println("The number " + userCombination[f] + " at position " + f + " is higher");
                }
            }
            attempts++;
        } while (attempts < 4);

        if (Arrays.equals(secretCombination, userCombination))
            System.out.println("You have guessed the secret combination!");
        else
            System.out.println("You have not guessed the secret combination");

        ;
    }
}