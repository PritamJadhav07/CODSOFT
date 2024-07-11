import java.util.*;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Random num = new Random();
        int answer = num.nextInt(100) + 1;
        System.out.println("Enter a number between 1 and 100 as guess: ");
        Scanner input = new Scanner(System.in);
        int guess;
        String playAgain;

        guess = input.nextInt();
        do {
            if (guess == answer) {
                System.out.println("Congrats");
                break;
            } else if (guess > answer) {
                System.out.println("Too high, Try Again: ");
                guess = input.nextInt();
            } else if (guess < answer) {
                System.out.println("Too low, Try Again: ");
                guess = input.nextInt();
            }

        } while (guess != answer);

        System.out.println("Congratulations, You guessed the number!");
        System.out.println("Would you like to play again? Enter Y to play or any other key to quit: ");
        playAgain = input.nextLine();
        if (playAgain == "Y" || playAgain == "y") {
            System.out.println("Enter a number between 1 and 10 as your first guess: ");
            guess = input.nextInt();
        }

    }
}